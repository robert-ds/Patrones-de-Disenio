package chainofresponsability.validator;

import chainofresponsability.domain.Address;
import chainofresponsability.domain.order.AbstractOrder;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:41 p. m.
 */

public class AddressValidator extends AbstractOrderValidator{
  @Override
  public void validate(AbstractOrder order) throws ValidationException {
    Address address = order.getContributor().getAddress();

    if(address.getAddress1() == null || address.getAddress1().length() == 0){
      throw new ValidationException("La dirección 1 es obligatoria");
    }else if(address.getCP() == null || address.getCP().length() != 4){
      throw new ValidationException("El CP debe de ser de 4 dígitos");
    }else if(address.getCountry() == null || address.getCountry().length() == 0){
      throw new ValidationException("El paí es obligatorio");
    }
  }
}
