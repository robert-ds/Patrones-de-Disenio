/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/6/22
 * Time: 11:06 a. m.
 */

package robertds.factorymethod.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import robertds.factorymethod.IDBAdapter;
import robertds.factorymethod.util.PropertiesUtil;

public class MySQLDBAdapter implements IDBAdapter{

  private static final String DB_PROPERTIES = "META_INF/DBMySQL.properties";

  private static final String DB_NAME_PROP      = "dbname";
  private static final String DB_HOST_PROP      = "host";
  private static final String DB_PASSWORD_PROP  = "password";
  private static final String DB_PORT_PROP      = "port";
  private static final String DB_USER_PROP      = "user";

  static{
    // Registrar Driver de Mysql
    try{
      new com.mysql.jdbc.Driver();
    }catch(Exception e){
      e.printStackTrace();
    }
  }

  @Override
  public Connection getConnection() {
    try{
      String connectionString = createConnectionString();
      Connection connection = DriverManager.getConnection(connectionString);
      System.out.println("Connection class ==> " + connection.getClass().getName());
      return connection;
    }catch(Exception e){
      e.printStackTrace();
      return null;
    }
  }

  private String createConnectionString(){
    Properties prop = PropertiesUtil.loadProperty(DB_PROPERTIES);
    String host = prop.getProperty(DB_HOST_PROP);
    String port = prop.getProperty(DB_PORT_PROP);
    String db = prop.getProperty(DB_NAME_PROP);
    String user = prop.getProperty(DB_USER_PROP);
    String password = prop.getProperty(DB_PASSWORD_PROP);

    String connectionString = "jdbc:mysql://" + host + ":" + port + "/" + db
        + "?user=" + user + "&password=" + password;
    System.out.println("ConnectionString ==> " + connectionString);
    return connectionString;

  }
}
