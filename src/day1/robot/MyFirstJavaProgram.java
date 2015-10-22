package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot Wolf=new Robot("batman");
	
		
		
		for (int i = 0; i < 4; i++) {
			Wolf.penDown();
			Wolf.move(66);
			Wolf.turn(90);
			
		}
		
		
		
		Wolf.penDown();
		Wolf.move(35);
		Wolf.turn(90);
		Wolf.move(35);
		Wolf.turn(90);
		Wolf.move(35);
		Wolf.turn(90);
		Wolf.move(40);
		
		Wolf.move(102);
		Wolf.turn(65);
		Wolf.sparkle();
		Wolf.penDown();
		Wolf.turn(360);
		Wolf.miniturize();
	} }