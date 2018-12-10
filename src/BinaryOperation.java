abstract class BinaryOperation extends Operator{

    BinaryOperation(State state){
        this.state = state;
    }

    public void execute(){

    }

    abstract void calcul();
}
