package chainofresponsability.domain;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:35 p. m.
 */

public class CreditData {

  private double creditLimit;
  private double balance;

  // Getters and Setters

  public double getCreditLimit(){
    return this.creditLimit;
  }

  public void setCreditLimit(double creditLimit){
    this.creditLimit = creditLimit;
  }

  public double getBalance(){
    return this.balance;
  }

  public void setBalance(){
    this.balance = balance;
  }

}
