package command.impl;

import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:37 p. m.
 */

public class ErrorCommand extends BaseCommand{

  private static final String COMMAN_NAME = "ERROR";

  @Override
  public String getCommandName() {
    return COMMAN_NAME;
  }

  @Override
  public String execute(String[] args, OutputStream out) {
    String message = "Error al invocar el comando";
    write(out, message);
    return message;
  }
}
