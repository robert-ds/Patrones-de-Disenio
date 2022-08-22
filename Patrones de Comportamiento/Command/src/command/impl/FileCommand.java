package command.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/8/22
 * Time: 3:38 p. m.
 */

public class FileCommand extends BaseCommand{

  public static final String COMMAND_NAME = "file";
  private static final String WRITE_APPEND = "-WA";
  private static final String WRITE_OVERRIDE = "-WO";
  private static final String WRITE_NEW = "-WN";
  private static final String RENAME_FILE = "-R";
  private static final String DELETE_FILE = "-D";

  @Override
  public String getCommandName() {
    return COMMAND_NAME;
  }

  @Override
  public String execute(String[] args, OutputStream out) {

    if(args.length < 2){
      write(out, "Parametros Insuficientes");
      return "";
    }

    String operation = args[0].toUpperCase();

    String[] reduce = Arrays.copyOfRange(args, 1, args.length);
    if(WRITE_APPEND.equals(operation)){
      write(out, writeAppend(reduce));
    }else if(WRITE_NEW.equals(operation)){
      write(out, writeNew(reduce));
    }else if(WRITE_OVERRIDE.equals(operation)){
      write(out, writeOverride(reduce));
    }else if(RENAME_FILE.equals(operation)){
      write(out, renameFile(reduce));
    }else if(DELETE_FILE.equals(operation)){
      write(out, deleteFile(reduce));
    }else{
      write(out, "no se encontró la operación: " + WRITE_APPEND + " | " + WRITE_NEW + " | " + WRITE_OVERRIDE + " | " + RENAME_FILE + " | " + DELETE_FILE);
    }

    return operation;
  }

  private String renameFile(String[] args){
    String filePath = args[0];
    String newFileName = args[1];

    try{
      File file = new File(filePath);
      file.renameTo(new File(newFileName));
      return "";
    }catch(Exception e){
      return "ERROR: " + e.getMessage();
    }
  }

  private String writeOverride(String[] args){
    String filePath = args[0];
    String fileContent = args[1];

    try{
      File file = new File(filePath);

      if(!file.exists()){
        if(!file.createNewFile()){
          return "Error: Eror al crear el archivo";
        }
      }

      FileWriter fileW = new FileWriter(file);
      fileW.write(fileContent.toCharArray());
      fileW.flush();
      fileW.close();
      return "";
    }catch(Exception e){
      return "Error: " + e.getMessage();
    }

  }

  private String writeAppend(String[] args){
    String filePath = args[0];
    String fileContent = args[1];

    try{
      File file = new File(filePath);

      if(!file.exists()){
        return "ERROR: EL archivo no existe";
      }

      FileWriter fileW = new FileWriter(file, true);
      fileW.append(fileContent);
      fileW.flush();
      fileW.close();
      return "";

    }catch(Exception e){
      return "Error: " + e.getMessage();
    }

  }

  private String writeNew(String[] args){

    if(args.length < 2){
      return "argumentos Invalis";
    }

    String filePath = args[0];
    String fileContent = args[1];

    try {
      File file = new File(filePath);

      if (file.exists()) {
        return "Error: El archivo ya existe";
      }

      if(!file.createNewFile()){
        return "Error: No fue posible crear el archivo";
      }

      FileWriter fileW = new FileWriter(file);
      fileW.write(fileContent.toCharArray());
      fileW.flush();
      fileW.close();
      return "";
    }catch(Exception e){
      return "Error: " + e.getMessage();
    }

  }

  private String deleteFile(String[] args){
    String filePath = args[0];
    File file = new File(filePath);

    if(file.delete()){
      return "No fue posible eliminar el archivo";
    }
    return "";
  }

}
