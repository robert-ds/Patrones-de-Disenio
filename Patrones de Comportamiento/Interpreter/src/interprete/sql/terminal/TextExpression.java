package interprete.sql.terminal;

import interprete.sql.Context;
import interprete.sql.InterpreteException;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/9/22
 * Time: 3:04 p. m.
 */

public class TextExpression extends LiteralExpression {

  public TextExpression(String literal){
    super(literal);
  }

  @Override
  public Object interpret(Context context) {
    return literal;
  }

  @Override
  public String toString() {
    return "" + literal + "";
  }
}
