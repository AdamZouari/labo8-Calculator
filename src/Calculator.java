import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
	private State state;

	public Calculator(State state) {
		this.state = state;
	}

	private void ajoutDeFonctionalite(Map<String, Operator> operatorMap, State state) {
		// BinaryOperation
		operatorMap.put("+", new Add(state));
		operatorMap.put("-", new Substract(state));
		operatorMap.put("*", new Multiply(state));
		operatorMap.put("/", new Divide(state));

		// UnaryOperation
		operatorMap.put("sqrt", new SquareRoot(state));
		operatorMap.put("x^2", new Square(state));
		operatorMap.put("1/x", new Inverse(state));
		operatorMap.put("+/-", new MoreLess(state));

		// MemoryOperation
		operatorMap.put("MR", new MR(state));
		operatorMap.put("MS", new MS(state));
		operatorMap.put("<=", new Backspace(state));
		operatorMap.put("CE", new CE(state));
		operatorMap.put("C", new C(state));

		// TODO Assistant: rajoute ta methode ici connard!

	}

	public void calcul() {

		State state = new State();
		Map<String, Operator> operatorMap = new HashMap<>();
		ajoutDeFonctionalite(operatorMap, state);

		Scanner sin = new Scanner(System.in);
		boolean isFirstEntry = true;

		System.out.print("> ");
		while (sin.hasNext()) {
			double d = 0;
			if (sin.hasNextDouble()) { // l'entree est un réel
				if (!isFirstEntry && !state.isEvaluated())
					new Enter(state).execute();

				d = sin.nextDouble();
				new Number(Double.toString(d), state).execute();

			} else {
				String entry = sin.next();
				if (operatorMap.containsKey(entry)) {
					operatorMap.get(entry).execute();
				}else {
					System.out.println("Entrée invalide ");
				}
			}
			System.out.println("Current Value : " + state.getInput() + " Stack : " + Arrays.toString(state.getStack()));
			isFirstEntry = false;
			System.out.print("> ");
		}

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator(new State());
		calc.calcul();
	}

}
