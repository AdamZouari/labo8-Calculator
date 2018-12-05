public class C extends Operator {

    public C(State state){
        this.state = state;
    }

    @Override
    void execute() {
        state.updateVal("0");
    }
}
