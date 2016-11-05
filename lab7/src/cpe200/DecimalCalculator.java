package cpe200;

import java.math.BigDecimal;

public class DecimalCalculator extends BaseCalculator{
  /* private BigDecimal firstOperand;
    private BigDecimal secondOperand;
    private BigDecimal result;
*/
    public DecimalCalculator() {
    }
/*
    public void setFirstOperand(IOperand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }*/

    public String add() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        result = firstOperand.add(secondOperand).stripTrailingZeros();
        return result.toString();
    }

    public String subtract() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        result = firstOperand.subtract(secondOperand).stripTrailingZeros();
        return result.toString();
    }

    public String multiply() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        result = firstOperand.multiply(secondOperand).stripTrailingZeros();
        return result.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (secondOperand.equals(0)) {
            throw new ArithmeticException("Divide by zero");
        }else if(firstOperand.intValue()<0 ||secondOperand.intValue()<0){
            throw new RuntimeException("Negative value");
        }else {
            return firstOperand.divide(secondOperand, 5, java.math.BigDecimal.ROUND_UP).stripTrailingZeros().toString();

        }
    }

    public String power() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        result = firstOperand.pow(secondOperand.intValueExact()).setScale(0);
        return result.toString();
    }
}