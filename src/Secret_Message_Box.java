// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;


/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class Secret_Message_Box {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
	 
	
	// 1. Set the passcode in a String variable
		String passcode = "Eggassem Terces";
	// 2. Using a pop-up, ask for a secret message and store it in a variable
//String i = JOptionPane.showInputDialog("What is the secret message?");
		
	// 3. Ask your friend for the passcode and store it in a variable
		for(int i = 0; i<=20; i++){
		String ducks = JOptionPane.showInputDialog("What is the passcode?");
	// 4. If the passcode matches, show the secret message
		if(ducks.equals(passcode)){
				JOptionPane.showMessageDialog(null, "One day I was walking and I found a giant log. And I rolled it over and underneath was a tiny stick, and I was like 'That log has a child'");

		}
	// 5. If the passcode does not match, pop-up "INTRUDER!!"
		else{
			JOptionPane.showMessageDialog(null, "No. Bad.");
		}
	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.
	}

}



















}



































































































