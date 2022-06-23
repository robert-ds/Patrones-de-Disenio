package robertds.factorymethod;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/6/22
 * Time: 11:12 a. m.
 */

import java.sql.Connection;

public interface IDBAdapter {
  public Connection getConnection();
}
