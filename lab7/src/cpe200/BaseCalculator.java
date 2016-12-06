package cpe200;

/**
 * Created by tiw3393 on 7/12/2559.
 */
import java.math.BigDecimal;
public class BaseCalculator {
    protected BigDecimal firstOperand;
    protected BigDecimal secondOperand;

    public BaseCalculator() {
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

    protected void setFirstOperand(BigDecimal firstOperand) {
        this.firstOperand = firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    protected void setSecondOperand(BigDecimal secondOperand) {
        this.secondOperand = secondOperand;
    }
}

