public class Enter extends MemoryOperation {

    public Enter(State state){
        super(state);
    }

    @Override
    void changeMemory() {
        state.push(Double.parseDouble(state.getInput()));
        state.updateInput("0");
    }

}
