package chainofresponsability.validator;

import chainofresponsability.domain.order.AbstractOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:41 p. m.
 */

public abstract class AbstractOrderValidator {

  protected List<AbstractOrderValidator> validators = new ArrayList<>();

  public abstract void validate(AbstractOrder order) throws ValidationException;

  public void addValidator(AbstractOrderValidator validator){
    validators.add(validator);
  }

}
