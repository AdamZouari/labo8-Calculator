/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe UnaryOperation nous permet de regrouper les opérations unaire et ainsi factoriser le code.
 * Les classes héritant de cette dernière sont : Square, SquareRoot, MoreLess, Inverse.
 * Elle implémente la méthode execute de la classe Operator qui va executer des actions à chaque fois
 * qu'un opérateur est appelé. Elle déclare la méthode calcul qui sera redéfinie par toute ces sous classes.
 */
abstract class UnaryOperation extends Operator {


    UnaryOperation(State state){
        this.state = state;
    }

    /**
     * Méthode permettant de faire un calcul ayant une entrée puis de stocké le résultat sous forme de double et
     * de String. Elle met aussi la valeur isEvaluated à true pour indiquer que la valeur courante est le résultat d'un
     * calcul et ainsi modifier le comportement d'autre operateur
     */
    public void execute() {
        state.updateVal(calcul(Double.parseDouble(state.getInput())));
        state.updateInput(String.valueOf(state.getCalculVal()));
        state.setEvaluated(true);
    }

    /**
     *
     * @param val opérande venant de la valeur courante
     * @return le résultat du calcul (en double)
     */
    protected abstract double calcul(double val);

}

