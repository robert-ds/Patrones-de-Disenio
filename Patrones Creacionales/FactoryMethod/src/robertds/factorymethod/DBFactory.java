/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/6/22
 * Time: 11:02 a. m.
 */

package robertds.factorymethod;

import java.util.Properties;
import robertds.factorymethod.impl.MySQLDBAdapter;
import robertds.factorymethod.impl.OracleDBAdapter;
import robertds.factorymethod.util.PropertiesUtil;

public class DBFactory {
  private static final String DB_FACTORY_PROPERTY_URL = "META_INF/DBFactory.properties";
  private static final String DEFAULT_DB_CLASS_PROP = "defaultDBClass";

  public static IDBAdapter getDBAdapter(DBType dbType){

    switch(dbType){

      case MySQL:
        return new MySQLDBAdapter();
      case Oracle:
        return new OracleDBAdapter();
      default:
        throw new IllegalArgumentException("No Soportado");

    }
  }

  public static IDBAdapter getDefaultDBAdapter(){

    try{
      Properties prop = PropertiesUtil.loadProperty(DB_FACTORY_PROPERTY_URL);
      String defaultDBClass = prop.getProperty(DEFAULT_DB_CLASS_PROP);
      System.out.println("DefaultDBClass ==> " + defaultDBClass);
      return (IDBAdapter) Class.forName(defaultDBClass).newInstance();
    }catch(Exception e){
      e.printStackTrace();
      return null;
    }

  }

}
