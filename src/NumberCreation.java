/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 *
 *
 */
abstract class NumberCreation extends Operator {

    NumberCreation(State state){
        this.state = state;
    }

    public void execute(){

            if (state.isEvaluated()) {
                if(this.getClass() == Backspace.class) {
                    return;
                }
                state.push(Double.parseDouble(state.getInput()));
                state.updateInput("0");
                state.setEvaluated(false);
            }

        create(state.getInput());
    }
    protected abstract void create(String val);
}
