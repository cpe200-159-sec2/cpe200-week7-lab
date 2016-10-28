package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    private BigDecimal first , second , result;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = operand;
        first = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = operand;
        second = new BigDecimal(operand.getOperand());
    }

    public String add() throws RuntimeException {
        if (first.intValue() < 0 || second.intValue() < 0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = first.add(second).stripTrailingZeros();
        }
        return result.toString();
    }

    public String subtract() throws RuntimeException {
        if (first.intValue()<0||second.intValue()<0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = first.subtract(second).stripTrailingZeros();
        }
        return result.toString();
    }

    public String multiply() throws RuntimeException {
        if (first.intValue()<0||second.intValue()<0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = first.multiply(second).stripTrailingZeros();
            return result.toString();
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (second.equals(0)){
            throw new RuntimeException("ERROR divisor is zero");
        } else if (first.intValue()<0||second.intValue()<0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = first.divide(second,5,BigDecimal.ROUND_UP).stripTrailingZeros();
            return result.toString();
        }
    }

    public String power() throws RuntimeException {
        if (first.intValue()<0||second.intValue()<0){
            throw new RuntimeException("Operand is negative");
        }
        result = first.pow(second.intValue()).stripTrailingZeros();
        return result.toString();
    }

    private IOperand getFirstOperand() {
        return firstOperand;
    }

    private IOperand getSecondOperand() {
        return secondOperand;
    }

}
