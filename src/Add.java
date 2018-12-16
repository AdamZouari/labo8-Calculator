/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Add permet de calculer l'addition entre 2 nombres (le premier provenant de la stack et le deuxième de la
 * valeur courante)
 */
public class Add extends BinaryOperation{

    Add(State state) {
        super(state);
    }

    /**
     *
     * @param op1 première operand à additionner provenant de la stack
     * @param op2 deuxième operand à additionner provenant de la valeur courante
     * @return l'addition de ces deux valeurs
     */
    @Override
    protected double calcul(double op1, double op2) {
        return op1 + op2;
    }
}
