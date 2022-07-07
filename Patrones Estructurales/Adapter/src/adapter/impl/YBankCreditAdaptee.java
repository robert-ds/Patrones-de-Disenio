package adapter.impl;

import adapter.creditapi.banky.YBankCreditApprove;
import adapter.creditapi.banky.YBankCreditApproveResult;
import adapter.creditapi.banky.YBankCreditSender;
import adapter.creditapi.banky.YBankCreditSenderListener;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/7/22
 * Time: 4:31 p. m.
 */

public class YBankCreditAdaptee implements IBankAdapter, YBankCreditSenderListener {

  private YBankCreditApproveResult yresponse;

  @Override
  public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
    YBankCreditApprove yrequest = new YBankCreditApprove();
    yrequest.setCredit((float) request.getAmount());
    yrequest.setName(request.getCustomer());

    YBankCreditSender sender = new YBankCreditSender();
    sender.sendCreditForValidate(yrequest, this);

    do{

      try{
        Thread.sleep(10000);
        System.out.println("YBank petición en espera");
      }catch(Exception e){
        e.printStackTrace();
      }

    }while(yresponse == null);

    BankCreditResponse response = new BankCreditResponse();
    response.setApproved(Objects.equals(yresponse.getApproved(), "Y"));
    return response;

  }

  @Override
  public void notifyCreditResult(YBankCreditApproveResult result){
    this.yresponse = result;
  }

}
