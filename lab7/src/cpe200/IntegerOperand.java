package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {

    private int intOperand;

    public IntegerOperand(int i) {
        intOperand = i;
    }

    @Override
    public String getOperand() {
        return Integer.toString(this.intOperand);
    }
}
