public class SquareRoot extends UnaryOperation {

    SquareRoot(State state) {
        super(state);
    }

    @Override
    Double calcul(String val) {
        return Math.sqrt(Double.parseDouble(val));
    }
}


