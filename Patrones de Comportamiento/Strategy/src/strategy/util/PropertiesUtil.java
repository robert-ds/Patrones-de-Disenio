package strategy.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 25/8/22
 * Time: 3:43 p. m.
 */

public class PropertiesUtil {

  public static Properties loadProperty(String propertiesURL){

    try{
      Properties properties = new Properties();
      InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesURL);
      properties.load(inputStream);

      return properties;

    }catch (Exception e){
      e.printStackTrace();
      return null;
    }

  }

}
