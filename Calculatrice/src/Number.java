public class Number extends Operator{

    private String number;

    public Number(String number){
        this.number = number;
    }

    @Override
    void execute() {
        state.append(number);
    }
}
