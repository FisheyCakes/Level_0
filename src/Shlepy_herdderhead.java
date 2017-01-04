
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class Shlepy_herdderhead {

	public static void main(String[] args) {

		//boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * 
		 * JOptionPane.YES_NO_OPTION);
		 */
		int TheDuckIsFamily = JOptionPane.showConfirmDialog(null, "Is it wednesday", "", JOptionPane.YES_NO_OPTION);
		int TheDuckIsNotFamily = JOptionPane.showConfirmDialog(null, "Is is Vacation day", "",
				JOptionPane.YES_NO_OPTION);
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
		if (TheDuckIsFamily == 1 && TheDuckIsNotFamily == 1) {
			JOptionPane.showMessageDialog(null, "It is inded not Wednesday, my BOIS");

		}
		if (TheDuckIsFamily == 0 && TheDuckIsNotFamily == 0) {
			JOptionPane.showMessageDialog(null, "It is inded Wednesday, my BOIS");
		}
		if (TheDuckIsFamily == 1 && TheDuckIsNotFamily == 0) {
			JOptionPane.showMessageDialog(null, "It is inded actually Wednesday, my BOIS");
		}
		if (TheDuckIsFamily == 0 && TheDuckIsNotFamily == 1) {
			JOptionPane.showMessageDialog(null, "It is inded not Wednesday, my BOIS");
		}
		JOptionPane.showMessageDialog(null, "The phrase 'My Bois' is totally NOT sexist");
	}
}
