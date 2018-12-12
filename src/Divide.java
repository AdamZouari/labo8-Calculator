public class Divide extends BinaryOperation
{
    Divide(State state) {
        super(state);
    }

    @Override
    Double calcul(Double op1, Double op2) {
        if(op1 == 0 && op2 == 0){
            state.setError(true);
            return 0.;
        }else {
            return op1 / op2;
        }
    }
}
