package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator extends  BaseCalculator {

    public void setFirstOperand(IOperand operand) {
        check(operand);
        setFirstOperand(new BigDecimal(Integer.parseInt(operand.getOperand(), 2)));
    }

    public void setSecondOperand(IOperand operand) {
        check(operand);
        setSecondOperand(new BigDecimal(Integer.parseInt(operand.getOperand(), 2)));
    }

    public String add() throws RuntimeException {
        return Integer.toBinaryString(getFirstOperand().add(getSecondOperand()).stripTrailingZeros().intValue());
    }

    public String subtract() throws RuntimeException {
        return Integer.toBinaryString(getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().intValue());
    }

    public String multiply() throws RuntimeException {
        return Integer.toBinaryString(getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().intValue());
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        return Integer.toBinaryString(getFirstOperand().divide(getSecondOperand(), 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().intValue());
    }

    public String power() throws RuntimeException {
        return  Integer.toBinaryString(getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros().intValue());
    }
    private void check(IOperand checkbi) throws ArithmeticException {
        if(checkbi.getOperand().matches("[01]+"));
        else throw new ArithmeticException();
    }

    public void setFirstOperand(BigDecimal firstOperand) {
        this.firstOperand = firstOperand;
    }
    public void setSecondOperand(BigDecimal secondOperand){
        this.secondOperand = secondOperand;
    }


}


