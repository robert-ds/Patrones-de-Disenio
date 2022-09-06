package mediator.module.impl.dto;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/9/22
 * Time: 4:33 p. m.
 */

public class SaleOrder extends Sale{

  private String id;

  public SaleOrder(String id){
    this.id = id;
  }

  // Getters and Setters

  public String getId(){
    return this.id;
  }

  public void setId(String id){
    this.id = id;
  }

}
