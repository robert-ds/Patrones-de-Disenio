package command.impl;

import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:34 p. m.
 */

public abstract class AsyncCommand extends BaseCommand {

  public String execute(final String[] args, final OutputStream out){
    new Thread(new Runnable(){
      public void run(){
        executeOnBackground(args, out);
      }
    }).start();
    return null;
  }

  public abstract void executeOnBackground(String[] args, OutputStream out);

}
