package chainofresponsability.validator;

import chainofresponsability.domain.CreditData;
import chainofresponsability.domain.order.AbstractOrder;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:42 p. m.
 */

public class CreditValidator extends AbstractOrderValidator{
  @Override
  public void validate(AbstractOrder order) throws ValidationException {
    double total = order.getTotal();

    CreditData creditData = order.getContributor().getCreditData();
    double newBalance = creditData.getBalance() + total;

    if(newBalance > creditData.getCreditLimit()){
      throw new ValidationException("El monto de la orden excede el limite de crédito disponible");
    }

  }
}
