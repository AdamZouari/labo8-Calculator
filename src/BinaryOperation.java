import java.util.EmptyStackException;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe binaryOperation nous permet de regrouper les opérations binaire et ainsi factoriser le code. Les classes
 * héritant de cette dernière sont : Add, Divide, Multiply et Substract. Elle implémente la méthode execute hérité de la
 * classe Operator qui va executer des actions à chaque fois qu'un opérateur est appelé. Elle déclare la méthode calcul
 * qui sera redéfinie par toute ces sous classes
 *
 */
abstract class BinaryOperation extends Operator{

    BinaryOperation(State state){
        this.state = state;
    }

    /**
     * Méthode permettant de faire un calcul ayant deux entrée puis de stocké le résultat sous forme de double et
     * de String. Elle met aussi la valeur isEvaluated à true pour indiquer que la valeur courante est le résultat d'un
     * calcul et ainsi modifier le comportement d'autre operateur
     */
    public void execute(){

        try  {

            state.updateVal(calcul(state.pop(),Double.parseDouble(state.getInput())));
            state.updateInput(String.valueOf(state.getCurrentVal()));
            state.setEvaluated(true);

        }
        catch (EmptyStackException e) // Considéré comme erreur pouvant ne pas etre traité
        {}
    }

    /**
     *
     * @param op1 première opérande venant de la stack
     * @param op2 deuxième opérande venant de la valeur courante
     * @return le résultat du calcul (en double)
     */
    protected abstract double calcul(double op1, double op2);
}
