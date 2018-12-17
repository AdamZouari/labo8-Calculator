package controllers.operators.binary;

import controllers.State;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Divide permet de calculer la division entre 2 nombres (le premier provenant de la stack et
 * le deuxième de la valeur courante)
 *
 */
public class Divide extends BinaryOperation
{

    /**
     * Constructeur de Divide
     *
     * @param state état interne de la machine
     */
    public Divide(State state) {
        super(state);
    }

    /**
     *
     * @param op1 première operand (numérateur) provenant de la stack
     * @param op2 deuxième operand (dénominateur) provenant de la valeur courante
     * @return le résultat de la division de op1 par op2
     */
    @Override
    protected double calcul(double op1, double op2) {
            return op1 / op2;

    }
}
