package cpe200;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BinaryCalculator extends BaseCalculator {
    private MathContext mathContext;

    private IOperand firstOperand;
    private IOperand secondOperand;

    public BinaryCalculator() {
    }

    @Override
    protected BigDecimal makeBigDecimal(IOperand op) {
        String binaryString = op.getOperandBase2();
        long numerator = Long.parseLong(binaryString.replace(".", ""), 2);
        double value = (double) numerator;
        int pointIndex = binaryString.indexOf(".");
        if (pointIndex != -1) {
            int placesAfterPoint = binaryString.length() - pointIndex - 1;
            value /= (1L << placesAfterPoint);
        }
        String str = Double.toString(value);
        BigDecimal ret = new BigDecimal(str);
        return ret;
    }

}

