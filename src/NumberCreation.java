//TODO J'ai changé more Less de place pour qu'il puisse être fait sur une valeur évaluée
abstract class NumberCreation extends Operator {

    NumberCreation(State state){
        this.state = state;
    }

    public void execute(){

        if(state.isEvaluated()){
            //TODO c'est la même chose que enter voir s'il y a un moyen de l'appeler et est-ce que ce serait pertinent (on avait perdu des pts je crois ou on nous avait dit que c'était pas bien d'utiliser d'autre fonction)
            state.push(Double.parseDouble(state.getInput()));
            state.updateInput("0");
        }

        create(state.getInput());
        state.setEvaluated(false);
    }

    abstract void create(String val);
}
