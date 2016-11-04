package cpe200;

import java.math.BigDecimal;

public class DecimalCalculator {
    private BigDecimal firstOperand, secondOperand, result;

    public DecimalCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Bigdecimal operand) {
        this.firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(Bigdecimal operand) {
        this.secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add() throws RuntimeException {
        if (firstOperand.intValue() < 0 || secondOperand.intValue() < 0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = firstOperand.add(secondOperand).stripTrailingZeros();
        }
        return result.toString();
    }

    public String subtract() throws RuntimeException {
        if (firstOperand.intValue()<0|| secondOperand.intValue()<0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = firstOperand.subtract(secondOperand).stripTrailingZeros();
        }
        return result.toString();
    }

    public String multiply() throws RuntimeException {
        if (firstOperand.intValue()<0|| secondOperand.intValue()<0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = firstOperand.multiply(secondOperand).stripTrailingZeros();
            return result.toString();
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (secondOperand.equals(0)){
            throw new RuntimeException("ERROR divisor is zero");
        } else if (firstOperand.intValue()<0|| secondOperand.intValue()<0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = firstOperand.divide(secondOperand,5, BigDecimal.ROUND_UP).stripTrailingZeros();
            return result.toString();
        }
    }

    public String power() throws RuntimeException {
        if (firstOperand.intValue()<0|| secondOperand.intValue()<0){
            throw new RuntimeException("Operand is negative");
        }
        result = firstOperand.pow(secondOperand.intValue()).stripTrailingZeros();
        return result.toString();
    }
}
