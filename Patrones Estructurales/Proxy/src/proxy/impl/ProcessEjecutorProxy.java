package proxy.impl;

import proxy.services.AuditService;
import proxy.services.SecurityService;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 16/8/22
 * Time: 4:54 p. m.
 */

public class ProcessEjecutorProxy implements IProcessEjecutor {

  @Override
  public void ejecuteProcess(int idProcess, String user, String password) throws Exception {

    SecurityService securityService = new SecurityService();
    if(!securityService.authorization(user, password)){
      throw new Exception("El usuario " + user + " No tiene privilegios para ejecutar el proceso");
    }

    DefaultProcessEjecutor ejecutorProcess = new DefaultProcessEjecutor();
    ejecutorProcess.ejecuteProcess(idProcess, user, password);

    AuditService audit = new AuditService();
    audit.auditServiceUsed(user, DefaultProcessEjecutor.class.getName());

  }

}
