package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private java.math.BigDecimal firstOperand;
    private java.math.BigDecimal secondOperand;
    private java.math.BigDecimal first,second,sum;

    public BinaryCalculator() {
    }
    public Integer BinaryToDecimal(IOperand i ){
        int dec=Integer.parseInt(i.getOperand(),2);
        return dec;
    }
    public String DecimalToBinary (BigDecimal j){
        String bin=Integer.toBinaryString(j.intValue());
        return bin;
    }
    private void Binarycheck(IOperand check) throws ArithmeticException {
        if(check.getOperand().matches("[01]+")) {
        }else
            throw new ArithmeticException("Not Binary");
    }

    public void setFirstOperand(IOperand operand) {
        // firstOperand=operand;
            Binarycheck(operand);
            first=new java.math.BigDecimal(BinaryToDecimal(operand));
    }

    public void setSecondOperand(IOperand operand) {
        // secondOperand=operand;
        Binarycheck(operand);
        second=new java.math.BigDecimal(BinaryToDecimal(operand));
    }

    public String add() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        sum=first.add(second).stripTrailingZeros();
        return DecimalToBinary(sum);
    }

    public String subtract() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        sum=first.subtract(second).stripTrailingZeros();
        return DecimalToBinary(sum);
    }

    public String multiply() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        sum=first.multiply(second).stripTrailingZeros();
        return DecimalToBinary(sum);
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (second.equals(0)) {
            throw new ArithmeticException("Divide by zero");
        }else if(first.intValue()<0 ||second.intValue()<0){
            throw new RuntimeException("Negative value");
        }else {
            sum=first.divide(second, 5, java.math.BigDecimal.ROUND_UP).stripTrailingZeros();
            return DecimalToBinary(sum);

        }
    }

    public String power() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        sum=first.pow(second.intValueExact()).setScale(0);
        return DecimalToBinary(sum);
    }

}
