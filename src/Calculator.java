import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {

    private State state;



    public Calculator(State state) {
        this.state = state;


    }

    public void calcul() {

        State state = new State();
        Map<String, Operator> operatorMap = new HashMap<>();
        init(operatorMap, state);

        Scanner sin = new Scanner(System.in);
        boolean isFirstEntry = true;
        while (sin.hasNext()) {

            System.out.print("> ");

            if (sin.hasNextDouble()) {
                if(!isFirstEntry)new Enter(state).execute();
                double d = sin.nextDouble();
                new Number(Double.toString(d),state).execute();



            } else {

                String entry = sin.next();
                if (operatorMap.containsKey(entry)){
                    operatorMap.get(entry).execute();
                }
            }
            System.out.println("Current Value : " + state.getCurrentVal() + " Stack : " + Arrays.toString(state.getStack()) + " Memory : " + state.getMemoryStore());
            isFirstEntry= false;
        }

    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(new State());
        calc.calcul();
    }

    private static void init(Map<String, Operator> operatorMap, State state) {
        operatorMap.put("+", new Add(state));
        operatorMap.put("-", new Substract(state));
        operatorMap.put("*", new Multiply(state));
        operatorMap.put("/", new Divide(state));
    }
}
