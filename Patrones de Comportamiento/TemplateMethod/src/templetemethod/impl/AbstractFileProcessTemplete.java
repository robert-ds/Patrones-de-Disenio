package templetemethod.impl;

import templetemethod.util.OnMemoryDataBase;

import java.io.File;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 24/8/22
 * Time: 2:35 p. m.
 */

public abstract class AbstractFileProcessTemplete {

  protected File file;
  protected String logPath;
  protected String movePath;

  public AbstractFileProcessTemplete(File file, String logPath, String movePath){
    this.file = file;
    this.logPath = logPath;
    this.movePath = movePath;
  }

  public final void execute() throws Exception{
    validateName();
    validateProcess();
    processFile();
    createLog();
    moveDocument();
    markAsProcessFile();
  }

  protected abstract void validateName() throws Exception;

  protected void validateProcess() throws Exception{
    String fileStatus = OnMemoryDataBase.getFileStatus(file.getName());
    if(fileStatus != null && fileStatus.equals("Procesado")){
      throw new Exception("El archivo" + file.getName() + " ya fue procesado");
    }
  }

  protected abstract void processFile() throws Exception;
  protected abstract void createLog() throws Exception;

  private void moveDocument() throws Exception{
    String newPath = movePath + "/" + file.getName();
    boolean change = file.renameTo(new File(newPath));
  }

  protected void markAsProcessFile() throws Exception{
    OnMemoryDataBase.setProcessFile(file.getName());
  }

}
