package controllers;

import java.util.Stack;
/**
 *
 * @author Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe State permet de représenter l'état interne de notre calculatrice
 *
 */
public class State {

    private Stack<Double> stack = new Stack<Double>();
    private double calculVal;
    private String input, memoryStore;
    private boolean isEvaluated;

    /**
     * Consttructeur de State
     *
     */
    public State(){
        input = "0";
        memoryStore = "0";
    }

    /**
     *
     * @param nombre  le nombre que l'on va empiler sur la stack
     */
    public void push(double nombre){
        stack.push(nombre);
    }

    /**
     *
     * @return le double que l'on a désempiler de la stack
     */
    public double pop(){
        return stack.pop();
    }

    /**
     *
     * @return un tableau de double contenant toutes les valeurs de la stack
     */
    public Double[] getStack() {
        Double[] tab = new Double[stack.size()];
        stack.toArray(tab);
        double temp;
        if(tab.length > 1) {
            // on inverse le tableau avant de le renvoyer car la stack java ne retourne pas les valeurs dans le sens
            // que nous désirons
            for (int i = 0; i < (tab.length / 2); i++) {
                temp = tab[i];
                tab[i] = tab[tab.length - 1 - i];
                tab[tab.length - i - 1] = temp;
            }
        }
        return tab;
    }


    /**
     * Supprime tous les éléments de la stack
     */
    public void cleanStack(){
        while (!stack.empty()){
            pop();
        }

    }

    /**
     *
     * @return un booleen indiquant si la stack est vide ou non
     */
    public boolean isEmptyStack(){
        return stack.isEmpty();
    }

    /**
     *
     * @return la valeur stocker dans calculVal
     */
    public double getCalculVal() {
        return calculVal;
    }

    /**
     *
     * @param val la valeur que l'on veut stocker dans caclculVal
     */
    public void updateVal(double val){calculVal = val;}


    /**
     *
     * @return Une Error si on a une valeur NaN et l'input sinon (comme les calculs sont gérer par Java, il peut
     * renvoyer un NaN que nous traitons ici.
     */
    public String getInput(){
        return input == "NaN" ? "Error" : input;
    }

    /**
     *
     * @param val valeur que l'on va ajouter à notre nombre
     */
    public void appendInput(String val){input += val;}

    /**
     *
     * @param val valeur avec laquelle on va remplacer notre nombre actuel
     */
    public void updateInput(String val){
        input = val;
    }


    /**
     *
     * @return la valeur stocker dans memoryStore
     */
    public String getMemoryStore() {
        return memoryStore;
    }

    /**
     *
     * @param memoryStore la valeur que l'on va stocker dans memoryStore
     */
    public void setMemoryStore(String memoryStore) {
        this.memoryStore = memoryStore;
    }


    /**
     *
     * @return un boolen indiquant si la valeur est une valeur évalué (retourner d'un calcul ou stockée en mémoire).
     */
    public boolean isEvaluated() {
        return isEvaluated;
    }

    /**
     *
     * @param evaluated la valeur que l'on va stocker dans evaluated
     */
    public void setEvaluated(Boolean evaluated) {
        isEvaluated = evaluated;
    }

}