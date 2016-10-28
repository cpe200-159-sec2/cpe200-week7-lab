package cpe200;

public class StringOperand implements IOperand {
    private String operand;

    public StringOperand(String operand) {
        this.operand = operand;
    }

    @Override
    public String getOperand() {
        return operand;
    }

    @Override
    public String getOperandBase2() {

        StringBuilder binary = new StringBuilder();
        double val = Double.parseDouble(operand);

        long wholePart = (long) val;
        binary.append(Long.toBinaryString(wholePart));

        StringBuilder fraction = new StringBuilder();
        double fractionalPart = val - wholePart;
        while (fractionalPart > 0 && fraction.length() < 17) {
            double r = fractionalPart * 2;
            if (r >= 1) {
                fraction.append(1);
                fractionalPart = r - 1;
            } else {
                fraction.append(0);
                fractionalPart = r;
            }
        }
        if (fraction.length() > 0) {
            binary.append('.');
            binary.append(fraction.toString());
        }
        System.out.println(operand + " -> " + binary.toString());
        return binary.toString();

    }
}

