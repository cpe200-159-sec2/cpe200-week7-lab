package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator extends BaseCalculator {

    public BinaryCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    private void check(IOperand checkBinary) throws ArithmeticException {
        if (checkBinary.getOperand().matches("[01]+")) ;
        else throw new ArithmeticException();
    }

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    public void setFirstOperand(BigDecimal firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(BigDecimal secondOperand) {
        this.secondOperand = secondOperand;
    }

    public void setFirstOperand(IOperand operand) {
        check(operand);
        setFirstOperand(new BigDecimal(Integer.parseInt(operand.getOperand(), 2)));
    }

    public void setSecondOperand(IOperand operand) {
        check(operand);
        setSecondOperand(new BigDecimal(Integer.parseInt(operand.getOperand(), 2)));
    }


    public String add() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException("ERROR");
        }
        return getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();

    }

    public String subtract() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException("ERROR");
        }
        return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException("ERROE");
        }
        return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (getSecondOperand().toString() == "0" || getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException("ERROR");
        }
        return getFirstOperand().divide(getSecondOperand(), 5, BigDecimal.ROUND_CEILING).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        int powered = getFirstOperand().intValue();
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException("ERROR");
        }
        return getFirstOperand().stripTrailingZeros().pow(getSecondOperand().intValue()).stripTrailingZeros().toString();
    }
}
