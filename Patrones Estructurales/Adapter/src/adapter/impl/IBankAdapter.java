package adapter.impl;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 7/7/22
 * Time: 4:29 p. m.
 */

public interface IBankAdapter {
  public BankCreditResponse sendCreditRequest(BankCreditRequest request);
}
