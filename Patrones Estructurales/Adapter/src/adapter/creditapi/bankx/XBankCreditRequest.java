package adapter.creditapi.bankx;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/7/22
 * Time: 4:22 p. m.
 */

public class XBankCreditRequest {

  private String customerName;
  private double requestAmount;

  // Getters and Setters

  public String getCustomerName(){
    return customerName;
  }

  public void setCustomerName(String customerName){
    this.customerName = customerName;
  }

  public double getRequestAmount() {
    return requestAmount;
  }

  public void setRequestAmount(double requestAmount) {
    this.requestAmount = requestAmount;
  }
}
