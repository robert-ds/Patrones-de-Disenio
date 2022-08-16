package proxy.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 16/8/22
 * Time: 4:51 p. m.
 */

public class DefaultProcessEjecutor implements IProcessEjecutor{

  @Override
  public void ejecuteProcess(int idProcess, String user, String password) throws Exception {
    System.out.println("Procesos: " + idProcess + " en ejecución");
    System.out.println("Procesos: " + idProcess + " terminado");
  }

}
