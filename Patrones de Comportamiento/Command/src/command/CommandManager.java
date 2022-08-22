package command;

import command.impl.*;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:32 p. m.
 */

public class CommandManager {

  private static CommandManager commandManager;

  private static final HashMap<String, Class<? extends ICommand>> COMMANDS = new HashMap<String, Class<? extends ICommand>>();

  private CommandManager(){
    registCommand(EchoCommand.COMMAN_NAME, EchoCommand.class);
    registCommand(DirCommand.COMMAN_NAME, DirCommand.class);
    registCommand(DateTimeCommand.COMMAN_NAME, DateTimeCommand.class);
    registCommand(MemoryCommand.COMMAN_NAME, MemoryCommand.class);
    registCommand(FileCommand.COMMAN_NAME, FileCommand.class);
    registCommand(ExitCommand.COMMAN_NAME, ExitCommand.class);
    registCommand(BatchCommand.COMMAN_NAME, BatchCommand.class);
    registCommand(WaitAndSayHelloCommand.COMMAN_NAME, WaitAndSayHelloCommand.class);
  }

  public static synchronized CommandManager getInstance(){
    if(commandManager == null){
      commandManager = new CommandManager();
    }
    return commandManager;
  }


  public ICommand getCommand(String commandName){

    if(COMMANDS.containsKey(commandName.toUpperCase())){
      try{
        return COMMANDS.get(commandName.toUpperCase()).newInstance();
      }catch(Exception e){
        e.printStackTrace();
        return (ICommand) new ErrorCommand();
      }
    }else{
      return (ICommand) new NotFoundCommand();
    }

  }

  public void registCommand(String commandName, Class<? extends ICommand> command){
    COMMANDS.put(commandName.toUpperCase(), command);
  }

}
