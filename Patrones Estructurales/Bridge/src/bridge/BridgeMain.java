package bridge;

import bridge.encript.AESEncryptAlgorithm;
import bridge.encript.DESEncryptAlgorithm;
import bridge.encript.NoEncryptAlgorithm;
import bridge.impl.DefaultMessageEncryptImpl;
import bridge.impl.IMessageEncrypt;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 14/7/22
 * Time: 3:22 p. m.
 */

public class BridgeMain {

  public static void main(String[] main){

    IMessageEncrypt aesImpl = new DefaultMessageEncryptImpl(new AESEncryptAlgorithm());
    IMessageEncrypt desImpl = new DefaultMessageEncryptImpl(new DESEncryptAlgorithm());
    IMessageEncrypt noImpl = new DefaultMessageEncryptImpl(new NoEncryptAlgorithm());

    try{
      final String message = "<Persona><Nombre>Robert Andres</Nombre></Persona>";
      String messageAES = aesImpl.encryptMessage(message, "HolaMundo2000");
      System.out.println("messageAES > " +  messageAES + "\n");

      String messageDES = desImpl.encryptMessage(message, "HolaMundo2020");
      System.out.println("messageDES > " +  messageDES + "\n");

      String messageNO = noImpl.encryptMessage(message, null);
      System.out.println("messageNO > " +  messageNO + "\n");

    }catch(Exception e){
      e.printStackTrace();
    }

  }

}
