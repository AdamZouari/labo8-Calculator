# labo8-Calculator



Voir comment faire pour les opérations :

  - soit trouver un moyen transformer l'operateur string en opérateur de calcul (aucune idée si on peut mais ça serait stylé)
  - soit créer 4 classes différentes (j'aime pas)
  - utiliser des expressions lambda dans des objets ( voir comment faire)

Refactorer
  
  
Questions : 

    - Le Backspace peut-il mettre l'affichage a 0 et push la valeur la stack ?
    - Memory Store met à 0 ou garde la valeur ? et stocke dans la pile

String coucou(double number) {
  double fraction = number - (int) number;
  return (fraction != 0) ? String.valueOf(number) : String.valueOf((int) number);
 }
 
 Ce qu'il reste à faire :
    - checker tous ce qu'il manque et poser les questions (question coucou) - BON
    - corriger ce qu'il manque - BON
    - faire les erreur - BON
    - gérer les exceptions - REGARDER ENCORE
    - faire le main de test - PLUTOT GRILLE DE TEST
    - commenter - Plus que calculator
    - organiser en package & réduire la visibilité
    - faire le rapport + UML
    - voir si on peut pas refactorer plus
    
    
  Ce qu'il reste comme erreur :
  
    - backspace après evaluation : soit mettre ce qu'il y a dans numbercration dans les sous classes / soit booleen isEvaluated / le mettre dans une autre classe

    -regarder si input = currentVal tous les temps - Il faut justifier
    - Expliquer les erreurs dans le rapport et demander si pas trop minimaliste
    - Exception non traité volontairement(stack vide)
    
    
    CE QU'IL RESTE A FAIRE 
    -   UML & TROUVER l'ERREUR EN MODE CONSOLE ( ZIED)
    - RAPPORT (GUILLAUME)
    -PACKAGE ( ADAM)
    