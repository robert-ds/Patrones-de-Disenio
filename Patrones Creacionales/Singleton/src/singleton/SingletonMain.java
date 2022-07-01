package singleton;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 1/7/22
 * Time: 1:59 p. m.
 */

public class SingletonMain {

  public static void main(String[] args){

    ConfigurationSingleton singletonA = ConfigurationSingleton.getInstance();
    ConfigurationSingleton singletonB = ConfigurationSingleton.getInstance();

    System.out.println(singletonA);
      System.out.println("Misma referencia ==> " + (singletonA == singletonB));

    singletonA.setAppName("Sigleton Pattern");
    singletonB.setAppVersion("1.0x");

    System.out.println("SingletonA ==> " + singletonA);
    System.out.println("SingletonB ==> " + singletonB);

    singletonA = null;
    singletonB = null;

    singletonA = ConfigurationSingleton.getInstance();
    System.out.println("SingletonA ==> " + singletonA);

  }

}
