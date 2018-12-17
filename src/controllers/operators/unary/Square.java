package controllers.operators.unary;

import controllers.State;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Square permet de calculer le carré d'un nombre ( provenant de la valeur courante)
 *
 */
public class Square extends UnaryOperation{

    /**
     *  Constructeur de Square
     *
     * @param state état interne de la machine
     */
    public Square(State state) {super(state);}

    /**
     *
     * @param val operande provenant de la valeur courante
     * @return le carré de cette valeur
     */
    @Override
    protected double calcul(double val) { return val * val;}
}
