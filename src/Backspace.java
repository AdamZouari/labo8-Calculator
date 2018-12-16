/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 *
 *
 */
public class Backspace extends NumberCreation
{

    public Backspace(State state){
        super(state);
    }

    @Override
    protected void create(String val) {
            if (val.length() <= 1) {
                state.updateInput("0");
            } else {
                state.updateInput(state.getInput().substring(0, state.getInput().length() - 1));
            }
    }

}
