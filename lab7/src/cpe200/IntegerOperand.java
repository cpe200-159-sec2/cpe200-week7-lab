package cpe200;

public class IntegerOperand implements IOperand {
    private int operand;

    public IntegerOperand(int i) {
        this.operand = i;
    }

    @Override
    public String getOperand() {
        return Integer.toString(operand);
    }
}