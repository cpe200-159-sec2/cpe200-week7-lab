package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseCalculator {

    public BaseCalculator() {

    }

    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public void setFirstOperand(BigDecimal big){
        firstOperand = big;
    }

    public void setSecondOperand(BigDecimal big){
        secondOperand = big;
    }

    public BigDecimal addBase() throws RuntimeException {
        if(getFirstOperand().doubleValue()<0||getSecondOperand().doubleValue()<0){
            throw new RuntimeException("Negative value");
        }else {
            return getFirstOperand().add(getSecondOperand()).stripTrailingZeros();
        }
    }

    public BigDecimal subtractBase() throws RuntimeException {
        if(getFirstOperand().doubleValue()<0||getSecondOperand().doubleValue()<0){
            throw new RuntimeException("Negative value");
        }else {
            return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros();
        }
    }

    public BigDecimal multiplyBase() throws RuntimeException {
        if(getFirstOperand().doubleValue()<0||getSecondOperand().doubleValue()<0){
            throw new RuntimeException("Negative value");
        }else {
            return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros();
        }
    }

    /* This method should throw an exception when divide by zero */
    public BigDecimal divisionBase() throws RuntimeException {
        if(getSecondOperand().toString() == "0"){
            throw new ArithmeticException("divide by zero");
        }else if(getFirstOperand().doubleValue()<0||getSecondOperand().doubleValue()<0) {
            throw new RuntimeException("Negative value");
        }else {
            return getFirstOperand().divide(getSecondOperand(), 5, RoundingMode.HALF_UP).stripTrailingZeros();
        }
    }

    public BigDecimal powerBase() throws RuntimeException {
        if(getFirstOperand().doubleValue()<0||getSecondOperand().doubleValue()<0){
            throw new RuntimeException("Negative value");
        }else {
            return getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros();
        }
    }

    public BigDecimal getFirstOperand(){
        return firstOperand;
    }

    public BigDecimal getSecondOperand(){
        return secondOperand;
    }
}