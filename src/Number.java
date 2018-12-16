public class Number extends NumberCreation{

    private String number;

    public Number(String number, State state){
        super(state);
        this.number = number;
    }

    @Override
    protected void create(String val) {

       if(val.equals("0"))
            state.updateInput(number);
       else if (val.contains(".") || val.length() > 0){
           state.appendInput(number);
       }
    }
}
