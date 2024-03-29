package controllers.operators.memory;

import controllers.State;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe MS permet de stocker en mémoire la valeur courante
 *
 */
public class MS extends MemoryOperation {

    /**
     * Constructeur de MS
     *
     * @param state état interne de la machine
     */
    public MS(State state){
        super(state);
    }

    /**
     * Méthode qui stocke la valeur en mémoire et considère la valeur comme évaluée
     */
    @Override
    protected void changeMemory() {
        state.setMemoryStore(state.getInput());
        state.setEvaluated(true);
    }
}
