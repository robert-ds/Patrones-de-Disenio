package bridge.impl;

import bridge.encript.IEncryptAlgorithm;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 14/7/22
 * Time: 3:27 p. m.
 */

public class DefaultMessageEncryptImpl implements IMessageEncrypt {

  private IEncryptAlgorithm encryptAlgorithm;

  public DefaultMessageEncryptImpl(IEncryptAlgorithm encryptAlgorithm){
    this.encryptAlgorithm = encryptAlgorithm;
  }

  @Override
  public String encryptMessage(String message, String password) throws Exception {
    return encryptAlgorithm.encrypt(message, password);
  }
}
