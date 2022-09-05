package interprete.sql;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/9/22
 * Time: 2:55 p. m.
 */

public interface AbstractSQLExpression {

  public Object interpret(Context context) throws InterpreteException;

}
