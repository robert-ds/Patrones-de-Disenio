package chainofresponsability.validator;

import chainofresponsability.domain.Product;
import chainofresponsability.domain.order.AbstractOrder;
import chainofresponsability.domain.order.OrderItem;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 26/8/22
 * Time: 3:44 p. m.
 */

public class OrderItemValidator extends AbstractOrderValidator{
  @Override
  public void validate(AbstractOrder order) throws ValidationException {
    List<OrderItem> orderItems = order.getOrderItems();

    for(OrderItem item: orderItems){
      Product product = item.getProduct();

      if(item.getQuantity() <= 0){
        throw new ValidationException("The product: " + product.getName() + " no tiene cantidad");
      }

      double listPrice = item.getProduct().getListPrice();
      double price = item.getPrice();
      double priceLimit = listPrice - (listPrice * 0.20d);

      if(price < priceLimit){
        throw new ValidationException("The price of the product" + product.getName() + " Sobrepasa el limite permitido");
      }

    }

  }
}
