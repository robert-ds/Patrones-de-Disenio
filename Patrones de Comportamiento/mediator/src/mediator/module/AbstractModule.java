package mediator.module;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/9/22
 * Time: 4:27 p. m.
 */

public abstract class AbstractModule {

  protected ModuleMediator mediator;

  public abstract String getModulName();

  public void activate(){
    mediator = ModuleMediator.getInstance();
    mediator.registModule(this);
  }

  public abstract Object notifyMessage(ModuleMessage message);

}
