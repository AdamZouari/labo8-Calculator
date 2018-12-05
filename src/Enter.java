public class Enter extends Operator {

    public Enter(State state){
        this.state = state;
    }

    @Override
    void execute() {
        state.push(Double.parseDouble(state.getCurrentVal()));
        state.updateVal("0");
    }
}
