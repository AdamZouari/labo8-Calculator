/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 *
 *
 */
public class MR extends MemoryOperation {

    public MR(State state){
        super(state);
    }

    // TODO Après un enter le MR supprime l'affichage voir pk


    // TODO A GARDER pour les remarques : comme mémory store n'est pas grisé comme dans la calculette windows on init la valeur memoire à 0 (STRING)
    @Override
    protected void changeMemory() {
        state.updateInput(state.getMemoryStore());
    }

}
