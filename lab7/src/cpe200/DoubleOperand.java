package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class DoubleOperand implements IOperand{

    private double doubleOperand;

    public DoubleOperand(Double d) {
        setDoubleOperand(d);
    }

    public String getOperand() {
        return Double.toString(this.getDoubleOperand());
    }

    public double getDoubleOperand() {
        return doubleOperand;
    }

    public void setDoubleOperand(double doubleOperand) {
        this.doubleOperand = doubleOperand;
    }
}
