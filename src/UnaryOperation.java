abstract class UnaryOperation extends Operator {

    UnaryOperation(State state){
        this.state = state;
    }
    public void execute() {

        state.updateVal(calcul(state.getInput()));

    }

    abstract Double calcul(String val);

}

