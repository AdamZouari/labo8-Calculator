import java.util.Stack;

public class State {

    private Stack<Double> stack = new Stack<Double>();
    private Double currentVal;
    private String input, memoryStore;
    private Boolean isEvaluated, isError;

    public State(){
        input = "0";
    }

    public void push(Double d){
        stack.push(d);
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

    public Double getCurrentVal() {
        return currentVal;
    }

    //TODO a checker
    public void append(String val){
        currentVal += val;
    }

    public void updateVal(Double val){
        currentVal = val;
    }

    public void cleanStack(){
        while (!stack.empty()){
            pop();
        }

    }

    public String getMemoryStore() {
        return memoryStore;
    }

    public void setMemoryStore(String memoryStore) {
        this.memoryStore = memoryStore;
    }

    public Boolean isEvaluated() {
        return isEvaluated;
    }

    public Boolean isEmptyStack(){
        return stack.isEmpty();
    }

    public Boolean getError() {
        return isError;
    }

    public void setError(Boolean error) {
        isError = error;
    }
}