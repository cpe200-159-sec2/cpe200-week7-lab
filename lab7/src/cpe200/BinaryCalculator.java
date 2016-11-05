package cpe200;

/**
 * Created by i on 2/11/2559.
 */
public class BinaryCalculator extends BaseCalculator {
    private IOperand firstOperand;
    private IOperand secondOperand;
    private String pattern = "[01]+";

    public void setFirstOperand(IOperand operand) {

        if(!isValid(operand.getOperand())) throw new ArithmeticException("The operation must raise an exception");
        firstOperand = operand ;


    }

    public void setSecondOperand(IOperand operand) {

        if(!isValid(operand.getOperand())) throw new ArithmeticException("The operation must raise an exception");
        secondOperand = operand ;

    }

    public IOperand getFirstOperand() {
        return firstOperand;
    }

    public IOperand getSecondOperand() {
        return secondOperand;
    }

    public String add() throws RuntimeException {
        int first = binToDec(firstOperand);
        int second = binToDec(secondOperand);

        checkException (first ,second) ;

        double sum = first + second ;
        String s = Double.toString(sum);

        s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
        return decToBin(s) ;
    }

    public String subtract() throws RuntimeException {
        int first = binToDec(firstOperand);
        int second = binToDec(secondOperand);

        checkException (first ,second) ;

        double sum = first - second ;

        String s = Double.toString(sum);

        s = String.format("%.5f",sum);
        s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
        return decToBin(s) ;
    }

    public String multiply() throws RuntimeException {
        int first = binToDec(firstOperand);
        int second = binToDec(secondOperand);

        checkException (first ,second) ;

        double sum = first * second ;

        String s = Double.toString(sum);

        s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
        return decToBin(s) ;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        int first = binToDec(firstOperand);
        int second = binToDec(secondOperand);

        checkException (first ,second) ;

        if (second == 0) {
            throw new ArithmeticException();
        }

        double sum = first / second;

        String s = Double.toString(sum);
        s = String.format("%.5f", sum);

        s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
        return decToBin(s) ;
    }

    public String power() throws RuntimeException {
        int first = binToDec(firstOperand);
        int second = binToDec(secondOperand);

        checkException (first ,second) ;

        double sum = 1;

        for(int i = 0 ; i<second ;i++){

            sum *=first ;
        }

        String s = Double.toString(sum);

        s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
        return decToBin(s) ;
    }

    private Integer binToDec(IOperand bin) {
        return Integer.parseInt(bin.getOperand(),2);
    }

    private String decToBin(String dec) {
        int tmp = Integer.parseInt(dec);
        if(tmp >= 0) return Integer.toString(tmp,2);
        else throw new ExceptionInInitializerError() ;
    }


    private boolean isValid (String n) {
        return n.matches(pattern);
    }
}
