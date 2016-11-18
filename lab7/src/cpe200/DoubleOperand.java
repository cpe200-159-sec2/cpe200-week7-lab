package cpe200;

public class DoubleOperand implements IOperand{
    private double operand;

    public DoubleOperand(Double d) {
        operand = d;
    }

    @Override
    public String getOperand() {
        return Double.toString(operand);
    }
}