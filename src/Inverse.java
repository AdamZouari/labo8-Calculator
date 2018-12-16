public class Inverse extends UnaryOperation{

    Inverse(State state) {
        super(state);
    }

    @Override
    protected double calcul(double val) {

        return 1/val;
    }
}
