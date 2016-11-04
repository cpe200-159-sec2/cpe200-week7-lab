package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator extends BaseCalculator{
    public IOperand firstOperand;
    public IOperand secondOperand;

    public BinaryCalculator() {
    }

    public boolean isBinary(IOperand operand){
        return operand.getOperand().matches("^[01]+");
    }

    public void setFirstOperand(IOperand operand) {
        if(isBinary(operand)){
            setFirstOperand(new BigDecimal((Integer.parseInt(operand.getOperand()))));
        }else{
            throw new ArithmeticException("This number is not Binary.");
        }
    }

    public void setSecondOperand(IOperand operand) {
        if(isBinary(operand)){
            setSecondOperand(new BigDecimal((Integer.parseInt(operand.getOperand()))));
        }else{
            throw new ArithmeticException("This number is not Binary.");
        }
    }

    public String add() throws RuntimeException {
        return Integer.toBinaryString(addBase().intValue());
    }

    public String subtract() throws RuntimeException {
        return Integer.toBinaryString(subtractBase().intValue());
    }

    public String multiply() throws RuntimeException {
        return Integer.toBinaryString(multiplyBase().intValue());
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        return Integer.toBinaryString(divisionBase().intValue());
    }

    public String power() throws RuntimeException {
       return Integer.toBinaryString(powerBase().intValue());
    }

}
