/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe NumberCreation concerne toute la partie affichage de l'état interne de notre calculatrice( il nous permet
 * de "créer" un nombre. Les sous-classes sont Number, Dot et Backspace.
 *
 */
abstract class NumberCreation extends Operator {


    /**
     * @param state état interne de la machine
     */
    NumberCreation(State state){
        this.state = state;
    }

    /**
     * Méthode permettant de créer un nombre en ajoutant des chiffres ou des points en fonction des touches appuyées
     * par l'utilisateur. Si un résultat est considérer comme évalué( après une opération ou une mise en mémoire) la
     * valeur est stockée sur la pile et on remet la valeur courante à l'état de base.
     */
    public void execute(){

            if (state.isEvaluated()) {
                state.push(Double.parseDouble(state.getInput()));
                state.updateInput("0");
                state.setEvaluated(false);
            }

        create(state.getInput());
    }

    /**
     * La méthode create nous permet de "construire" notre nombre
     * @param val valeur courante (créé par l'utilisateur)
     */
    protected abstract void create(String val);
}
