package command.impl;

import java.io.OutputStream;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:37 p. m.
 */

public class EchoCommand  extends BaseCommand{

  public static final String COMMAN_NAME = "echo";

  @Override
  public String getCommandName() {
    return COMMAN_NAME;
  }

  @Override
  public String execute(String[] args, OutputStream out) {
    String message = getCommandName() + "" + Arrays.toString(args);
    write(out, message);
  }

}
