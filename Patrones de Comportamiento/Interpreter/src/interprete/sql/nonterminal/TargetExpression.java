package interprete.sql.nonterminal;

import interprete.sql.AbstractSQLExpression;
import interprete.sql.Context;
import interprete.sql.InterpreteException;
import interprete.sql.terminal.LiteralExpression;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 5/9/22
 * Time: 3:01 p. m.
 */

public class TargetExpression implements AbstractSQLExpression {

  private List<LiteralExpression> targets = new ArrayList<LiteralExpression>();

  public TargetExpression(LiteralExpression... expressions){
    this.targets = Arrays.asList(expressions);
  }

  @Override
  public Object interpret(Context context) throws InterpreteException {
    context.createResultArray(targets.size());

    List<Row> resultRow = context.getResultRow();

    for(Row row: resultRow){

      Object[] result = context.createRow();
      int col = 0;

      for(LiteralExpression literalExpression: targets){
        String column = literalExpression.interpret(context).toString();
        context.tableColumn(column);
        int columnIndex = context.columnIndex(column);
        Cell cell = row.getCell(columnIndex);
        cell.setCellType(Cell.CELL_TYPE_STRING);
        String value = cell.getStringCellValue();
        result[col++] = value;
      }
    }

    return null;
  }

  @Override
  public String toString() {
    String output = "";
    for(LiteralExpression literalExpression: targets){
      output += ", " + literalExpression.toString();
    }
    return output.substring(2);
  }
}
