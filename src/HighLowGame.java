import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(1001);
		// 2. Print out the random variable above
		// System.out.println(random);
		// 10. do the following 10 times

		for (int i = 0; i < 10; i++) {

			// 1. ask the user for a guess using a pop-up window, and save their
			// response
			String Ducks = JOptionPane.showInputDialog("Choose a number between 1 aaannnndd - 1000");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int TwoChickens = Integer.parseInt(Ducks);
			// 5. if the guess is correct
			// 5 pt.2. win
			if (TwoChickens == random) {
				JOptionPane.showMessageDialog(null, "U WIN U R BEST AT EVERYTHIN U GOT DI YA YEE HSHPLHEGH");
			System.exit(0);
			}
			// 6. if the guess is high
			// 7. tell them it's too high
			if (TwoChickens > random) {
				JOptionPane.showMessageDialog(null, "Too high fool");

			}
			// 8. if the guess is low
			// 9. tell them it's too low
			if (TwoChickens < random) {
				JOptionPane.showMessageDialog(null, "Too low fool");
			}
			// 11. tell them they lose
		}
		JOptionPane.showMessageDialog(null, "You lose fool");

	}
}
