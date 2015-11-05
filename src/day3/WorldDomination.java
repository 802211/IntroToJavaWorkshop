package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String A=JOptionPane.showInputDialog("Do you know how to code?");

		// 2. If they say "yes", tell them they will rule the world.
		if(A.equals("Yes")){JOptionPane.showMessageDialog(null,"You will rule the world.  hopefully.");
		
			
			
		}
		
		

		// 3. Otherwise, wish them good luck washing dishes.
		if(A.equals("No")){JOptionPane.showMessageDialog(null,"Good luck washing dishes! You will not rule the world. I am certain");
	}
}}

