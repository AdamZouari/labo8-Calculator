abstract class NumberCreation extends Operator {

    NumberCreation(State state){
        this.state = state;
    }

    public void execute(){
        create(state.getInput());
    }

    abstract void create(String val);
}
