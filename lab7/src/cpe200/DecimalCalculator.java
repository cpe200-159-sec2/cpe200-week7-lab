
package cpe200;

import java.math.BigDecimal;

/**
 * Created by UserH61 on 29/10/2559.
 */

public class DecimalCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public DecimalCalculator() {

    }

    public BigDecimal getFirstOperand(){
        return firstOperand;
    }

    public BigDecimal getSecondOperand(){
        return secondOperand;
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }



    public String add() throws RuntimeException {
        checkException(firstOperand,secondOperand);

        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        checkException(firstOperand,secondOperand);

        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        checkException(firstOperand,secondOperand);

        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        checkException(firstOperand,secondOperand);

        return firstOperand.divide(secondOperand,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        checkException(firstOperand,secondOperand);

        return firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
    }

    public void checkException(BigDecimal firstOperand, BigDecimal secondOperand) throws RuntimeException {
        if (firstOperand.intValue() < 0 || secondOperand.intValue() <0)
            throw new RuntimeException("ERROR");
    }




}

