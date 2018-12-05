import java.util.Stack;

public class State {

    private Stack<Double> stack;
    private String currentVal;
    private String memoryStore;

    public State(){
        stack = new Stack<Double>();
        currentVal = "0";
    }

    public void push(Double s){
        stack.push(s);
    }

    public Double pop(){
        return stack.pop();
    }

    public Double[] getStack() {
        Double[] tab = new Double[stack.size()];
        stack.toArray(tab);
        Double temp;
        if(tab.length > 1) {
            for (int i = 0; i < (tab.length / 2); i++) {
                temp = tab[i];
                tab[i] = tab[tab.length - 1 - i];
                tab[tab.length - i - 1] = temp;
            }
        }
        return tab;
    }

    public String getCurrentVal() {
        return currentVal;
    }

    public void appendVal(String val){
        currentVal += val;
    }

    public void updateVal(String val){
        currentVal = val;
    }

    public void cleanStack(){
        while (!stack.empty()){
            stack.pop();
        }
    }

    public String getMemoryStore() {
        return memoryStore;
    }

    public void setMemoryStore(String memoryStore) {
        this.memoryStore = memoryStore;
    }
}