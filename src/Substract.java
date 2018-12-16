/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Substract permet de calculer la soustraction entre 2 nombres (le premier provenant de la stack et le deuxième de la
 * valeur courante)
 */
public class Substract extends BinaryOperation {


    Substract(State state) {
        super(state);
    }

    /**
     *
     * @param op1 première operand  provenant de la stack
     * @param op2 deuxième operand (que l'on soustrait) provenant de la valeur courante
     * @return le résultat de la soustaction de op2 à op1
     */
    @Override
    protected double calcul(double op1, double op2) {
        return op1 - op2;
    }
}
