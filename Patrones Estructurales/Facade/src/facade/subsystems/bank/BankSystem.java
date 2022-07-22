package facade.subsystems.bank;

import facade.impl.GeneralPaymentError;
import facade.util.OnMemoryDataBase;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/7/22
 * Time: 2:33 p. m.
 */

public class BankSystem {

  public String transfer(TransferRequest request) throws GeneralPaymentError {

    String cardNumberPrefix = request.getCardNumber().substring(0,3);
    if(!OnMemoryDataBase.validateCardBins(cardNumberPrefix)){
      throw new GeneralPaymentError("Targeta invalida.");
    }

    String cardCompany = OnMemoryDataBase.getCardCompany(cardNumberPrefix);
    if("Venture".equals(cardCompany) && request.getCardNumber().length() != 15){
      throw new GeneralPaymentError("El número del la targeta es inválido");
    }else if(("VISA".equals(cardCompany) || "MASTERCARD".equals(cardCompany)) && request.getCardNumber().length() != 16 ){
      throw new GeneralPaymentError("El número de la targeta es inválido");
    }

    String number = request.getCardNumber();
    String cardNumberSubfix = number.substring(number.length() - 4, number.length());
    System.out.println("Se ha realizado un cargo al cliente " + request.getCardName() + "\n" + "\t por el monto de  " + request.getAmmount() + " a la targeta con terminacion " + cardNumberSubfix + ".\n");

    return UUID.randomUUID().toString();

  }

}
