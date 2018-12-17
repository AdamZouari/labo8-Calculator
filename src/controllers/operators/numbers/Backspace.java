package controllers.operators.numbers;

import controllers.State;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Backspace nous permet de supprimer le dernier élément du nombre (s'il existe) et si la valeur n'a pas
 * été évalué
 *
 */
public class Backspace extends NumberCreation
{


    /**
     * Constructeur de Backspace
     *
     * @param state état interne de la machine
     */
    public Backspace(State state){
        super(state);
    }

    /**
     * On redéfinie la méthode execute pour que le backspace ne fasse rien si la valeur est une valeur évalué
     */
    @Override
    public void execute() {
        if(!state.isEvaluated()) {
            create(state.getInput());
        }
    }

    /**
     * Permet de supprimer le dernier élément ou de remettre à 0 si on supprime un chiffre
     * @param val valeur courante (créé par l'utilisateur)
     */
    @Override
    protected void create(String val) {
            if (val.length() <= 1) {
                state.updateInput("0");
            } else {
                state.updateInput(state.getInput().substring(0, state.getInput().length() - 1));
            }
    }
}
