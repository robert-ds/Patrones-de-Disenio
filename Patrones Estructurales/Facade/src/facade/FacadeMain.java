package facade;

import facade.impl.IPaymentFacade;
import facade.impl.OnlinePaymentFacadeImpl;
import facade.impl.PaymentRequest;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 22/7/22
 * Time: 2:27 p. m.
 */

public class FacadeMain {

  public static void main(String[] args){

    PaymentRequest request = new PaymentRequest();
    request.setAmmount(500);
    request.setCardExpDate("10/2021");
    request.setCardName("Robert Vásquez");
    request.setCardNumber("82742974928234");
    request.setCardSecureNum("343");
    request.setCustomerId(1L);

    try{
      IPaymentFacade paymentFacade = new OnlinePaymentFacadeImpl();
      paymentFacade.pay(request);
    }catch(Exception e){
      System.out.println(e.getMessage());
    }

  }

}
