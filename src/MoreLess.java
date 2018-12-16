/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 *
 *
 */
public class MoreLess extends UnaryOperation{

    public MoreLess(State state){
        super(state);
    }

    @Override
    protected double calcul(double val) {
        return -val;
    }

}