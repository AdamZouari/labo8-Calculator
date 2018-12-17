/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe CE permet de réinitialiser l’affichage
 *
 */
public class CE extends MemoryOperation {

    /**
     * @param state état interne de la machine
     */
    CE(State state){
        super(state);
    }

    /**
     * Methode qui réinitialise l'affichage
     */
    @Override
    protected void changeMemory() {
        state.updateInput("0");
    }

}
