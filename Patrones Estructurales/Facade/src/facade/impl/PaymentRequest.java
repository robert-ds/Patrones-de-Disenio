package facade.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/7/22
 * Time: 2:31 p. m.
 */

public class PaymentRequest {
  private Long customerId;
  private double ammount;
  private String cardNumber;
  private String cardName;
  private String cardExpDate;
  private String cardSecureNum;

  // Construct
  public PaymentRequest(){}

  // Getters and Setters
  public Long getCustomerId(){
    return this.customerId;
  }

  public void setCustomerId(Long customerId){
    this.customerId = customerId;
  }

  public double getAmmount() {
    return this.ammount;
  }

  public void setAmmount(double ammount) {
    this.ammount = ammount;
  }

  public String getCardNumber() {
    return this.cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCardName() {
    return this.cardName;
  }

  public void setCardName(String cardName) {
    this.cardName = cardName;
  }

  public String getCardExpDate() {
    return this.cardExpDate;
  }

  public void setCardExpDate(String cardExpDate) {
    this.cardExpDate = cardExpDate;
  }

  public String getCardSecureNum() {
    return this.cardSecureNum;
  }

  public void setCardSecureNum(String cardSecureNum) {
    this.cardSecureNum = cardSecureNum;
  }
  
}
