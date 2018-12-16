public class SquareRoot extends UnaryOperation {

    SquareRoot(State state) {
        super(state);
    }

    @Override
    protected double calcul(double val) {
        if(val < 0){
            state.setError(true);
            return 0.;
        }else {
            return Math.sqrt(val);
        }
    }
}


