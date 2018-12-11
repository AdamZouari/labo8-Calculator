public class Number extends NumberCreation{

    private String number;

    public Number(String number, State state){
        super(state);
        this.number = number;
    }

    @Override
    String create() {
        return null;
        /*
        * String currentVal = state.getCurrentVal();
       if(currentVal == "0")
            state.updateVal(number);
       else if (currentVal.contains(".") || currentVal.length() > 0){
           state.appendVal(number);
       }*/
    }
}
