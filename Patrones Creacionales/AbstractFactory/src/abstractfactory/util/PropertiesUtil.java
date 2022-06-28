package abstractfactory.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 28/6/22
 * Time: 2:28 p. m.
 */

public class PropertiesUtil {

  public static Properties loadProperty(String propertiesURL){

    try{
      Properties properties = new Properties();
      InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesURL);
      properties.load(inputStream);
    }catch(Exception e){
      e.printStackTrace();
    }
    return null;

  }

}
