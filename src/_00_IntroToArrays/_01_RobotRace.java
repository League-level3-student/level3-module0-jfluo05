package _00_IntroToArrays;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
static boolean isAtTop=false;          
	// 1. make a main method
	public static void main(String[] args) {
		Random r = new Random();
		// 2. create an array of 5 robots.
		Robot[] robArray = new Robot[5];
		int a = 0;
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robArray.length; i++) {
			robArray[i] = new Robot();
			robArray[i].setX(60+175*i);
			robArray[i].setY(500);
			robArray[i].setAngle(0);
			robArray[i].setSpeed(10);
		
			
		}
		
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		while (!isAtTop) {
			for ( a = 0; a < robArray.length; a++) {
				robArray[a].move(r.nextInt(200));
			if (robArray[a].getY() <= 0 + 50) {
				JOptionPane.showMessageDialog(null, "Robot "+(a+1)+" wins!");
				isAtTop = true;
				break;
			}
			
			}}
		robArray[a].setX(225);
		robArray[a].setY(350);
		robArray[a].sparkle();
		robArray[a].penDown();
		robArray[a].setPenColor(Color.cyan);
		
		
		
		for(int i=0; i<10000; i++) {
			robArray[a].setPenWidth(i);
			robArray[a].setSpeed(255);
			robArray[a].move(200);
			robArray[a].turn(210);
		}

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.


	}
}