package cpe200;

import java.math.BigDecimal;


public class BinaryCalculator extends BaseCalculator{

    public void setFirstOperand(IOperand operand) {
        Binarycheck(operand);
        setFirstOperand(new BigDecimal(Integer.parseInt(operand.getOperand(),2)));

    }

    public void setSecondOperand(IOperand operand) {
        Binarycheck(operand);
        setSecondOperand(new BigDecimal(Integer.parseInt(operand.getOperand(),2)));
    }

    public String add() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException("Negative value");
        }
        return Integer.toBinaryString(getFirstOperand().add(getSecondOperand()).stripTrailingZeros().intValue());
    }

    public String subtract() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0){
            throw new RuntimeException("Negative value");
        }
        return Integer.toBinaryString(getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().intValue());
    }

    public String multiply() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0){
            throw new RuntimeException("Negative value");
        }
        return Integer.toBinaryString(getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().intValue());
    }

    public String division() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException("Negative value");
        }
        if (getSecondOperand().intValue() == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return Integer.toBinaryString(getFirstOperand().divide(getSecondOperand(), 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().intValue());
    }

    public String power() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0){
            throw new RuntimeException("Negative value");
        }
        return Integer.toBinaryString(getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros().intValue());
    }

    private void Binarycheck(IOperand check) throws ArithmeticException {
        if(check.getOperand().matches("[01]+"));
        else throw new ArithmeticException("Not Binary");
    }

}
