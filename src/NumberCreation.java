abstract class NumberCreation extends Operator {

    NumberCreation(State state){
        this.state = state;
    }

    public void execute(){
        create(state.getCurrentVal());
    }

    abstract void create(String val);
}
