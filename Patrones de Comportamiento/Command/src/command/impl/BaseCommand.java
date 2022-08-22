package command.impl;

import command.ICommand;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:34 p. m.
 */

public abstract class BaseCommand implements ICommand {


  @Override
  public abstract String getCommandName();

  @Override
  public abstract String execute(String[] args, OutputStream out);

  public void write(OutputStream out, String message){
    try{
      out.write(message.getBytes());
      out.flush();
    }catch(Exception e){
      e.printStackTrace();
    }
  }

}
