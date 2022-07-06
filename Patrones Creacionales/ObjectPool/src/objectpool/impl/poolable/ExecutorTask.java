package objectpool.impl.poolable;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/7/22
 * Time: 2:35 p. m.
 */

public class ExecutorTask implements IPooledObject {

  private int uses;
  private static int invalidate;
  private static int counter;

  public void execute(){

    int i = ++counter;

    uses++;

    System.out.println("Execute ==> "  + i );
    try{
      Thread.sleep(5000);
    }catch(Exception e){

    }

    System.out.println("Execute end ==> " + i);

  }

  @Override
  public boolean validate() {
    return uses < 2;
  }

  @Override
  public void invalidate() {
    invalidate++;
    System.out.println("Invalidadte Counter ==> " + invalidate);
  }
}
