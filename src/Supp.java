// TODO voir ou le met dans l'arbo et empecher si evaluer
public class Supp extends Operator
{

    public Supp(State state){
        this.state = state;
    }

    @Override
    void execute() {
        String currentVal = state.getInput();
        if(currentVal.length() <= 1) {
            state.updateInput("0");
        }else {
            state.updateInput(state.getInput().substring(0, state.getInput().length() - 1));
        }
    }
}
