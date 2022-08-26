package chainofresponsability.validator;

import chainofresponsability.domain.Customer;
import chainofresponsability.domain.order.AbstractOrder;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:43 p. m.
 */

public class CustomerValidator extends AbstractOrderValidator {
  @Override
  public void validate(AbstractOrder order) throws ValidationException {
    for(AbstractOrderValidator validator: validators){
      validator.validate(order);
    }

    if(!(order.getContributor() instanceof Customer)){
      throw new ValidationException("El contribuyente no es un cliente");
    }

  }
}
