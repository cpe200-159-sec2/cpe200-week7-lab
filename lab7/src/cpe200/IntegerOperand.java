package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class IntegerOperand implements IOperand {

    private String opreand;

    public IntegerOperand(int i) {
        this.opreand = Integer.toString(i);
    }

    @Override
    public String getOperand() {
        return opreand;
    }
}
