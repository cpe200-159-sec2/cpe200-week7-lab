package cpe200;

import java.math.BigDecimal;

/**
 * Created by Nachpon on 4/11/2559.
 */
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

    public  BigDecimal getFirstOperand(){
        return firstOperand;
    }
    public  BigDecimal getSecondOperand(){
        return secondOperand;
    }
    public void setFirstOperand(BigDecimal firstOperand) {
        this.firstOperand = firstOperand;
    }
    public void setSecondOperand(BigDecimal secondOperand){
        this.secondOperand = secondOperand;
    }


}
