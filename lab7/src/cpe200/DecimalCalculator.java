package cpe200;

import java.math.BigDecimal;

/**
 * Created by ASUS on 11/3/2016.
 */
public class DecimalCalculator extends BaseCalculator {
    public BigDecimal firstOperand;
    public BigDecimal secondOperand;

    public DecimalCalculator(){
    }

    public void setFirstOperand(IOperand operand) {
        super.setFirstOperand(new BigDecimal((operand.getOperand())));
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
        return super.multiplyBase().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        return divisionBase().toString();
    }

    public String power() throws RuntimeException {
        return powerBase().toString();
    }
}
