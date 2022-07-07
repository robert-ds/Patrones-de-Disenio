package adapter.creditapi.banky;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/7/22
 * Time: 4:25 p. m
 */

public class YBankCreditSender {

  public void sendCreditForValidate(final YBankCreditApprove request, final YBankCreditSenderListener listener){

    new Thread(new Runnable(){

      @Override
      public void run() {
        System.out.println("YBank Received your request in a moment you will have the answer, be patient please");
        YBankCreditApproveResult response = new YBankCreditApproveResult();

        if(request.getCredit()  <= 1500){
          response.setApproved("Y");
        }else{
          response.setApproved("N");
        }

        try{
          Thread.sleep(1000 * 30);
        }catch(Exception e){
          e.printStackTrace();
        }

        listener.notifyCreditResult(response);
      }

    }).start();

  }

}
