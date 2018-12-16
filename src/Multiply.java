/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Multiply permet de calculer la multiplication entre 2 nombres (le premier provenant de la stack et
 * le deuxième de la valeur courante)
 */
public class Multiply extends BinaryOperation {

    Multiply(State state) {
        super(state);
    }

    /**
     *
     * @param op1 première operand à multiplier provenant de la stack
     * @param op2 deuxième operand à multiplier provenant de la valeur courante
     * @return le résultat de la multiplication entre op1 et op2
     */
    @Override
    protected double calcul(double op1, double op2) {
            return op1 * op2;
    }
}