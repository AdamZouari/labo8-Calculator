public class Number extends Operator{

    private String number;

    public Number(String number, State state){
        this.number = number;
        this.state = state;
    }

    @Override
    void execute() {
       String currentVal = state.getCurrentVal();
       if(currentVal.charAt(0) == '0' && currentVal.length() == 1)
            state.updateVal(number);
       else if (currentVal.contains(".") || currentVal.length() > 0){
           state.appendVal(number);
       }
    }
}
