public class SquareRoot extends UnaryOperation {

    SquareRoot(State state) {
        super(state);
    }

    @Override
    protected double calcul(double val) {
            return Math.sqrt(val);

    }
}


