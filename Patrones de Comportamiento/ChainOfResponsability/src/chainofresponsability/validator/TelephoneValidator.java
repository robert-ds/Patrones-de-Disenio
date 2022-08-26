package chainofresponsability.validator;

import chainofresponsability.domain.Telephone;
import chainofresponsability.domain.order.AbstractOrder;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:46 p. m.
 */

public class TelephoneValidator extends AbstractOrderValidator {
  @Override
  public void validate(AbstractOrder order) throws ValidationException {
    Telephone tel = order.getContributor().getTelephone();

    if(null == tel){
      throw new ValidationException("El Telefono del contribuyente es obligatorio");
    }else if(tel.getNumber().length() != 7){
      throw new ValidationException("Número de Teléfo invalido");
    }else if(tel.getLada().length() != 3){
      throw new ValidationException("Lada invalida");
    }

  }
}
