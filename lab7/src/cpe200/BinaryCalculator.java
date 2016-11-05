package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator{

    private BigDecimal firstOperand;
    private BigDecimal secondOperand;
    private BigDecimal result;

    public Integer binaryToDecimal(IOperand operand){
        int decimal = Integer.parseInt(operand.getOperand(), 2);
        return decimal;
    }

    public String decimalToBinary(BigDecimal operand){
        String binary = Integer.toBinaryString(operand.intValue());
        return binary;
    }

    public void setFirstOperand(IOperand operand){
        checkBinary(operand);
        firstOperand = new BigDecimal(binaryToDecimal(operand));
    }

    public void setSecondOperand(IOperand operand){
        checkBinary(operand);
        secondOperand = new BigDecimal(binaryToDecimal(operand));
    }

    public String add() throws RuntimeException{
        checkNegative(firstOperand, secondOperand);
        this.result = firstOperand.add(secondOperand).stripTrailingZeros();
        return decimalToBinary(this.result);

    }

    public String subtract() throws  RuntimeException{
        checkNegative(firstOperand, secondOperand);
        this.result = firstOperand.subtract(secondOperand).stripTrailingZeros();
        return decimalToBinary(result);
    }

    public String multiply() throws RuntimeException{
        checkNegative(firstOperand, secondOperand);
        this.result = firstOperand.multiply(secondOperand).stripTrailingZeros();
        return decimalToBinary(result);
    }

    public String division() throws ArithmeticException {
        checkNegative(firstOperand, secondOperand);
        checkEqualsZero(secondOperand);

        this.result = firstOperand.divide(secondOperand, 5, BigDecimal.ROUND_UP).stripTrailingZeros();
        return decimalToBinary(result);
    }

    public String power() throws RuntimeException {
        checkNegative(firstOperand, secondOperand);
        result = firstOperand.pow(secondOperand.intValueExact()).setScale(0);
        return decimalToBinary(result);
    }

    public void checkNegative(BigDecimal firstOperand, BigDecimal secondOperand) throws RuntimeException{
        if(firstOperand.intValue() < 0 || secondOperand.intValue() < 0){
            throw new RuntimeException("Negative input.");
        }
    }

    public void checkEqualsZero(BigDecimal secondOperand) throws ArithmeticException{

        // use only in divide method

        if (secondOperand.intValue() == 0) {
            throw new ArithmeticException("Divided by zero.");
        }
    }

    public void checkBinary(IOperand operand) throws ArithmeticException{
        if(!operand.getOperand().matches("[01]+")){
            throw new ArithmeticException(operand + " is not binary.");
        }
    }
}
