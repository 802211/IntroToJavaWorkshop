package day3;

import javax.swing.JOptionPane;

public class snooper {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog( "what is your name?");
	String answer2=JOptionPane.showInputDialog("how old are you?");
	String answer3=JOptionPane.showInputDialog("where do you live?");
	String answer4=JOptionPane.showInputDialog("who's in your family?");
    JOptionPane.showMessageDialog(null, "you're doing wonderful! Some more questions!");
	String answer5=JOptionPane.showInputDialog("Would you like to meet me at night later?");
	String answer6=JOptionPane.showInputDialog("are you sure?");
	String answer7=JOptionPane.showInputDialog( "are you male or female?");
	JOptionPane.showMessageDialog(null, "Amazing answers! Keep going!");
	String answer8=JOptionPane.showInputDialog("what is your credit card number?");
	String answer9=JOptionPane.showInputDialog("when do you go on vacation and when are you going?");
	JOptionPane.showMessageDialog(null, "nice!");
	JOptionPane.showMessageDialog(null, " I know that your name is "+answer+" you are "+answer2+"I know you live in "+answer3);
	
	
}
}
