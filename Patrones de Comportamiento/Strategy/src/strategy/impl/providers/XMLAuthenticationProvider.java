package strategy.impl.providers;

import org.w3c.dom.Document;
import strategy.impl.IAuthenticationStrategy;
import strategy.impl.Principal;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez * Date: 25/8/22
 * Time: 3:40 p. m.
 */

public class XMLAuthenticationProvider implements IAuthenticationStrategy {

  private static final String rolPath = "Users/User[@userName='%s' and @password='%s']/@rol";

  @Override
  public Principal authenticate(String userName, String password) {

    InputStream file = null;

    try{

      file = getClass().getResourceAsStream("/META_INF/UserFile.xml");
      DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = builderFactory.newDocumentBuilder();
      Document xmlDocument = builder.parse(file);
      XPath xPath = XPathFactory.newInstance().newXPath();

      String xpath = String.format(rolXPath,userName,passwrd);
      String rol = xPath.compile(xpath).evaluate(xmlDocument);

      if(rol != null && !rol.isEmpty()){
        return new Principal(userName, rol);
      }

      return null;

    }catch(Exception e){
      e.printStackTrace();
      return null;
    }finally{
      try {
        file.close();
      }catch(IOException ex){}
    }

  }
}
