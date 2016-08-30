
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class Airline_Registration {
	public static void main(String[] args) {
		for (int i = 1; i < 11;) {
			String Name = JOptionPane.showInputDialog("Name:");
			String Name_Last = JOptionPane.showInputDialog("Last Name:");
			String age = JOptionPane.showInputDialog("Age:");
			String Gender = JOptionPane.showInputDialog("Gender:");
			String Destination = JOptionPane.showInputDialog("Destination:");
			JOptionPane.showMessageDialog(null, " First Name: " + Name + "\n Last Name: " + Name_Last + "\n Age: " + age
					+ "\n Gender: " + Gender + "\n Destination " + Destination);
			JOptionPane.showMessageDialog(null, "Number Of Passangers: " + i);
			i++;
		}

	}
}

/**
 * Extra Difficult Challenge: have the program repeat until plane is full (10
 * passenger plan) and print out the number of passengers after each boarding
 * pass.
 */