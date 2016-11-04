package cpe200;

import java.math.BigDecimal;

public class DecimalCalculator extends BaseCalculator{
    public String add() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        sum=first.add(second).stripTrailingZeros();
        return sum.toString();
    }

    public String subtract() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        sum=first.subtract(second).stripTrailingZeros();
        return sum.toString();
    }

    public String multiply() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        sum=first.multiply(second).stripTrailingZeros();
        return sum.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (second.equals(0)) {
            throw new ArithmeticException("Divide by zero");
        }else if(first.intValue()<0 ||second.intValue()<0){
            throw new RuntimeException("Negative value");
        }else {
            return first.divide(second, 5, java.math.BigDecimal.ROUND_UP).stripTrailingZeros().toString();

        }
    }

    public String power() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0){
            throw  new RuntimeException("Negative value");
        }
        sum=first.pow(second.intValueExact()).setScale(0);
        return sum.toString();
    }

}
