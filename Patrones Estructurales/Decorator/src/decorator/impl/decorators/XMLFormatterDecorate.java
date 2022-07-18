package decorator.impl.decorators;

import decorator.impl.message.IMessage;
import decorator.impl.message.TextMessage;
import javax.xml.bind.*;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.ByteArrayOutputStream;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 18/7/22
 * Time: 2:07 p. m.
 */

public class XMLFormatterDecorate extends MessageDecorator{

  public XMLFormatterDecorate(IMessage message){
    super(message);
  }

  @Override
  public IMessage processMessage() {
    message = message.processMessage();
    message = xmlMessage();
    return message;
  }

  private IMessage xmlMessage(){

    try{
      JAXBContext jc = JAXBContext.netInstance(message.getClass());
      JAXBElement<IMessage> je2 = new JAXBElement<IMessage>( new QName(message.getClass().getName()),
          (Class<IMessage>) message.getClass(), message);
      Marshaller marshaller = jc.createMarshaller();
      marshaller.setProperty(Marshaller.JABX_FORMATTED_OUTPUT, true);
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      marshallr.marshal(je2, output);
      return new TextMessage(new String(output.toByteArray()));
    }catch(Exception e){
      e.printStackTrace();
      throw new RuntimeException("Error al convertir el XML");
    }

  }

}
