package chainofresponsability.validator;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:45 p. m.
 */

public class OrderValidatorBuilder {

  public static final AbstractOrderValidator buildSalesOrderValidator(){
    AbstractOrderValidator validator = new SalesOrderValidator();
    validator.addValidator(buildCustomerValidator());
    validator.addValidator(new OrderItemValidator());
    validator.addValidator(new CreditValidator());
    return validator;
  }

  private static AbstractOrderValidator buildCustomerValidator(){
    AbstractOrderValidator validator = new CustomerValidator();
    validator.addValidator(buildContribuitorValidator());
    return validator;
  }

  private static AbstractOrderValidator buildContributorValidator(){
    AbstractOrderValidator validator = new ContribuitorValidator();
    validator.addValidator(AddressValidator());
    validator.addValidator(new TelephoneValidator());
    return validator;
  }


}
