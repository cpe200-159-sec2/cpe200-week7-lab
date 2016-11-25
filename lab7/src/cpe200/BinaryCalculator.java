package cpe200;

/**
 * Created by Pair on 25/11/2559.
 */
import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator(){

    }

    public boolean isBinary(IOperand operand){
        return operand.getOperand().matches("^[01]+");
    }

    public void setFirstOperand(IOperand operand){
        if(isBinary(operand)){
            firstOperand = new BigDecimal(operand.getOperand());
        }else{
            throw new ArithmeticException("This isn't Binary!!");
        }
    }

    public void setSecondOperand(IOperand operand){
        if(isBinary(operand)){
            secondOperand = new BigDecimal(operand.getOperand());
        }else{
            throw new ArithmeticException("This isn't Binary!!");
        }
    }

    public String add() throws RuntimeException{
        if(firstOperand.intValue()<0||secondOperand.intValue()<0) {
            throw new RuntimeException("Must be Non Negative Number");
        }else{
            return firstOperand.add(secondOperand).stripTrailingZeros().toString();
        }
    }

    public String subtract() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0) {
            throw new RuntimeException("Must be Non Negative Number");
        }else{
            return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
        }
    }

    public String multiply() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0) {
            throw new RuntimeException("Must Be Non-Negative Number");
        } else {
            return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
            }
        }

    public String division() throws RuntimeException {
        String Ans;
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("Must Be Non-Negative Number");
        }else {
            if (secondOperand.intValue() == 0) {
                throw new ArithmeticException("Divided by Zero");
            } else {
                Ans = firstOperand.divide(secondOperand, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
            }
            return Ans;
        }
    }
public String power() throws RuntimeException {
    if(firstOperand.intValue()<0||secondOperand.intValue()<0){
        throw  new RuntimeException("Must Be Non-Negative Number");
    }else {
        return firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
    }
}

}
