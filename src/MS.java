public class MS extends Operator{

    public MS(State state){
        this.state = state;
    }

    @Override
    void execute() {
        state.setMemoryStore(state.getCurrentVal());
        state.updateVal("0");
    }
}
