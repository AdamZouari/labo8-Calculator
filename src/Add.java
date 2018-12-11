public class Add extends BinaryOperation{

    Add(State state) {
        super(state);
    }


    @Override
    Double calcul(Double op1, Double op2) {
        return op1 + op2;
    }
}
