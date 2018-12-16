public class Dot extends NumberCreation{


    public Dot(State state){
        super(state);
    }

    @Override
    protected void create(String val) {

        if(!val.contains(".")) {
            state.appendInput(".");
        }

    }
}
