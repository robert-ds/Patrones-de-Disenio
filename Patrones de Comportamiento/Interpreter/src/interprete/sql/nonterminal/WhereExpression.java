package interprete.sql.nonterminal;

import interprete.sql.AbstractSQLExpression;
import interprete.sql.Context;
import interprete.sql.InterpreteException;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/9/22
 * Time: 3:01 p. m.
 */

public class WhereExpression implements AbstractSQLExpression {

  private StatementExpression statement;

  public WhereExpression(StatementExpression statement){
    this.statement = statement;
  }

  @Override
  public void interpret(Context context) throws InterpreteException {
    context.createRowIterator();

    while(context.nextRow()){

      if(statement == null){
        context.addCurrentRowToResults();
      }else{
        Boolean result = (Boolean) statement.interpret(context);

        if(result){
          context.addCurrentRowToResults();
        }

      }

    }

    return null;
  }

  @Override
  public String toString() {
    if(statement != null){
      return "WHERE" + statement.toString();
    }else{
      return "";
    }

  }
}
