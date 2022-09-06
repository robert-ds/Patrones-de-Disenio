package mediator.module.impl;

import mediator.module.AbstractModule;
import mediator.module.ModuleMessage;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/9/22
 * Time: 4:30 p. m.
 */

public class PurchaseModule extends AbstractModule {

  public static final String MODULE_NAME = "Chopping";
  public static final String OPERATION_PURCHASE_REQUEST = "PurchaseRequest";


  @Override
  public String getModulName() {
    return MODULE_NAME;
  }

  @Override
  public Object notifyMessage(ModuleMessage message) {
    switch(message.getMessageType()){
      case OPERATION_PURCHASE_REQUEST:
        return purchaseRequest(message);

      default:
        throw new RuntimeException("Operacion no soportada " + message.getMessageType() + "");
    }
  }

  private Void purchaseRequest(ModuleMessage message){
    return null;
  }

}
