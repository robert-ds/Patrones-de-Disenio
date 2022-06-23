/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/6/22
 * Time: 11:09 a. m.
 */
package robertds.factorymethod.util;

import java.io.InputStream;
import java.security.AuthProvider;
import java.util.Properties;

public class PropertiesUtil {

  public static Properties loadProperty(String propertiesURL){
    try{
      Properties properties = new Properties();
      InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesURL);

      properties.load(inputStream);
      return properties;

    }catch(Exception e){
      e.printStackTrace();
      return null;
    }
  }

}
