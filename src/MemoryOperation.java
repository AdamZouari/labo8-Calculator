/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe MemoryOperation nous permet de regrouper les opérations de memoires et ainsi factoriser le code.
 */
abstract class MemoryOperation extends Operator{

    MemoryOperation(State state){
        this.state = state;
    }

    /**
     * Méthode permettant de modifier l'etat de la mémoire
     */
    @Override
    public void execute() {
        changeMemory();
    }

    /**
     *  Méthode modifiant la mémoire
     */
    protected abstract void changeMemory();
}
