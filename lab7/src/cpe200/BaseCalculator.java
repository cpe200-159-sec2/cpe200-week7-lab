package cpe200;

/**
 * Created by nanear_ss on 4/11/2559.

 */
import java.math.BigDecimal;
public class BaseCalculator {
    protected java.math.BigDecimal first,second,sum;

    public BaseCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        first=new java.math.BigDecimal(operand.getOperand());
    }
    public void setSecondOperand(IOperand operand) {
        second=new java.math.BigDecimal(operand.getOperand());
    }


}
