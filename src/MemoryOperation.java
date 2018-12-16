//TODO modifier ces putains de noms

abstract class MemoryOperation extends Operator{
    MemoryOperation(State state){
        this.state = state;
    }

    @Override
    void execute() {

        changeMemory();

    }


    protected abstract void changeMemory();
}
