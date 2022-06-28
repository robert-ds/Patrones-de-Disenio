package abstractfactory.impl;

import java.util.Properties;
import abstractfactory.util.PropertiesUtil;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vsquez
 * Date: 28/6/22
 * Time: 2:23 p. m.
 */

public class ServiceStackAbstractFactory {

  public ServiceStackAbstractFactory(){

    public static IServiceStackAbstractFactory createServiceFactory(){
      Properties props = PropertiesUtil.loadProperty("META_INF/AbstactFactoryConfig.properties");
      String factoryClass = props.getProperty("serviceProductImplClass");

      try{
        return (IServiceStackAbstractFactory) Class.forName(factoryClass).newInstance();
      }catch(Exception e){
        e.printStackTrace();
        return null;
      }

    }

  }

}
