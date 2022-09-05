package interprete.sql.nonterminal;

import interprete.sql.AbstractSQLExpression;
import interprete.sql.Context;
import interprete.sql.InterpreteException;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/9/22
 * Time: 3:00 p. m.
 */

public class SelectExpression implements AbstractSQLExpression {

  private final TargetExpression target;
  private final FromExpression from;
  private final WhereExpression where;

  public SelectExpression(TargetExpression columns, FromExpression table, WhereExpression where){
    this.target = columns;
    this.from = table;
    this.where = where;
  }

  public SelectExpression(TargetExpression columns, FromExpression table){
    this.target = columns;
    this.from = table;
    this.where = new WhereExpression(null);
  }

  @Override
  public List<Object[]> interpret(Context context) throws InterpreteException {

    from.interpret(context);
    where.interpret(context);
    target.interpret(context);
    return context.getResultArray();

  }

  @Override
  public String toString() {
    return "Select " +
        "target=" + target.toString() +
        ", from=" + from.toString() +
        ", where=" + where.toString();
  }
}
