package command;

import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:33 p. m.
 */

public interface ICommand {
  public String getCommandName();
  public String execute(String[] args, OutputStream out);
}
