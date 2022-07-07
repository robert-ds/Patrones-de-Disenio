package adapter.creditapi.banky;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/7/22
 * Time: 4:24 p. m.
 */

public class YBankCreditApprove {

  public String name;
  public float credit;

  // Getters and Setters

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public float getCredit() {
    return credit;
  }

  public void setCredit(float credit) {
    this.credit = credit;
  }
}
