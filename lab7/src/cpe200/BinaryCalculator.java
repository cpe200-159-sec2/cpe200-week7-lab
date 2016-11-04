package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;
    private BigDecimal result;

    public Integer BinaryToDecimal(IOperand operand){
        int dec = Integer.parseInt(operand.getOperand(),2);
        return dec;
    }

    public String DecimalToBinary(BigDecimal operand){
        String bin = Integer.toBinaryString(operand.intValue());
        return bin;
    }

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        BinaryCheck(operand);
        firstOperand = new BigDecimal(BinaryToDecimal(operand));
    }

    public void setSecondOperand(IOperand operand) {
        BinaryCheck(operand);
        secondOperand = new BigDecimal(BinaryToDecimal(operand));
    }

    public String add() throws RuntimeException {
        if (firstOperand.intValue() < 0 || secondOperand.intValue() < 0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = firstOperand.add(secondOperand).stripTrailingZeros();
        }
        return DecimalToBinary(result);
    }

    public String subtract() throws RuntimeException {
        if (firstOperand.intValue()<0|| secondOperand.intValue()<0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = firstOperand.subtract(secondOperand).stripTrailingZeros();
        }
        return DecimalToBinary(result);
    }

    public String multiply() throws RuntimeException {
        if (firstOperand.intValue()<0|| secondOperand.intValue()<0){
            throw new RuntimeException("Operand is negative");
        } else {
            result = firstOperand.multiply(secondOperand).stripTrailingZeros();
            return DecimalToBinary(result);
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
            return DecimalToBinary(result);
        }
    }

    public String power() throws RuntimeException {
        if (firstOperand.intValue()<0|| secondOperand.intValue()<0){
            throw new RuntimeException("Operand is negative");
        }
        result = firstOperand.pow(secondOperand.intValue()).stripTrailingZeros();
        return DecimalToBinary(result);
    }

    public void BinaryCheck(IOperand operand) throws ArithmeticException{
        if (operand.getOperand().matches("[01]+")){}
        else throw new ArithmeticException("New Binary");
    }
}
