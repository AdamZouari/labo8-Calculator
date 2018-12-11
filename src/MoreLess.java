public class MoreLess extends NumberCreation{

    public MoreLess(State state){
        super(state);
    }

    @Override
    void create(String val) {

        if( val.charAt(0) == '-'){
            state.updateVal(val.substring(1));
        }else{
            state.updateVal("-" + val);
        }
    }

}