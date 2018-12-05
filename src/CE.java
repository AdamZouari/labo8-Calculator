public class CE extends Operator{

    public CE(State state){
        this.state = state;
    }

    @Override
    void execute() {
        state.cleanStack();
        state.updateVal("0");
    }
}
