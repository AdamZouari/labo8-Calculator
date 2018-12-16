/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 *
 *
 */
public class C extends MemoryOperation {

    public C(State state){
        super(state);
    }

    @Override
    protected void changeMemory() {
        state.updateInput("0");
        state.cleanStack();
    }

}
