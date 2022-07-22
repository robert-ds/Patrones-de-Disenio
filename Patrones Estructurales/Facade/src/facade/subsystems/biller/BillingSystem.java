package facade.subsystems.biller;

import facade.util.Customer;
import facade.util.OnMemoryDataBase;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/7/22
 * Time: 2:36 p. m.
 */

public class BillingSystem {

  public double queryCustomerBalance(Long customerId){
    Customer customer = OnMemoryDataBase.findCustomerById(customerId);
    return customer.getBalance();
  }

  public double pay(BillingPayRequest billingPay){
    Customer customer = OnMemoryDataBase.findCustomerById(billingPay.getCustomerId());
    customer.setBalance(customer.getBalance() - billingPay.getAmount());
    System.out.println("Pago aplicado al cliente " + customer.getName() + "," + " el nuevo saldo es " +  customer.getBalance() + "");
    return customer.getBalance();
  }

}
