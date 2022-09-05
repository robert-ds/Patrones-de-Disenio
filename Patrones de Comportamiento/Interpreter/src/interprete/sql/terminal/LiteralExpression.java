package interprete.sql.terminal;

import interprete.sql.AbstractSQLExpression;
import interprete.sql.Context;
import interprete.sql.InterpreteException;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/9/22
 * Time: 3:03 p. m.
 */

public class LiteralExpression implements AbstractSQLExpression {

  protected String literal;

  public LiteralExpression(String literal){
    this.literal = literal;
  }

  @Override
  public Object interpret(Context context) throws InterpreteException {
    return literal;
  }

  @Override
  public String toString() {
    return literal;
  }

}
