public class CE extends MemoryOperation {

    public CE(State state){
        super(state);
    }

    @Override
    void changeMemory(String val) {
        state.cleanStack();
        state.updateInput("0");
    }

}
