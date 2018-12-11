public class Substract extends BinaryOperation {


    Substract(State state) {
        super(state);
    }

    @Override
    Double calcul(Double op1, Double op2) {
        return op1 - op2;
    }
}
