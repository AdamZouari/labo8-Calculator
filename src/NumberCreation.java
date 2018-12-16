abstract class NumberCreation extends Operator {

    NumberCreation(State state){
        this.state = state;
    }

    public void execute(){

            if (state.isEvaluated() || state.isStored()) {
                if(this.getClass() == Backspace.class) {
                    return;
                }
                if(!state.isStored()) {
                    state.push(Double.parseDouble(state.getInput()));
                }
                state.updateInput("0");
                state.setEvaluated(false);
            }

        create(state.getInput());
    }
    protected abstract void create(String val);
}
