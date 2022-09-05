package interprete.sql.terminal;

import interprete.sql.Context;
import interprete.sql.InterpreteException;

import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/9/22
 * Time: 3:02 p. m.
 */

public class DateExpression extends LiteralExpression {

  public DateExpression(String literal){
    super(literal);
  }

  @Override
  public Object interpret(Context context) throws InterpreteException {

    try{
      SimpleDateFormat dateFormat = context.getDateFormat();
      return dateFormat.parse(literal);
    }catch(Exception e){
      throw new InterpreteException("Formato de fecha inválido" + literal + "");
    }

  }

  @Override
  public String toString() {
    return "" + literal + "";
  }
}
