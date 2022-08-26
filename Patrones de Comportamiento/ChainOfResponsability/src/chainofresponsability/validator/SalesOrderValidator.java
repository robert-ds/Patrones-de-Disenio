package chainofresponsability.validator;

import chainofresponsability.domain.order.AbstractOrder;
import chainofresponsability.domain.order.SalesOrder;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:46 p. m.
 */

public class SalesOrderValidator extends AbstractOrderValidator{
  @Override
  public void validate(AbstractOrder order) throws ValidationException {

    if(!(order instanceof SalesOrder)){
      throw new ValidationException("Se esperaba una orden de venta");
    }

    for(AbstractOrderValidator validator: validators){
      validator.validate(order);
    }

  }
}
