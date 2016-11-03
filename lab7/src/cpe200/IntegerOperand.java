package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {
    private String operand;

    public IntegerOperand(int i) {
        this.operand=Integer.toString(i);
        this.setOperand(operand);

    }
    public void setOperand(String operand){
        this.operand=operand;
    }

    @Override
    public String getOperand() {
        return operand;
    }
}
