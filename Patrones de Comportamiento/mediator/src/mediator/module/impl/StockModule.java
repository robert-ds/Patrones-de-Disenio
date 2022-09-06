package mediator.module.impl;

import mediator.module.AbstractModule;
import mediator.module.ModuleMessage;
import mediator.module.impl.dto.Product;
import mediator.module.impl.dto.ProductRequest;
import mediator.module.impl.dto.SaleOrder;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/9/22
 * Time: 4:31 p. m.
 */

public class StockModule extends AbstractModule {

  public static final String MODULE_NAME = "Stock";
  public static final String OPERATION_DECREMENT_STOCK = "DecrementStock";


  @Override
  public String getModulName() {
    return MODULE_NAME;
  }

  @Override
  public Object notifyMessage(ModuleMessage message) {
    switch(message.getMessageType()){
      case OPERATION_DECREMENT_STOCK:
        return decrementStock(message);

      default:
        throw new RuntimeException("Operation no soportada " + message.getMessageType() + "");
    }
  }

  private Void decrementStock(ModuleMessage message){
    SaleOrder saleOrder = (SaleOrder) message.getPayLoad();

    for(Product product: saleOrder.getProductos()){
      System.out.println("decrement product >" + product.getName());
    }

    ProductRequest productRequest = new ProductRequest();
    productRequest.setProducts(saleOrder.getProductos());

    ModuleMessage purchaseMessage = new ModuleMessage(MODULE_NAME, PurchaseModule.MODULE_NAME, PurchaseModule.OPERATION_PURCHASE_REQUEST, productRequest);
    mediator.mediate(purchaseMessage);
    return null;

  }

}
