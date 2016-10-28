package cpe200;

import java.math.BigDecimal;

public class DecimalCalculator extends BaseCalculator {

    public DecimalCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

}
