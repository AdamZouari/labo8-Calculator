import java.util.Stack;

public class State {

    private Stack<Double> stack = new Stack<Double>();
    private double currentVal;
    private String input, memoryStore;
    private boolean isEvaluated, isStored;

    public State(){
        input = "0";
        memoryStore = "0";
    }

    public void push(double d){
        stack.push(d);
    }

    public double pop(){
        return stack.pop();
    }

    public Double[] getStack() {
        Double[] tab = new Double[stack.size()];
        stack.toArray(tab);
        double temp;
        if(tab.length > 1) {
            for (int i = 0; i < (tab.length / 2); i++) {
                temp = tab[i];
                tab[i] = tab[tab.length - 1 - i];
                tab[tab.length - i - 1] = temp;
            }
        }
        return tab;
    }


    public void cleanStack(){
        while (!stack.empty()){
            pop();
        }

    }

    public boolean isEmptyStack(){
        return stack.isEmpty();
    }


    public double getCurrentVal() {
        return currentVal;
    }

    public void updateVal(double val){currentVal = val;}


    public String getInput(){
        return input == "NaN" ? "Error" : input;
    }

    public void appendInput(String val){input += val;}

    public void updateInput(String val){
        input = val;
    }




    public String getMemoryStore() {
        return memoryStore;
    }

    public void setMemoryStore(String memoryStore) {
        this.memoryStore = memoryStore;
    }



    public boolean isEvaluated() {
        return isEvaluated;
    }

    public void setEvaluated(Boolean evaluated) {
        isEvaluated = evaluated;
    }



    public boolean isStored(){return isStored;}

    public void setIsStored(Boolean stored){isStored = stored;}
}