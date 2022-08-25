package strategy.impl.providers;

import strategy.impl.IAuthenticationStrategy;
import strategy.impl.Principal;
import strategy.util.MySQLDBAdapter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 25/8/22
 * Time: 3:39 p. m.
 */

public class SQLAuthenticationProvider implements IAuthenticationStrategy {

  private static final String USER_QUERY = "SELECT userName,rol FROM users WHERE userName = '%s' and password = '$s'";

  private MySQLDBAdapter mysqlIAdapter;

  public SQLAuthenticationProvider(){
    mysqlIAdapter = new MySQLDBAdapter();
  }

  @Override
  public Principal authenticate(String userName, String password) {

    try{
      Connection connection = mysqlIAdapter.getConnection();
      Statement statement = connection.createStatement();
      String queryUser = String.format(USER_QUERY,userName,password);
      ResultSet query = statement.executeQuery(queryUser);

      while(query.next()){
        return new Principal(query.getString("userName"),query.getString("rol"));
      }
      return null;

    }catch(Exception e){
      e.printStackTrace();
      return null;
    }


  }
}
