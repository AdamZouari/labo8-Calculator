// TODO voir ou le met dans l'arbo et empecher si evaluer
public class Backspace extends NumberCreation
{

    public Backspace(State state){
        super(state);
    }

    @Override
    void create(String val) {
        if(val.length() <= 1) {
            state.updateInput("0");
        }else {
            state.updateInput(state.getInput().substring(0, state.getInput().length() - 1));
        }
    }
}
