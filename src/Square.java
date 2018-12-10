public class Square extends UnaryOperation{


    Square(State state) {
        super(state);
    }

    @Override
    Double calcul(String val) {
        return Double.parseDouble(val) * Double.parseDouble(val);
    }
}
