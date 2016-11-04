package cpe200;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.math.BigDecimal;


public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;
    public void Check(IOperand check)throws ArithmeticException{
        if(check.getOperand().matches("[01]+"));
        else throw new ArithmeticException("Not Binary");
    }
    public Integer bin2dec(IOperand operand){
        return Integer.parseInt(operand.getOperand(),2);
    }
    public BinaryCalculator() {
        setFirstOperand(new BigDecimal(0));
        setSecondOperand(new BigDecimal(0));
    }

    public void setFirstOperand(IOperand operand) {
        Check(operand);
        setFirstOperand(new BigDecimal(bin2dec(operand)));
    }

    public void setSecondOperand(IOperand operand) {
        Check(operand);
        setSecondOperand(new BigDecimal(bin2dec(operand)));

    }

    public String add() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("ERROR");
        }

        return Integer.toBinaryString(getFirstOperand().add(getSecondOperand()).stripTrailingZeros().intValue());
    }

    public String subtract() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("ERROR");

        }
        return  Integer.toBinaryString(getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().intValue());

    }

    public String multiply() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("ERROR");

        }
        return Integer.toBinaryString(getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().intValue());

    }
   public String division() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("ERROR");

        }else if(secondOperand.intValue()==0){
            throw new ArithmeticException("ERROR");
        }
        return Integer.toBinaryString(getFirstOperand().divide(getSecondOperand()).stripTrailingZeros().intValue());
    }

    public String power() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException();
        }
        return Integer.toBinaryString(getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros().intValue());

    }
    public BigDecimal getFirstOperand(){
        return firstOperand;
    }
    public BigDecimal getSecondOperand(){
        return secondOperand;
    }
    public void setFirstOperand(BigDecimal firstOperand){
        this.firstOperand=firstOperand;
    }
    public void setSecondOperand(BigDecimal secondOperand){
        this.secondOperand=secondOperand;
    }


}
