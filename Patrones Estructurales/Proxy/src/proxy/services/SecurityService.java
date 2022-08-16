package proxy.services;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 16/8/22
 * Time: 4:56 p. m.
 */


public class SecurityService {

  public boolean authorization(String user, String password){

    if(user.equals("robert") && password.equals("12345")){
      System.out.println("Usuario " + user + " autorizado");
      return true;
    }else{
      System.out.println("Usuario "  + user + "No autorizado");
      return false;
    }

  }

}
