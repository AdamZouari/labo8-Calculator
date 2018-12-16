/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 *
 *
 */
public class CE extends MemoryOperation {

    public CE(State state){
        super(state);
    }

    @Override
    protected void changeMemory() {
        state.updateInput("0");
    }

}
