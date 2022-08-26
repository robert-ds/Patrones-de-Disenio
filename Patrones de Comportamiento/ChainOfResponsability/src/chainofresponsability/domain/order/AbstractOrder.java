package chainofresponsability.domain.order;

import chainofresponsability.domain.Contributor;
import java.util.Calendar;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:39 p. m.
 */

public abstract class AbstractOrder {

  private Calendar createDate;
  private Contributor contributor;
  private List<OrderItem> orderItems;

  public Calendar getCreateDate(){
    return createDate;
  }

  public double getTotal(){
    double total = 0d;
    for(OrderItem abstractOrderItem: orderItems){
      total += abstractOrderItem.getTotal();
    }
    return total;
  }

  // Getters and Setters


  public void setCreateDate(Calendar createDate) {
    this.createDate = createDate;
  }

  public Contributor getContributor() {
    return contributor;
  }

  public void setContributor(Contributor contributor) {
    this.contributor = contributor;
  }

  public List<OrderItem> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }
}
