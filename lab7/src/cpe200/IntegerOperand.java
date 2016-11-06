package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {

    private String intOperand;

    public IntegerOperand(int i) {
        this.intOperand = Integer.toString(i);
    }

    @Override
    public String getOperand() {
        return this.intOperand.toLowerCase();
    }
}
