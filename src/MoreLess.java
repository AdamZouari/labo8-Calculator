/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe MoreLess permet de calculer l'opposé d'un nombre ( provenant de la valeur courante)
 *
 */
public class MoreLess extends UnaryOperation{

    /**
     * @param state état interne de la machine
     */
    MoreLess(State state){
        super(state);
    }

    /**
     *
     * @param val operande provenant de la valeur courante
     * @return l'opposé de cette valeur
     */
    @Override
    protected double calcul(double val) {
        return -val;
    }

}