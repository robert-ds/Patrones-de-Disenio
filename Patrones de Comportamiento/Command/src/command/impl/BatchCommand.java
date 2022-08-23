package command.impl;

import command.CommandManager;
import command.CommandUtil;
import command.ICommand;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:35 p. m.
 */

public class BatchCommand extends BaseCommand {

  public static final String COMMAN_NAME = "batch";

  @Override
  public String getCommandName() {
    return COMMAN_NAME;
  }

  @Override
  public String execute(String[] args, OutputStream out) {

    if(args == null || args.length < 1){
      write(out, "Numero de parametros invalido");
      return "";
    }

    CommandManager manager = CommandManager.getInstance();
    String[] lines = readLinesFromFile(args[0]);

    for(String line: lines){
      String[] argsCommand = CommandUtil.tokenizerArgs(line);
      ICommand command = manager.getCommand(argsCommand[0]);
      String[] reduce = Arrays.copyOfRange(argsCommand, 1, argsCommand.length);
      command.execute(reduce,out);
      write(out, "\n");
    }

    write(out, " Batch Ejecutado");

    return null;
  }

  private String[] readLinesFromFile(String filePath) throws RuntimeException{
    File file = new File(filePath);
    FileInputStream stream = null;

    try{
      if(!file.exists()){
        throw new RuntimeException("Archivo no encontrado");
      }

      stream = new FileInputStream(file);
      byte[] byteArray = new byte[stream.available()];
      stream.read(byteArray);

      String commands = new String(byteArray);
      String[] lines = commands.split("\n");
      return lines;

    }catch(Exception e){
      throw new RuntimeException(e.getMessage());
    }finally{
      try{
        stream.close();
      }catch(Exception e2){}
    }

  }

}
