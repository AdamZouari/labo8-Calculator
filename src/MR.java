/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe MR permet de récupérer la valeur stockée en mémoire
 *
 */
public class MR extends MemoryOperation {

    /**
     * @param state état interne de la machine
     */
    MR(State state){
        super(state);
    }

    /**
     * Méthode qui récupère la valeur stockée en mémoire
     */
    @Override
    protected void changeMemory() {
        state.updateInput(state.getMemoryStore());
    }
}
