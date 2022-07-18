package decorator;

import decorator.impl.decorators.EncryptMessage;
import decorator.impl.decorators.SOAPEnvelopMessage;
import decorator.impl.decorators.XMLFormatterDecorate;
import decorator.impl.message.CustomerMessage;
import decorator.impl.message.IMessage;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 18/7/22
 * Time: 2:03 p. m.
 */

public class DecoratorMain {

  public static void main(String[] args){

    CustomerMessage customerMessage = new CustomerMessage(
        "Robert andres", "robertds@gmail.com", "7772131h"
    );

    IMessage message1 = new EncryptMessage("usuario", "jhaksjdhakq82q", new SOAPEnvelopMessage(
        new XMLFormatterDecorate(customerMessage))).processMessage();
    System.out.println("message 1 =================================================>\n" + message1.getContent() + "\n\n");

    IMessage message2 = new SOAPEnvelopMessage(
        new EncryptMessage("usuario", "UEUWe8uw98eufw9", new XMLFormatterDecorate(customerMessage))).processMessage();
    System.out.println("message 2 =================================================>\n" + message2.getContent());

  }

}
