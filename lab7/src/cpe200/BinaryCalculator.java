package cpe200;

/**
 * Created by Pair on 25/11/2559.
 */
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BinaryCalculator extends BaseCalculator{
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator(){
        setFirstOperand(new BigDecimal(0));
        setSecondOperand(new BigDecimal(0));
    }

    public boolean isBinary(IOperand operand){
        return operand.getOperand().matches("^[01]+");
    }

    public void setFirstOperand(IOperand operand) {
        Binarycheck(operand);
        setFirstOperand(new BigDecimal(Integer.parseInt(operand.getOperand(), 2)));
    }

    public void setSecondOperand(IOperand operand) {
        Binarycheck(operand);
        setFirstOperand(new BigDecimal(Integer.parseInt(operand.getOperand(), 2)));
    }

    public String add() throws RuntimeException{
        if(getFirstOperand().intValue()<0 || getSecondOperand().intValue()<0){
            throw new RuntimeException("Negative value");
        }
        return Integer.toBinaryString(getFirstOperand().add(getFirstOperand()).stripTrailingZeros().intValue());
    }

    public String subtract() throws RuntimeException {
        if(getFirstOperand().intValue()<0 || getSecondOperand().intValue()<0){
            throw new RuntimeException("Negative value");
        }
        return Integer.toBinaryString(getFirstOperand().subtract(getFirstOperand()).stripTrailingZeros().intValue());
    }

    public String multiply() throws RuntimeException {
        if(getFirstOperand().intValue()<0 || getSecondOperand().intValue()<0){
            throw new RuntimeException("Negative value");
        }
        return Integer.toBinaryString(getFirstOperand().multiply(getFirstOperand()).stripTrailingZeros().intValue());
    }

    public String division() throws RuntimeException {
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException("negative value");
        }
        if (getSecondOperand().intValue() == 0) {
            throw new RuntimeException("Divide by Zero");
        }
        return Integer.toBinaryString(getFirstOperand().divide(getSecondOperand(), 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().intValue());
    }

    public String power() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0){
            throw new RuntimeException("Negative value");
        }
            return Integer.toBinaryString(getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros().intValue());
    }

    private void Binarycheck(IOperand check) throws ArithmeticException{
        if(check.getOperand().matches("[01]+"));
        else throw new ArithmeticException("Not Binary!");
    }

}


