package controllers;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe abstraite Operator nous permet de faire en sorte que les sous-classes (BinaryOperation, UnaryOperation,
 * MemoryOperation et NumberCreation) redéfinissent la méthode execute.
 *
 */
public abstract class Operator
{
    /**
     *  Methode abstraite qui devra etre redefinis dans les sous-classes
     *  et qui sert a factoriser le code en fonction du comportement général.
     *
     * */
  abstract public void execute();

  protected State state;

}
