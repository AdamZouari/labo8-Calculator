/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe SquareRoot permet de calculer la racine carré d'un nombre ( provenant de la valeur courante)
 *
 */
public class SquareRoot extends UnaryOperation {

    /**
     * @param state état interne de la machine
     */
    SquareRoot(State state) {
        super(state);
    }

    /**
     *
     * @param val operande provenant de la valeur courante
     * @return la racine carré de cette valeur
     */
    @Override
    protected double calcul(double val) { return Math.sqrt(val); }
}


