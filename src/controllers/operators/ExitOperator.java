package controllers.operators;

import controllers.Operator;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe ExitOperator nous permet, en mode console, de sortir de notre application
 *
 */
public class ExitOperator extends Operator {

	/**
	 * la méthode execute redéfinie nous permet de sortir de notre application
	 */
	@Override
	public void execute() {
		System.exit(0);
	}

}
