/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 *
 *
 */
abstract class UnaryOperation extends Operator {

    //TODO voir si on pourra pas factoriser unary et binary

    UnaryOperation(State state){
        this.state = state;
    }
    public void execute() {
        state.updateVal(calcul(Double.parseDouble(state.getInput())));
        state.updateInput(String.valueOf(state.getCalculVal()));
        state.setEvaluated(true);
    }

    protected abstract double calcul(double val);

}

