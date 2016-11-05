package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class DoubleOperand implements IOperand{

    private double doubleOperand;

    public DoubleOperand(Double d) {
        doubleOperand = d;
    }

    @Override
    public String getOperand() {
        return Double.toString(this.doubleOperand);
    }
}
