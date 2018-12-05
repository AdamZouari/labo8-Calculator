public class MoreLess extends Operator{

    public MoreLess(State state){
        this.state = state;
    }
    @Override
    void execute() {
        String currentVal = state.getCurrentVal();
        if( currentVal.charAt(0) == '-'){
            state.updateVal(currentVal.substring(1));
        }else{
            state.updateVal("-" + currentVal);
        }
    }
}
