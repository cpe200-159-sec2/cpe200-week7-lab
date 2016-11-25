package cpe200;

/**
 * Created by Pair on 25/11/2559.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseCalculator {
    protected BigDecimal firstOperand;
    protected BigDecimal secondOperand;

    public BaseCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public BigDecimal getFirstOperand(){
        return firstOperand;
    }

    public BigDecimal getSecondOperand(){
        return secondOperand;
    }

    public void setFirstOperand(BigDecimal firstOperand){
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(BigDecimal secondOperand){
        this.secondOperand = secondOperand;
    }

}
