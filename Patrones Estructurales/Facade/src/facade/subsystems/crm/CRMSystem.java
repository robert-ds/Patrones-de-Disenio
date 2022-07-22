package facade.subsystems.crm;

import facade.util.Customer;
import facade.util.OnMemoryDataBase;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/7/22
 * Time: 2:37 p. m.
 */

public class CRMSystem {

  public Customer findCustomer(Long customerId){
    return OnMemoryDataBase.findCustomerById(customerId);
  }

}
