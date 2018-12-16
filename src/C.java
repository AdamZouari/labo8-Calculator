public class C extends MemoryOperation {

    public C(State state){
        super(state);
    }

    @Override
    protected void changeMemory() {
        state.updateInput("0");
        state.cleanStack();
    }

}
