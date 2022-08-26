package chainofresponsability.validator;

import chainofresponsability.domain.Contributor;
import chainofresponsability.domain.Status;
import chainofresponsability.domain.order.AbstractOrder;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:42 p. m.
 */

public class ContributorValidator extends AbstractOrderValidator {
  @Override
  public void validate(AbstractOrder order) throws ValidationException {
    for(AbstractOrderValidator validator: validators){
      validator.validate(order);
    }

    Contributor contributor = order.getContributor();
    if(Status.ACTIVO != contributor.getStatus()){
      throw new ValidationException("El contribuyente no está activo");
    }

  }
}
