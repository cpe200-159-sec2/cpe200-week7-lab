package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {
    private String operand;

    public IntegerOperand(int d) {
        this.operand = Integer.toString(d) ;

    }

    @Override
    public String getOperand() {
        return operand;
    }
}
