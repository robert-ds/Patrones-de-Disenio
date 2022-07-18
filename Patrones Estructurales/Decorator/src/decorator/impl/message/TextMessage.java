package decorator.impl.message;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 18/7/22
 * Time: 2:10 p. m.
 */

public class TextMessage implements IMessage {

  private String content;

  // Construct
  public TextMessage(){}

  @Override
  public IMessage processMessage() {
    return this;
  }

  @Override
  public String getContent() {
    return this.content;
  }

  @Override
  public void setContent(String content) {
    this.content = content;
  }

}
