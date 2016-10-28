package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator extends BaseCalculator {

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand Operand) {
        firstOperand = new BigDecimal(binToDec(Operand));
    }

    public void setSecondOperand(IOperand Operand) {
        secondOperand = new BigDecimal(binToDec(Operand));
    }

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    public String add() throws RuntimeException {
        return super.add();
    }

    public String subtract() throws RuntimeException {
        return super.subtract();
}

    public String multiply() throws RuntimeException {
        return super.multiply();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        return super.division();
    }

    public String power() throws RuntimeException {
        return super.power();
    }

    private Integer binToDec(IOperand bin) {
        return Integer.parseInt(bin.getOperand(),2);
    }

}
