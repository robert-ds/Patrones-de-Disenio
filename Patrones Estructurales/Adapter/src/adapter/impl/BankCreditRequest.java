package adapter.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/7/22
 * Time: 4:28 p. m.
 */

public class BankCreditRequest {
  private String customer;
  private double amount;

  // Getters and Setters

  public String getCustomer(){
    return customer;
  }

  public void setCustomer(String customer){
    this.customer = customer;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
}
