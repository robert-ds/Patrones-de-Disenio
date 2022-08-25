package strategy;

import strategy.impl.AuthenticationProvider;
import strategy.impl.Principal;
import strategy.impl.providers.OnMemoryAuthenticationProvider;
import strategy.impl.providers.SQLAuthenticationProvider;
import strategy.impl.providers.XMLAuthenticationProvider;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 25/8/22
 * Time: 3:34 p. m.
 */

public class StrategyMain {

  private static Scanner in = new Scanner(System.in);
  private static AuthenticationProvider authProvider = new AuthenticationProvider();
  public static void main(String[] args){

    changeAuthetificationStrategy();
    Principal principal = null;

    do {
      System.out.println("\n\nPlease authenticate:");
      System.out.println("User:");
      String userName = in.next();
      System.out.println("Pasword:");
      String password = in.next();

      principal = authProvider.authenticate(userName, password);
      if (principal == null) {
        System.out.println("User or password invalid.");
        System.out.println("Do you want to change the authentication method? (S/N)");

        String op = in.next();
        if (op.equalsIgnoreCase("S")) {
          changeAuthetificationStrategy();
        }
      }
    } while (principal == null);

    System.out.println("Successful authentication");
    System.out.println(principal);

  }

  private static void changeAuthetificationStrategy() {
    System.out.println("Enter the type of authentication to use.");
    System.out.println("1.-OnMemory Authentication");
    System.out.println("2.-SQL Authentication");
    System.out.println("3.-XML Authentication");
    int op = in.nextInt();
    switch (op) {
      case 1:
        authProvider.setAuthenticationStrategy(
            new OnMemoryAuthenticationProvider());
        System.out.println("OnMemory Authentication Select >");
        break;
      case 2:
        authProvider.setAuthenticationStrategy(
            new SQLAuthenticationProvider());
        System.out.println("SQL Authentication Select >");
        break;
      case 3:
        authProvider.setAuthenticationStrategy(
            new XMLAuthenticationProvider());
        System.out.println("XML Authentication Select >");
        break;
      default:
        System.out.println("Invalid option");
        System.exit(1);
    }
  }

}
