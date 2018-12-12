public class SquareRoot extends UnaryOperation {

    SquareRoot(State state) {
        super(state);
    }

    @Override
    Double calcul(Double val) {
        if(val < 0){
            state.setError(true);
            return 0.;
        }else {
            return Math.sqrt(val);
        }
    }
}


