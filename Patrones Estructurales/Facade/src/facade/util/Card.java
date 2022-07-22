package facade.util;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/7/22
 * Time: 2:38 p. m.
 */

public class Card {
  private String prefix;
  private String company;
  private String cardType;

  // Construct
  public Card(String prefix, String company, String cardType){
    this.prefix = prefix;
    this.company = company;
    this.cardType = cardType;
  }

  // Getters and Setters
  public String getPrefix(){
    return this.prefix;
  }

  public void setPrefix(){
    this.prefix = prefix;
  }

  public String getCompany() {
    return this.company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getCardType() {
    return this.cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }
  
}
