package views;

import controllers.Operator;
import controllers.operators.binary.*;
import controllers.operators.unary.*;
import controllers.operators.memory.*;
import controllers.operators.numbers.*;
import controllers.operators.numbers.Number; // pour eviter une ambiguité avec java.lang.Number


import controllers.State;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * Modified by Zouari Adam, Blanco Guillaume & Zied Naimi
 * @version 1.0
 *
 * La classe Calculator sert à représenter la calculatrice en mode console
 *
 */
public class JCalculator extends JFrame
{

  private final State state;

  // Tableau representant une pile vide
  private final String[] empty = { "< empty stack >" };

  // Zone de texte contenant la valeur introduite ou resultat courant
  private final JTextField jNumber = new JTextField("0");

  // Composant liste representant le contenu de la pile
  private final JList jStack = new JList(empty);

  // Contraintes pour le placement des composants graphiques
  private final GridBagConstraints constraints = new GridBagConstraints();


  /*
   * Mise a jour de l'interface apres une operation (jList et jStack)
   */
  private void update()
  {
      jNumber.setText(state.getInput());

    if(state.isEmptyStack())
      jStack.setListData(empty);
    else
      jStack.setListData(state.getStack());
  }

  /*
   * Ajout d'un bouton dans l'interface et de l'operation associee,
   * instance de la classe Operation, possedeant une methode execute()
   */
  private void addOperatorButton(String name, int x, int y, Color color, final Operator operator)
  {
    JButton b = new JButton(name);
    b.setForeground(color);
    constraints.gridx = x;
    constraints.gridy = y;
    getContentPane().add(b, constraints);

    b.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	  operator.execute();
	  update();
	}});
  }

  /*
   * Constructeur
   */
  public JCalculator()
  {
    super("JCalculator");
    state = new State();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(new GridBagLayout());

    // Contraintes des composants graphiques
    constraints.insets = new Insets(3, 3, 3, 3);
    constraints.fill = GridBagConstraints.HORIZONTAL;

    // Nombre courant
    jNumber.setEditable(false);
    jNumber.setBackground(Color.WHITE);
    jNumber.setHorizontalAlignment(JTextField.RIGHT);
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 5;
    getContentPane().add(jNumber, constraints);
    constraints.gridwidth = 1; // reset width

    // Rappel de la valeur en memoire
    addOperatorButton("MR", 0, 1, Color.RED, new MR(state));

    // Stockage d'une valeur en memoire
    addOperatorButton("MS", 1, 1, Color.RED,new MS(state));

    // Backspace
    addOperatorButton("<=", 2, 1, Color.RED, new Backspace(state));

    // Mise a zero de la valeur courante + suppression des erreurs
    addOperatorButton("CE", 3, 1, Color.RED, new CE(state));

    // Comme CE + vide la pile
    addOperatorButton("C",  4, 1, Color.RED, new C(state));

    // Boutons 1-9
    for (int i = 1; i < 10; i++) 
      addOperatorButton(String.valueOf(i), (i - 1) % 3, 4 - (i - 1) / 3, 
			Color.BLUE, new Number(String.valueOf(i), state));
    // Bouton 0
    addOperatorButton("0", 0, 5, Color.BLUE, new Number("0", state));

    // Changement de signe de la valeur courante
    addOperatorButton("+/-", 1, 5, Color.BLUE, new MoreLess(state));

    // Operateur point (chiffres apres la virgule ensuite)
    addOperatorButton(".", 2, 5, Color.BLUE, new Dot(state));

    // Operateurs arithmetiques a deux operandes: /, *, -, +
    addOperatorButton("/", 3, 2, Color.RED, new Divide(state));
    addOperatorButton("*", 3, 3, Color.RED, new Multiply(state));
    addOperatorButton("-", 3, 4, Color.RED, new Substract(state));
    addOperatorButton("+", 3, 5, Color.RED, new Add(state));


    // Operateurs arithmetiques a un operande: 1/x, x^2, Sqrt
    addOperatorButton("1/x", 4, 2, Color.RED, new Inverse(state));
    addOperatorButton("x^2", 4, 3, Color.RED, new Square(state));
    addOperatorButton("Sqrt", 4, 4, Color.RED, new SquareRoot(state));

    // Entree: met la valeur courante sur le sommet de la pile
    addOperatorButton("Ent", 4, 5, Color.RED, new Enter(state));

    // Affichage de la pile
    JLabel jLabel = new JLabel("Stack");
    jLabel.setFont(new Font("Dialog", 0, 12));
    jLabel.setHorizontalAlignment(JLabel.CENTER);
    constraints.gridx = 5;
    constraints.gridy = 0;
    getContentPane().add(jLabel, constraints);

    jStack.setFont(new Font("Dialog", 0, 12));
    jStack.setVisibleRowCount(8);
    JScrollPane scrollPane = new JScrollPane(jStack);
    constraints.gridx = 5;
    constraints.gridy = 1;
    constraints.gridheight = 5;
    getContentPane().add(scrollPane, constraints);
    constraints.gridheight = 1; // reset height

    setResizable(false);
    pack();
  }
    
  /*
   * main()
   */
  public static void main(String args[]) {
    new JCalculator().setVisible(true);
  }
}
