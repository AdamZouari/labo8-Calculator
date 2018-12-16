/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 *
 *
 */
abstract class MemoryOperation extends Operator{

    MemoryOperation(State state){
        this.state = state;
    }

    @Override
    public void execute() {
        changeMemory();
    }


    protected abstract void changeMemory();
}
