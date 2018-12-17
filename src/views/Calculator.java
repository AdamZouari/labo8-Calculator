package views;

import controllers.Operator;
import controllers.State;
import controllers.operators.ExitOperator;
import controllers.operators.binary.*;
import controllers.operators.unary.*;
import controllers.operators.memory.*;
import controllers.operators.numbers.*;
import controllers.operators.numbers.Number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Calculator sert à représenter la calculatrice en mode console
 *
 */

public class Calculator {
	private State state; // L'état de la calculatrice
	private Map<String, Operator> operatorMap; // Liste des fonctionnalités (opérateurs) disponibles

	/**
	 * Constructeur de la classe
	 */
	public Calculator() {
		state = new State();
		operatorMap = new HashMap<>();
		ajoutDeFonctionalite();
	}

	/**
	 * Méthode privé qui de permet de remplir la liste de fonctionnalité
	 */
	private void ajoutDeFonctionalite() {
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
		operatorMap.put("enter", new Enter(state));

		// ExitOperation
		operatorMap.put("exit", new ExitOperator());

		// Possibilité de rajout d'opérations
	}

	/**
	 * Méthode qui lance la calculatrice
	 */
	public void calcul() {
		Scanner sin = new Scanner(System.in);
		boolean isFirstEntry = true;
		System.out.print("> ");

		while (sin.hasNext()) {
			if (sin.hasNextDouble()) {

				double d = sin.nextDouble();

				//Fait un Enter si l'utilisateur veut rentrer une deuxième valeur
				if (!isFirstEntry && !state.isEvaluated())
					new Enter(state).execute();

				new Number(Double.toString(d), state).execute();

			} else {
				String entry = sin.next();

				if (operatorMap.containsKey(entry)) {
					operatorMap.get(entry).execute();
				} else {
					System.out.println("Entrée invalide ");
				}
			}
			// Affichage
			System.out.println("Current Value : " + state.getInput() + " Stack : " + Arrays.toString(state.getStack()));

			isFirstEntry = false;
			System.out.print("> ");
		}

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.calcul();
	}

}