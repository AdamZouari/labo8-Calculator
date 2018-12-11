public class Inverse extends UnaryOperation{

    Inverse(State state) {
        super(state);
    }

    @Override
    Double calcul(Double val) {

        return 1/val;
    }
}
