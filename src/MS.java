public class MS extends MemoryOperation {

    public MS(State state){
        super(state);
    }
// TODO quand un memory store à été fait le prochain nombre doit supprimer celui actuel comme si un operation avait été faite
    @Override
    void changeMemory() {
        state.setMemoryStore(state.getInput());
        state.setEvaluated(true);
    }

}
