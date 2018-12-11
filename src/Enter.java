public class Enter extends MemoryOperation {

    public Enter(State state){
        super(state);
    }

    @Override
    void changeMemory(String val) {
        state.push(Double.parseDouble(state.getInput()));
        state.updateInput("0");
    }

}
