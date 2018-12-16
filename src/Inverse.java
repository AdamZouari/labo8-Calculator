/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 *
 *
 */
public class Inverse extends UnaryOperation{

    Inverse(State state) {
        super(state);
    }

    @Override
    protected double calcul(double val) {

        return 1/val;
    }
}
