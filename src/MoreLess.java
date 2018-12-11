public class MoreLess extends NumberCreation{

    public MoreLess(State state){
        super(state);
    }

    @Override
    String create() {
        return null;
        /*String currentVal = state.getCurrentVal();
        if( currentVal.charAt(0) == '-'){
            state.updateVal(currentVal.substring(1));
        }else{
            state.updateVal("-" + currentVal);
        }
        * */
    }


}