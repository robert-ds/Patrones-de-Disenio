package command.impl;

import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:39 p. m.
 */

public class NotFoundCommand extends BaseCommand{

  private static final String COMMAN_NAME = "NOT FOUND";

  @Override
  public String getCommandName() {
    return COMMAN_NAME;
  }

  @Override
  public String execute(String[] args, OutputStream out) {
    write(out, "Command no encotrado");
    return null;
  }
}
