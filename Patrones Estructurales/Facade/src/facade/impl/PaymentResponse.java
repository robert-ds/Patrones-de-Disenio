package facade.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/7/22
 * Time: 2:32 p. m.
 */

public class PaymentResponse {
  private String paymentConfirmNumber;
  private double newBalance;
  private String customerStatus;

  public PaymentResponse(String paymentConfirmNumber, double newBalance, String customerStatus){
    this.paymentConfirmNumber = paymentConfirmNumber;
    this.newBalance = newBalance;
    this.customerStatus = customerStatus;
  }

  // Getters and Setters
  public String getPaymentConfirmNumber(){
    return this.paymentConfirmNumber;
  }

  public void setPaymentConfirmNumber(String paymentConfirmNumber){
    this.paymentConfirmNumber = paymentConfirmNumber;
  }

  public double getNewBalance() {
    return newBalance;
  }

  public void setNewBalance(double newBalance) {
    this.newBalance = newBalance;
  }

  public String getCustomerStatus() {
    return customerStatus;
  }

  public void setCustomerStatus(String customerStatus) {
    this.customerStatus = customerStatus;
  }
}
