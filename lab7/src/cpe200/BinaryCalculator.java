package cpe200;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.math.BigDecimal;


public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;
    private BigDecimal first,second;


    public BinaryCalculator() {
       /* setFirstOperand(new BigDecimal(0));
        setSecondOperand(new BigDecimal(0));*/

    }
    public void Binary(IOperand check) throws ArithmeticException{
        if(check.getOperand().matches("[01]+")){

        }else{
            throw new ArithmeticException("Not Binary");
        }
    }

    public void setFirstOperand(IOperand operand) {
        Binary(operand);
        firstOperand=new BigDecimal(Binary2Decimal(operand));

    }
    public Integer Binary2Decimal(IOperand binary){

        return Integer.parseInt(binary.getOperand(),2);

    }
    public String Decimal2Binary(BigDecimal decimal){
        return Integer.toBinaryString(decimal.intValue());

    }

    public void setSecondOperand(IOperand operand) {
        Binary(operand);
        secondOperand=new BigDecimal(Binary2Decimal(operand));

    }

    public String add() throws RuntimeException {
       if(firstOperand.intValue()<0||secondOperand.intValue()<0){
           throw new RuntimeException("ERROR");
       }
        return Decimal2Binary(getFirstOperand().add(getSecondOperand().stripTrailingZeros()));
    }

    public String subtract() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("ERROR");

        }
        return Decimal2Binary(getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros());

    }

    public String multiply() throws RuntimeException {


        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("ERROR");
        }
        return Decimal2Binary(getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros());
        //return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();

    }
    public String division() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException("ERROR");

        }else if(secondOperand.intValue()==0){
            throw new ArithmeticException("ERROR");
        }
        return Decimal2Binary(getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros());
    }

    public String power() throws RuntimeException {
        if(firstOperand.intValue()<0||secondOperand.intValue()<0){
            throw new RuntimeException();
        }
        return Decimal2Binary(getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros());

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
