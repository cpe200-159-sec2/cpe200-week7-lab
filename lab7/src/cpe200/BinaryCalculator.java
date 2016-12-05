package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

              public void setFirstOperand(IOperand operand) {
                 Binarycheck(operand);
                 setFirstOperand(new BigDecimal(Integer.parseInt(operand.getOperand(),2)));
             }


              public void setSecondOperand(IOperand operand) {
                 Binarycheck(operand);
                 setSecondOperand(new BigDecimal(Integer.parseInt(operand.getOperand(),2)));
             }

              public String add() throws RuntimeException {
                 if(getSecondOperand().intValue()<0||getFirstOperand().intValue()<0)throw new RuntimeException("ERROR");
                 return Integer.toBinaryString(getFirstOperand().add(getSecondOperand()).stripTrailingZeros().intValue());
             }

              public String subtract() throws RuntimeException {
                 if(getSecondOperand().intValue()<0||getFirstOperand().intValue()<0)throw new RuntimeException("ERROR");
                 return Integer.toBinaryString(getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().intValue());
             }

              public String multiply()throws RuntimeException {
                 if(getSecondOperand().intValue()<0||getFirstOperand().intValue()<0)throw new RuntimeException("ERROR");
                 return  Integer.toBinaryString(getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().intValue());
             }

              public String division() throws ArithmeticException {
                 if(getSecondOperand().toString().equals(0)||getSecondOperand().intValue()<0||getFirstOperand().intValue()<0){
                         throw new RuntimeException("Error");
                     }
                 return Integer.toBinaryString(getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().intValue());
             }

              public String power() throws RuntimeException{
                 int powered=getFirstOperand().intValue();
                 if(getSecondOperand().intValue()<0||getFirstOperand().intValue()<0)throw new RuntimeException("ERROR");
                 return Integer.toBinaryString(getFirstOperand().stripTrailingZeros().pow(getSecondOperand().intValue()).stripTrailingZeros().intValue());
             }

              public BigDecimal getFirstOperand() {
                 return firstOperand;
             }

              public void setFirstOperand(BigDecimal firstOperand) {
                 this.firstOperand = firstOperand;
             }

              public BigDecimal getSecondOperand() {
                 return secondOperand;
             }

              public void setSecondOperand(BigDecimal secondOperand) {
                 this.secondOperand = secondOperand;
             }

              private void Binarycheck(IOperand check) throws ArithmeticException {
                 if(check.getOperand().matches("[01]+"));
                 else throw new ArithmeticException("Not Binary");
             }

          }
