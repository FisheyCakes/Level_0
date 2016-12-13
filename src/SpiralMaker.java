// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


import org.teachingextensions.logo.Tortoise;


public class SpiralMaker {


	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		
		// 3. Make a variable to hold the number of sides and set it to 0
		
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String twigs = JOptionPane.showInputDialog("Choose 1(Square, Triangle, or Pentagon)");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
	int ducks = 0;
		if(twigs.equalsIgnoreCase("square")){
			 ducks = 4;
		}
		else if(twigs.equalsIgnoreCase("triangle")){
			 ducks = 3;
		}
		else if(twigs.equalsIgnoreCase("pentagon")){
			 ducks = 5;
		}
		else
			JOptionPane.showMessageDialog(null, "I can't draw that so be a good fool and choose something else");
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		
		for(int i = 0; i <= 80; i++){
		int q = 4*i; 
		Tortoise.move(q);
		Tortoise.turn(360/ducks);
		
		}
		//Move the Tortoise a distance of 4 multiplied by i
		//Turn the Tortoise 360/4
		
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}


}




