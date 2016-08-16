
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Tortise_Color_Chooser {
	public static void main(String[] args) {
			for (int i = 0; i < 11; i++) {
				
			
		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog(
				"What color do you want your tortoise's shape to be?(Out of Red, Blue, Yellow, Green, Orange, or Purple)");
		// 4. use an if/else statement to set the pen color that the user
		// requested
		if (color.equals("Red")) {
			Tortoise.setPenColor(Color.red);
		}
		if (color.equals("Blue")) {
			Tortoise.setPenColor(Color.blue);
		}

		if (color.equals("Yellow")) {
			Tortoise.setPenColor(Color.yellow);
		}

		if (color.equals("Green")) {
			Tortoise.setPenColor(Color.green);
		}
		if (color.equals("Orange")) {
			Tortoise.setPenColor(Color.orange);
		}

		if (color.equals("Purple")) {
			Tortoise.setPenColor(Color.MAGENTA);
		}

		// 5. if the user doesn’t enter anything, choose a random color
		else{
			Tortoise.setPenColor(Color.green);
			
		}
		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape (this will take more than one line
		// of code)
		Tortoise.move(100);
		Tortoise.turn(120);
		Tortoise.move(100);
		Tortoise.turn(120);
		Tortoise.move(100);

	}
}
}