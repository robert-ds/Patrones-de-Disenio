package adapter;


import adapter.impl.*;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/7/22
 * Time: 4:19 p. m.
 */

public class AdapterMain {

  public static void main(String[] args){


    BankCreditRequest request = new BankCreditRequest();
    request.setCustomer("Robert Vásquez");
    request.setAmount(1000);

    IBankAdapter xBank = new XBankCreditAdaptee();
    BankCreditResponse xresponse = xBank.sendCreditRequest(request);
    System.out.println("XBank approved > "  + xresponse.isApproved() + "\n");

    IBankAdapter yBank = new YBankCreditAdaptee();
    BankCreditResponse yresponse = yBank.sendCreditRequest(request);
    System.out.println("YBank approved > "  + yresponse.isApproved() + "\n");

    if(xresponse.isApproved()){
      System.out.println("xBank aprobo su credito, felicidades");
    }else if(yresponse.isApproved()){
      System.out.println("yBank aprobo su credito, felicidades");
    }else{
      System.out.println("Lo Sentimos!, su credito no ha sido aprobado");
    }

  }


}
