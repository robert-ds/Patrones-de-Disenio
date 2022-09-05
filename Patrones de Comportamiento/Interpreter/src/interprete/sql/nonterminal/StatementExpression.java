package interprete.sql.nonterminal;

import interprete.sql.AbstractSQLExpression;
import interprete.sql.Context;
import interprete.sql.InterpreteException;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/9/22
 * Time: 3:00 p. m.
 */

public interface StatementExpression extends AbstractSQLExpression {

  @Override
  public Object interpret(Context context) throws InterpreteException;

}
