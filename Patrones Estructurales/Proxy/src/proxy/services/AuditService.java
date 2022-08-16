package proxy.services;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 16/8/22
 * Time: 4:55 p. m.
 */

public class AuditService {
  public void auditServiceUsed(String user, String service){
    SimpleDateFormat formater = new SimpleDateFormat("dd/MM/YYYY");
    System.out.println(user + "utilizo el servicio > " + service + ", a las " + formater.format(new Date()));
  }

}
