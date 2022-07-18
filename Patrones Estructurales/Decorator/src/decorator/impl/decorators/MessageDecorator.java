package decorator.impl.decorators;

import decorator.impl.message.IMessage;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 18/7/22
 * Time: 2:05 p. m.
 */

public abstract class MessageDecorator implements IMessage {

  protected IMessage message;

  public MessageDecorator(IMessage message){
    this.message = message;
  }

  @Override
  public String getContent() {
    return message.getContent();
  }

  @Override
  public void setContent(String content) {
    message.setContent(content);
  }
}
