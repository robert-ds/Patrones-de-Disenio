package mediator.module;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/9/22
 * Time: 4:28 p. m.
 */

public class ModuleMessage {

  private String source;
  private String target;
  private String messageType;
  private Object payload;

  public ModuleMessage(String source, String target, String messageType, Object payload){
    this.source = source;
    this.target = target;
    this.messageType = messageType;
    this.payload = payload;
  }

  public String getSource(){
    return this.source;
  }

  public void setSource(String source){
    this.source = source;
  }

  public Object getPayLoad(){
    return this.payload;
  }

  public void setPayLoad(Object payload){
    this.payload = payload;
  }

  public String getTarget() {
    return this.target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public String getMessageType() {
    return this.messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }
}
