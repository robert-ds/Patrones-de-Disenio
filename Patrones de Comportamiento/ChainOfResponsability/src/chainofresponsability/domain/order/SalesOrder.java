package chainofresponsability.domain.order;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:40 p. m.
 */

public class SalesOrder extends AbstractOrder{

  protected Calendar deliveryDate;

  public Calendar getDeliveryDate(){
    return deliveryDate;
  }

  public void setDeliveryDate(Calendar deliveryDate){
    this.deliveryDate = deliveryDate;
  }

}
