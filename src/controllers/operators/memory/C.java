package controllers.operators.memory;

import controllers.State;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe C permet de réinitialiser l’affichage et vider la stack
 *
 */
public class C extends MemoryOperation {

    /**
     * Constructeur de C
     *
     * @param state état interne de la machine
     */
    public C(State state){
        super(state);
    }

    /**
     * Methode qui réinitialise l'affichage et vide la stack
     */
    @Override
    protected void changeMemory() {
        state.updateInput("0");
        state.cleanStack();
    }

}
