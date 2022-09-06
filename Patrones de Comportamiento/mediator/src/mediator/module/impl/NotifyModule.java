package mediator.module.impl;

import mediator.module.AbstractModule;
import mediator.module.ModuleMessage;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/9/22
 * Time: 4:30 p. m.
 */

public class NotifyModule extends AbstractModule {

  public static final String MODULE_NAME = "Notificación";
  public static final String OPERATION_NOTIFY = "Notify";


  @Override
  public String getModulName() {
    return MODULE_NAME;
  }

  @Override
  public Void notifyMessage(ModuleMessage message) {
    switch(message.getMessageType()){
      case OPERATION_NOTIFY:
        return notify(message);

      default:
        throw new RuntimeException("Operation no soprtada " + message.getMessageType() + "");
    }
  }

  private Void notify(ModuleMessage message){
    System.out.println("Notificación por Email Enviada");
    return null;
  }

}
