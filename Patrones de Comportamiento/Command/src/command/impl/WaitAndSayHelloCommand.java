package command.impl;

import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:40 p. m.
 */

public class WaitAndSayHelloCommand extends AsyncCommand{

  public static final String COMMAND_NAME = "waithello";

  @Override
  public String executeOnBackground(String[] args, OutputStream out) {

    if(args == null || args.length < 1){
      write(out, "Paramaetros insuficientes");
      return "";
    }

    Long time = null;

    try{
      time = Long.parseLong(args[0]);
    }catch(Exception e){
      write(out, "Tiempo invalido");
      return "";
    }

    try{
      Thread.sleep(time.longValue());
      write(out, "Hello!");
    }catch(Exception e){
      e.printStackTrace();
    }

    return null;
  }

  @Override
  public String getCommandName() {
    return COMMAND_NAME;
  }
}
