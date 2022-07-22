package facade.subsystems.bank;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/7/22
 * Time: 2:33 p. m.
 */

public class TransferRequest {

  private double ammount;
  private String cardNumber;
  private String cardName;
  private String cardExpDate;
  private String cardSecureNum;

  // Cosntruct
  public TransferRequest(double ammount, String cardNumber, String cardName, String cardExpDate, String cardSecureNum){
    this.ammount = ammount;
    this.cardNumber = cardNumber;
    this.cardName = cardName;
    this.cardExpDate = cardExpDate;
    this.cardSecureNum = cardSecureNum;
  }

  // Getters and Setters
  public double getAmmount(){
    return this.ammount;
  }

  public void setAmmount(double ammount){
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
