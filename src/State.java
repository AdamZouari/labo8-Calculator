import java.util.Stack;

public class State {

    private Stack<Double> stack;
    private String currentVal;

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
        return stack.toArray(tab);
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
}