package facade.subsystems.biller;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/7/22
 * Time: 2:35 p. m.
 */

public class BillingPayRequest {

  private Long customerId;
  private double amount;

  // Construct
  public BillingPayRequest(Long customerId, double amount){
    this.customerId = customerId;
    this.amount = amount;
  }

  // Getters and Setters

  public Long getCustomerId(){
    return this.customerId;
  }

  public void setCustomerId(Long customerId){
    this.customerId = customerId;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
  
}
