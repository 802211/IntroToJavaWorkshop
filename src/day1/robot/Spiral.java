package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot Wolf=new Robot("Batman");
		
		// 5. Set your robot's pen to the down position
		Wolf.penDown();

		 Wolf.setSpeed(10);

		// 4. for(
		 for (int i = 0; i < 75; i++) {
			
		
			// 7. Change the pen color to random
			 Wolf.setRandomPenColor();
	
			// 6. Wolf.move(5
		 Wolf.move(5*i);
	
			Wolf.turn(360/9);
	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
		 }}}
	
