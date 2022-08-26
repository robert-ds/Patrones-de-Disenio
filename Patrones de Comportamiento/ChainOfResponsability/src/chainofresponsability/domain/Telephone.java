package chainofresponsability.domain;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:38 p. m.
 */

public class Telephone {
  private String lada;
  private String number;
  private String ext;

  // Getters and Setters

  public String getLada(){
    return this.lada;
  }

  public void setLada(String lada){
    this.lada = lada;
  }

  public String getNumber(){
    return this.number;
  }

  public void setNumber(String number){
    this.number = number;
  }

  public String getExt(){
    return this.ext;
  }

  public void setExt(String ext){
    this.ext = ext;
  }


}
