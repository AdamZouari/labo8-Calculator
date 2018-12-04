import java.util.Stack;

public class State {

    private Stack<Double> stack;
    private String currentVal;

    public void push(Double s){
        stack.push(s);
    }

    public Double pop(){
        return stack.pop();
    }

    public Double[] getStack() {
        Double[] tab = new Double[stack.size()];
        return stack.toArray(tab);
    }

    public String getCurrentVal() {
        return currentVal;
    }

    public void append(String val){
        currentVal += val;
    }

    public void insert(String val){
        currentVal = val + currentVal;
    }
}