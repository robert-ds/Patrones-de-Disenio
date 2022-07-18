package decorator.impl.decorators;

import decorator.impl.message.IMessage;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 18/7/22
 * Time: 2:06 p. m.
 */

public class SOAPEnvelopMessage extends MessageDecorator{

  public SOAPEnvelopMessage(IMessage message){
    super(message);
  }

  @Override
  public IMessage processMessage() {

    message.processMessage();
    message = envelopMessage();
    return message;
  }

  private IMessage envelopMessage(){

    String soap = "sopaenv: Envelop xmlns:soapenv="
        + "\"http://schemas.xmlsoap.org/soap/envelop/\""
        + "xmlns:ser=\"http:rvice.dishweb.cl.com\">\n"
        + "<soapenv:Header/>\n"
        + "<soapenv:Body>\n"
        + message.getContent()
        + "\n"
        + "</soapenv:Body>\n"
        + "</soapenv:Envelop>";

    message.setContent(soap);
    return message;
  }

}
