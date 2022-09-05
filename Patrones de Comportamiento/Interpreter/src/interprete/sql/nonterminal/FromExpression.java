package interprete.sql.nonterminal;

import interprete.sql.AbstractSQLExpression;
import interprete.sql.Context;
import interprete.sql.InterpreteException;
import interprete.sql.terminal.LiteralExpression;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/9/22
 * Time: 2:59 p. m.
 */

public class FromExpression implements AbstractSQLExpression {

  private LiteralExpression table;

  public FromExpression(LiteralExpression from){
    this.table = from;
  }

  @Override
  public Object interpret(Context context) throws InterpreteException {
    String tableName = table.interpret(context).toString();

    if(!context.tableExist(tableName)){
      throw new InterpreteException("La tabla " + tableName + " no existe");
    }

    return null;
  }

  @Override
  public String toString() {
    return "From" + table.toString();
  }
}
