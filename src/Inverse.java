public class Inverse extends UnaryOperation{

    Inverse(State state) {
        super(state);
    }

    @Override
    Double calcul(String val) {

        return 1/(Double.parseDouble(val));
    }
}
