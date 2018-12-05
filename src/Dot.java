public class Dot extends Operator{

    private String dot;

    public Dot(String dot, State state){
        this.dot = dot;
        this.state = state;
    }

    @Override
    void execute() {
        if(state.getCurrentVal() == ""){
            state.updateVal("0");
        }
        if(!state.getCurrentVal().contains(".")) {
            state.appendVal(dot);
        }
    }
}
