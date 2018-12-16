public class Square extends UnaryOperation{


    Square(State state) {
        super(state);
    }

    @Override
    double calcul(double val) {
        return val * val;
    }
}
