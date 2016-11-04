package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by ASUS on 11/3/2016.
 */

public class BaseCalculator {

    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BaseCalculator(){
    }

    public void setFirstOperand(BigDecimal bigDecimal){
        firstOperand = bigDecimal;
    }

    public void setSecondOperand(BigDecimal bigDecimal){
        secondOperand = bigDecimal;
    }

    public BigDecimal addBase() throws RuntimeException {
        if(getFirstOperand().signum()==-1||getSecondOperand().signum()==-1){
            throw new RuntimeException("Negative value");
        }else {
            return getFirstOperand().add(getSecondOperand()).stripTrailingZeros();
        }
    }

    public BigDecimal subtractBase() throws RuntimeException {
        if(getFirstOperand().signum()==-1||getSecondOperand().signum()==-1){
            throw new RuntimeException("Negative value");
        }else {
            return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros();
        }
    }

    public BigDecimal multiplyBase() throws RuntimeException {
        if(getFirstOperand().signum()==-1||getSecondOperand().signum()==-1){
            throw new RuntimeException("Negative value");
        }else {
            return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros();
        }
    }

    /* This method should throw an exception when divide by zero */
    public BigDecimal divisionBase() throws RuntimeException {
        if(getSecondOperand().toString() == "0"){
            throw new ArithmeticException("divide by zero");
        }else if(getFirstOperand().signum()==-1||getSecondOperand().signum()==-1) {
            throw new RuntimeException("Negative value");
        }else {
            return getFirstOperand().divide(getSecondOperand(), 5, RoundingMode.HALF_UP).stripTrailingZeros();
        }
    }

    public BigDecimal powerBase() throws RuntimeException {
        if(getFirstOperand().signum()==-1||getSecondOperand().signum()==-1){
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
