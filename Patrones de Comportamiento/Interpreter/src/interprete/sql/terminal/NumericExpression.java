package interprete.sql.terminal;

import interprete.sql.Context;
import interprete.sql.InterpreteException;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/9/22
 * Time: 3:03 p. m.
 */

public class NumericExpression extends LiteralExpression{

  private final Number number;

  public NumericExpression(Number num){
    super(null);
    this.number = num;
  }

  @Override
  public Object interpret(Context context) {
    return number;
  }

  @Override
  public String toString() {
    return number.toString();
  }
}
