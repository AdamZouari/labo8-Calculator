abstract class BinaryOperation extends Operator{

    BinaryOperation(State state){
        this.state = state;
    }

    //TODO Checker si la pile est vide alors Error
    public void execute(){

        state.updateVal(calcul(state.pop(),Double.parseDouble(state.getInput())));
        state.updateInput(String.valueOf(state.getCurrentVal()));
        state.setEvaluated(true);

    }

    abstract double calcul(double op1, double op2);
}
