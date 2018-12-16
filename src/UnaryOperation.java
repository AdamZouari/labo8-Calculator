abstract class UnaryOperation extends Operator {

    //TODO voir si on pourra pas factoriser unary et binary

    UnaryOperation(State state){
        this.state = state;
    }
    public void execute() {
        state.updateVal(calcul(Double.parseDouble(state.getInput())));
        state.updateInput(String.valueOf(state.getCurrentVal()));
        state.setEvaluated(true);
    }

    abstract double calcul(double val);

}

