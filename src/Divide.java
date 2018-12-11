public class Divide extends BinaryOperation
{
    Divide(State state) {
        super(state);
    }

    @Override
    Double calcul(Double op1, Double op2) {
        return op1 / op2;
    }
}
