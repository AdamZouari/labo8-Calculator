package controllers.operators.numbers;

import controllers.State;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Number nous permet de rajouter un chiffre à notre nombre
 *
 */
public class Number extends NumberCreation{

    private String number;

    /**
     * Constructeur de Number
     *
     * @param number chiffre que l'on veut rajouter au nombre actuel
     * @param state état interne de la machine
     */
    public Number(String number, State state){
        super(state);
        this.number = number;
    }

    /**
     * Permet de substituer le chiffre si on est dans "l'état de base" ou d'ajouter un chiffre au nombre
     * @param val valeur courante (créé par l'utilisateur)
     */
    @Override
    protected void create(String val) {

       if(val.equals("0"))
            state.updateInput(number);
       else {
           state.appendInput(number);
       }
    }
}
