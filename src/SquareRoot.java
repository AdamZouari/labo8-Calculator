public class SquareRoot extends UnaryOperation {

    SquareRoot(State state) {
        super(state);
    }

    @Override
    Double calcul(Double val) {
        return Math.sqrt(val);
    }
}


