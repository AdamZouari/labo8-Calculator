public class Add extends BinaryOperation{

    Add(State state) {
        super(state);
    }


    @Override
    double calcul(double op1, double op2) {
        return op1 + op2;
    }
}
