public class MoreLess extends UnaryOperation{

    public MoreLess(State state){
        super(state);
    }

    @Override
    Double calcul(Double val) {
        return -val;
    }

}