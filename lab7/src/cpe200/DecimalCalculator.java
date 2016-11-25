package cpe200;

import java.math.BigDecimal;

public class DecimalCalculator extends BaseCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;

    public DecimalCalculator() {
        setFirstOperand(new BigDecimal(0));
        setSecondOperand(new BigDecimal(0));
    }

    public void setFirstOperand(IOperand operand) {

    }

    public void setSecondOperand(IOperand operand) {
    }

    public String add() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0){
            throw new RuntimeException("Negative value");
        }
        return getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if(getFirstOperand().intValue() <0 || getSecondOperand().intValue()<0){
            throw new RuntimeException("Negative value");
        }
        return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if(getFirstOperand().intValue() <0 || getSecondOperand().intValue() <0){
            throw new RuntimeException("Negative value");
        }
        return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(getFirstOperand().intValue()<0 || getSecondOperand().intValue() <0){
            throw new RuntimeException("Negative value");
        }
        return getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if(getFirstOperand().intValue()<0 || getSecondOperand().intValue()<0){
            throw new RuntimeException("Negative value");
        }
        return getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros().toString();
    }

}
