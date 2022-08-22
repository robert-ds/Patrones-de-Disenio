package command.impl;

import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:39 p. m.
 */

public class MemoryCommand extends BaseCommand{

  public static final String COMMAND_NAME = "memory";

  @Override
  public String getCommandName() {
    return COMMAND_NAME;
  }

  @Override
  public String execute(String[] args, OutputStream out) {
    double heap = Runtime.getRuntime().totalMemory() / 1000000d;
    double heapMx = Runtime.getRuntime().maxMemory() / 1000000d;
    double heapFree = Runtime.getRuntime().freeMemory() / 1000000d;

    String salida = "Head: " + heap + "\nMax Heap: " + heapMx + "\nFree heap: " + heapFree;
    write(out, salida);
    
    return salida;
  }
}
