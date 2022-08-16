package proxy.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 16/8/22
 * Time: 4:53 p. m.
 */

public interface IProcessEjecutor {

  public void ejecuteProcess(int idProcess, String user, String password) throws Exception;

}
