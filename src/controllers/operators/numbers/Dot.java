package controllers.operators.numbers;

import controllers.State;

/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 *
 * La classe Dot nous permet de rajouter un point au nombre inscrit dans la valeur courante
 *
 */
public class Dot extends NumberCreation{



    /**
     * @param state état interne de la machine
     */
    public Dot(State state){
        super(state);
    }

    /**
     * La méthode create redéfinie nous permet de rajouter un point
     * @param val valeur courante (créé par l'utilisateur)
     */
    @Override
    protected void create(String val) {

        if(!val.contains(".")) {
            state.appendInput(".");
        }

    }
}
