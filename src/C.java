public class C extends MemoryOperation {

    public C(State state){
        super(state);
    }

    @Override
    void changeMemory(String val) {
        state.updateInput("0");
    }

}
