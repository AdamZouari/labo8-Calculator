//TODO J'ai changé more Less de place pour qu'il puisse être fait sur une valeur évaluée
abstract class NumberCreation extends Operator {

    NumberCreation(State state){
        this.state = state;
    }

    public void execute(){

            if (state.isEvaluated()) {
                if(this.getClass() != Backspace.class || state.isStored()) {
                    state.push(Double.parseDouble(state.getInput()));
                }
                state.updateInput("0");
                state.setEvaluated(false);
            }

        create(state.getInput());
    }
    //TODO changer en protected dans toutes les classes , laisser que execute() en public
    abstract void create(String val);
}
