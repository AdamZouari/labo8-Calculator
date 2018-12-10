abstract class UnaryOperation extends Operator {

    UnaryOperation(State state){
        this.state = state;
    }
    public void execute() {

        state.updateVal(String.valueOf(calcul(state.getCurrentVal())));

    }

    abstract Double calcul(String val);

}

