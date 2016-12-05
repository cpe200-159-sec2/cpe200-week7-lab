package cpe200;

import java.math.BigDecimal;

public class DecimalCalculator extends BaseCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public DecimalCalculator() {
    }

    public String add() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) throw new RuntimeException("ERROR");
        return getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) throw new RuntimeException("ERROR");
        return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) throw new RuntimeException("ERROR");
        return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String division() throws ArithmeticException {
        if (getSecondOperand().toString() == "0" || getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) {
            throw new RuntimeException("Error");
        }
        return getFirstOperand().divide(getSecondOperand(), 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        int powered = getFirstOperand().intValue();
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) throw new RuntimeException("ERROR");
        return getFirstOperand().stripTrailingZeros().pow(getSecondOperand().intValue()).stripTrailingZeros().toString();
    }

}