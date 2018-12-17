package controllers.operators.memory;

import controllers.State;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Enter permet de stocker la valeur courante sur la pile et de reinitialiser l'affichage
 *
 */
public class Enter extends MemoryOperation {

    /**
     * @param state état interne de la machine
     */
    public Enter(State state){
        super(state);
    }

    /**
     * Méthode qui stocke la valeur courante sur la pile et reinitialiser l'affichage
     */
    @Override
    protected void changeMemory() {
        state.push(Double.parseDouble(state.getInput()));
        state.updateInput("0");
    }
}