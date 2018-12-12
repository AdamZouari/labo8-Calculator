public class C extends MemoryOperation {

    public C(State state){
        super(state);
    }

    @Override
    void changeMemory() {
        state.updateInput("0");
        state.setError(false);
        state.cleanStack();
    }

}
