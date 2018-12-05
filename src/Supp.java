public class Supp extends Operator
{

    public Supp(State state){
        this.state = state;
    }

    @Override
    void execute() {
        String currentVal = state.getCurrentVal();
        if(currentVal.length() <= 1) {
            state.updateVal("0");
        }else {
            state.updateVal(state.getCurrentVal().substring(0, state.getCurrentVal().length() - 1));
        }
    }
}
