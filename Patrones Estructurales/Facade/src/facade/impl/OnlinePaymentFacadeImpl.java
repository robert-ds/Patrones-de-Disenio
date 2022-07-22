package facade.impl;

import facade.subsystems.bank.BankSystem;
import facade.subsystems.bank.TransferRequest;
import facade.subsystems.biller.BillingPayRequest;
import facade.subsystems.biller.BillingSystem;
import facade.subsystems.crm.CRMSystem;
import facade.subsystems.email.EmailSystem;
import facade.util.Customer;
import facade.util.OnMemoryDataBase;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/7/22
 * Time: 2:30 p. m.
 */

public class OnlinePaymentFacadeImpl implements IPaymentFacade{

  private static final CRMSystem crmSystem = new CRMSystem();
  private static final BillingSystem billingSyste = new BillingSystem();
  private static final BankSystem bankSyste = new BankSystem();
  private static final EmailSystem emailSenderSystem = new EmailSystem();

  @Override
  public PaymentResponse pay(PaymentRequest paymentRequest) throws GeneralPaymentError {

    Customer customer = crmSystem.findCustomer(request.getCustomerId());

    // Validate Set
    if(customer == null){
      throw new GeneralPaymentError("El cliente con id " +  request.getCustomerId() + " no existe.");
    }else if("Baja".equals(customer.getStatus())){
      throw new GeneralPaymentError("El cliente con id "  + request.getCustomerId() + " está dado de Baja.");
    } else if (request.getAmmount() > billingSyste.queryCustomerBalance(customer.getId())) {
      throw new GeneralPaymentError("Se está intentando realiza un pago mayor al saldo del cliente");
    }

    // Pago bancario. Se realiza el cargo a la targeta.
    TransferRequest transfer = new TransferRequest(
        request.getAmmount(),request.getCardNumber(),
        request.getCardName(),request.getCardExpDate(),
        request.getCardNumber()
    );
    String payReference = bankSyste.transfer(transfer);

    // Afectación del saldo en el sistema de facturación
    BillingPayRequest billingRequest = new BillingPayRequest(
        request.getCustomerId(),request.getAmmount()
    );
    double newBlalance = billingSyste.pay(billingRequest);


    // El cliente se reactiva si el nuevo saldo es menor de 51$
    String newStatus = customer.getStatus();
    if(newBalance <= 50){
      OnMemoryDataBase.changeCustomerStatus(request.getCustomerId(), "Activo");
      newStatus = "Activo";
    }

    // Envio de la confirmación de pago por Email.
    HashMap<String,String> params = new HashMap<>();
    params.put("$name",customer.getName());
    params.put("$ammount",request.getAmmount() + "");
    params.put("$newBalance",newBalance + "");
    String number = request.getCardNumber();
    String subfix = number.substring(number.length() - 4, number.length());
    params.put("$cardNumber",subfix);
    params.put("$reference",payReference);
    params.put("$newStatus", newStatus);
    emailSenderSystem.sendEmail(params);

    return new PaymentResponse(payReference, newBalance, newStatus);

  }
}
