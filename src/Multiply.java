public class Multiply extends BinaryOperation {

    Multiply(State state) {
        super(state);
    }

    @Override
    protected double calcul(double op1, double op2) {
            return op1 * op2;
    }
}