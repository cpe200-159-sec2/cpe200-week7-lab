package cpe200;

import java.math.BigDecimal;

public class DecimalCalculator {
    public IOperand firstOperand;
    public IOperand secondOperand;

    public DecimalCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        firstOperand=operand;
    }

    public void setSecondOperand(IOperand operand) {
        secondOperand=operand;
    }

    public String add() throws RuntimeException {
        if ((Double.parseDouble(firstOperand.getOperand()) < 0 || Double.parseDouble(secondOperand.getOperand()) < 0)) {
            throw new RuntimeException("negative values are not allowed.");
        } else {
            BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
            BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
            Num1 = Num1.add(Num2).stripTrailingZeros();
            return Num1.toString();
        }
    }

    public String subtract() throws RuntimeException {
        if((Double.parseDouble(firstOperand.getOperand()) < 0 || Double.parseDouble(secondOperand.getOperand()) < 0))
        {
            throw new RuntimeException("negative values are not allowed.");
        }
        else
        {
            BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
            BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
            Num1 = Num1.subtract(Num2).stripTrailingZeros();
            return Num1.toString();
        }
    }

    public String multiply() throws RuntimeException {
        if((Double.parseDouble(firstOperand.getOperand()) < 0 || Double.parseDouble(secondOperand.getOperand()) < 0))
        {
            throw new RuntimeException("negative values are not allowed.");
        }
        else
        {
            BigDecimal Num1 = new BigDecimal((firstOperand.getOperand()));
            BigDecimal Num2 = new BigDecimal((secondOperand.getOperand()));
            Num1 = Num1.multiply(Num2).stripTrailingZeros();
            return Num1.toString();
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if((Double.parseDouble(firstOperand.getOperand()) < 0 || Double.parseDouble(secondOperand.getOperand()) < 0))
        {
            throw new RuntimeException("negative values are not allowed.");
        }
        else if(Double.parseDouble(secondOperand.getOperand())==0)
        {
            throw new ArithmeticException("Divided by zero");
        }
        else
        {
            BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
            BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
            Num1 = Num1.divide(Num2,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
            return Num1.toString();
        }
    }

    public String power() throws RuntimeException {
        if((Double.parseDouble(firstOperand.getOperand()) < 0 || Double.parseDouble(secondOperand.getOperand()) < 0))
        {
            throw new RuntimeException("negative values are not allowed.");
        }
        else
        {
            BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
            BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
            Num1 = Num1.pow(Num2.intValue()).stripTrailingZeros();
            return Num1.toString();
        }
    }
}


