public class Divide extends BinaryOperation
{
    Divide(State state) {
        super(state);
    }

    @Override
    double calcul(double op1, double op2) {
        if(Double.compare(op1, 0) == 0 && Double.compare(op2, 0) == 0){
            state.setError(true);
            return 0.;
        }else {
            return op1 / op2;
        }
    }
}
