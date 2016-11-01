package cpe200;

import java.math.BigDecimal;

public class DecimalCalculator extends BaseCalculator {

    public void setFirstOperand(IOperand operand) {
        super.setFirstOperand(new BigDecimal(operand.getOperand()));
    }

    public void setSecondOperand(IOperand operand) {
        super.setSecondOperand(new BigDecimal(operand.getOperand()));
    }

    public String add() throws RuntimeException {
        return addBase().toString();
    }

    public String subtract() throws RuntimeException {
        return subtractBase().toString();
    }

    public String multiply() throws RuntimeException {
        return multiplyBase().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        return divisionBase().toString();
    }

    public String power() throws RuntimeException {
        return powerBase().toString();
    }

}
