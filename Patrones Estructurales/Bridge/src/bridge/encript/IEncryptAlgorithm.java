package bridge.encript;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vasquez
 * Date: 14/7/22
 * Time: 3:26 p. m.
 */

public interface IEncryptAlgorithm {
  public String encrypt(String message, String password) throws Exception;
}
