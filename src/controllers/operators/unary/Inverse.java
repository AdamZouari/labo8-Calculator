package controllers.operators.unary;

import controllers.State;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Inverse permet de calculer l'inverse d'un nombre ( provenant de la valeur courante)
 *
 */
public class Inverse extends UnaryOperation{

    /**
     * @param state état interne de la machine
     */
    public Inverse(State state) {
        super(state);
    }

    /**
     *
     * @param val operande provenant de la valeur courante
     * @return l'inverse de cette valeur
     */
    @Override
    protected double calcul(double val) { return 1/val; }
}
