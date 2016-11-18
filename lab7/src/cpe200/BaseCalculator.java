package cpe200;

import java.math.BigDecimal;

public class BaseCalculator {
    protected BigDecimal firstOperand;
    protected BigDecimal secondOperand;

    public BaseCalculator() {
        setFirstOperand(new BigDecimal(0));
        setSecondOperand(new BigDecimal(0));
    }

    public void setFirstOperand(IOperand operand) {
        setFirstOperand(new BigDecimal(operand.getOperand()));
    }

    public void setSecondOperand(IOperand operand) {
        setSecondOperand(new BigDecimal(operand.getOperand()));
    }

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    public void setFirstOperand(BigDecimal firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(BigDecimal secondOperand) {
        this.secondOperand = secondOperand;
    }

}
