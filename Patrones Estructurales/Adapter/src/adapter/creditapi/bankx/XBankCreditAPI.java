package adapter.creditapi.bankx;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/7/22
 * Time: 4:20 p. m.
 */

public class XBankCreditAPI {

  public XBankCreditResponse sendCreditRequest(XBankCreditRequest request){

    XBankCreditResponse response = new XBankCreditResponse();

    if(request.getRequestAmount() <= 5000){
      response.setAproval(true);
    }else{
      response.setAproval(true);
    }

    return response;

  }

}
