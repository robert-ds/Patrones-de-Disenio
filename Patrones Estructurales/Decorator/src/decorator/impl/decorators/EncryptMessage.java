package decorator.impl.decorators;

import decorator.impl.message.IMessage;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 18/7/22
 * Time: 2:05 p. m.
 */

public class EncryptMessage extends MessageDecorator{

  private String user;
  private String password;

  public EncryptMessage(String user, String password, IMessage message){
    super(message);
    this.user = user;
    this.password = password;
  }

  @Override
  public IMessage processMessage() {
    this.message = message.processMessage();
    encryptMessage();

    return message;
  }

  private IMessage encryptMessage(){

    try{
      Key key = new SecretKeySpec(password.getBytes(), "AES");
      Cipher c = Cipher.getInstance("AES");

      c.init(Cipher.ENCRYPT_MODE, key);
      byte[] encVal = c.doFinal(message.getContent().getBytes());
      String encryptVaue = new BASE64Encoder().encode(encVal);
      message.setContent(encryptedValue);
      return message;
    }catch(Exception e){
      e.printStackTrace();
      throw new RuntimeException();
    }

  }

  // Getters and Setters

  public String getName(){
    return this.user;
  }

  public void setName(String user){
    this.user = user;
  }

  public String getPassword(){
    return this.password;
  }

  public void setPassword(String password){
    this.password = password;
  }

}
