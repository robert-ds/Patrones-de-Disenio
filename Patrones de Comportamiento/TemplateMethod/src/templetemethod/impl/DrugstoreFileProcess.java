package templetemethod.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import templetemethod.util.OnMemoryDataBase;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 24/8/22
 * Time: 2:36 p. m.
 */

public class DrugstoreFileProcess extends AbstractFileProcessTemplete{

  private String log = "";
  public DrugstoreFileProcess(File file, String logPath, String movePath) {
    super(file, logPath, movePath);
  }

  @Override
  protected void validateName() throws Exception {

    String fileName = file.getName();
    if(!fileName.endsWith(".drug")){
      throw new Exception("Nombre del archivo no válido, debe terminar con .drug");
    }

    if(fileName.length() != 16){
      throw new Exception("El documento no tiene el formato esperado");
    }

  }

  @Override
  protected void processFile() throws Exception {
    FileInputStream input = new FileInputStream(file);

    try {
      byte[] fileContect = new byte[input.available()];
      input.read(fileContect);
      String message = new String(fileContect);
      String[] lines = message.split("\n");

      for (String line : lines) {
        String id = line.substring(0, 3);
        String customer = line.substring(3, 5);
        double amount = Double.parseDouble(line.substring(5, 8));
        String date = line.substring(8, 16);
        boolean exist = OnMemoryDataBase.customerExist(Integer.parseInt(customer));


        if (!exist) {
          log += id + " E" + customer + "\t\t" + date + " el cliente no existe";
        } else if (amount > 200) {
          log += id + " E" + customer + "\t\t" + date + " El monto excede el máximo\n";
        } else {
          log += id + " E" + customer + "\t\t" + date + " Aplicado exitosamente\n";
        }
      }

    } finally {
      try {
        input.close();
      } catch (Exception e) {

      }
    }
  }

  @Override
  protected void createLog() throws Exception {
    FileOutputStream out = null;

    try{
      File outFile = new File(logPath + "/" + file.getName());

      if(!outFile.exists()){
        outFile.createNewFile();
      }

      out = new FileOutputStream(outFile,false);
      out.write(log.getBytes());
      out.flush();

    }finally{
      out.close();
    }

  }
}
