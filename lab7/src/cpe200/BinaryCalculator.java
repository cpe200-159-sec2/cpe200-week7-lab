package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;
    private BigDecimal tmp_BigDecimal;

    public BinaryCalculator() {
    }

    public void setFirstOperand(IOperand firstOperand) {
        this.firstOperand = new BigDecimal(binToDec(firstOperand));
    }

    public void setSecondOperand(IOperand secondOperand) {
        this.secondOperand = new BigDecimal(binToDec(secondOperand));
    }

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    public String add() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException();
        }
        tmp_BigDecimal = new BigDecimal(getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString());
        return decToBin(tmp_BigDecimal);
    }

    public String subtract() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException();
        }
        tmp_BigDecimal = new BigDecimal(getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString());
        return decToBin(tmp_BigDecimal);
    }

    public String multiply() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException();
        }
        tmp_BigDecimal = new BigDecimal(getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString());
        return decToBin(tmp_BigDecimal);
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException();
        } else if (getSecondOperand().equals("0")) {
            throw new ArithmeticException();
        }
        tmp_BigDecimal = new BigDecimal(getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString());
        return decToBin(tmp_BigDecimal);
    }

    public String power() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException();
        }
        tmp_BigDecimal = new BigDecimal(getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros().toString());
        return decToBin(tmp_BigDecimal);
    }

    private Integer binToDec(IOperand bin) {
        return Integer.parseInt(bin.getOperand(),2);
    }

    private String decToBin(BigDecimal dec) {
        return Integer.toBinaryString(dec.intValue());
    }
}
