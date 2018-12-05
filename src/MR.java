public class MR extends Operator {

    public MR(State state){
        this.state = state;
    }

    @Override
    void execute() {
        state.updateVal(state.getMemoryStore());
    }
}
