package proxy;

import proxy.impl.IProcessEjecutor;
import proxy.impl.ServiceFactory;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 16/8/22
 * Time: 4:50 p. m.
 */

public class ProxyMain {

  public static void main(String[] args){

    String user = "robert";
    String password = "12345";
    int process = 1;

    IProcessEjecutor processEjecutor = ServiceFactory.createProcessEjecutor();

    try{
      processEjecutor.ejecuteProcess(process, user, password);
    }catch(Exception e){
      System.out.println(e.getMessage());
    }

  }

}
