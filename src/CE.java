public class CE extends MemoryOperation {

    public CE(State state){
        super(state);
    }

    @Override
    void changeMemory() {
        state.updateInput("0");
        state.setError(false);
    }

}
