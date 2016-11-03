package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class DoubleOperand implements IOperand{
    private String operand;
    public DoubleOperand(Double d) {
        this.operand=Double.toString(d);
        this.setOperand(operand);


    }

    @Override
    public String getOperand() {
        return operand;
    }
    public void setOperand(String operand){
        this.operand=operand;

    }

}
