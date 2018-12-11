public class Square extends UnaryOperation{


    Square(State state) {
        super(state);
    }

    @Override
    Double calcul(Double val) {
        return val * val;
    }
}
