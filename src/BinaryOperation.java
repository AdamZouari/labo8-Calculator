abstract class BinaryOperation extends Operator{

    BinaryOperation(State state){
        this.state = state;
    }

    public void execute(){

        state.updateVal(calcul(state.pop(),Double.parseDouble(state.getInput())));
        state.updateInput(String.valueOf(state.getCurrentVal()));
        state.setEvaluated(true);

    }

    abstract Double calcul(Double op1, Double op2);
}
