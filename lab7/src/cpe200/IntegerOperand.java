package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {

    private Integer Operand;

    public IntegerOperand(int i) {
        this.Operand = i ;
    }

    @Override
    public String getOperand() {
        return Integer.toString(this.Operand);
    }
}
