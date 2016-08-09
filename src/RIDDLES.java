import javax.swing.JOptionPane;

public class RIDDLES {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Score = 0;
		// 3. Ask the user a riddle. Here are some ideas: nuuuuuuuuuu
String Riddle_Answer_1 = JOptionPane.showInputDialog("There are 100 bricks on a plane. 1 falls off. How many are left");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
 if(Riddle_Answer_1.equals("99")){
	 JOptionPane.showMessageDialog(null, "Correct");
 Score++;
 }
//5. Otherwise, say "wrong" and tell them the answer

			else{
		 JOptionPane.showMessageDialog(null, "I- I'm not sure what to think. And I'm the computer. The answer was 99.");
	 
	}
		// 6. Add some more riddles
 String Riddle_Answer_2 = JOptionPane.showInputDialog("What are the three steps to putting an elephant in the refrigerator?(Use correct punctuation)");
 if(Riddle_Answer_2.equals("Open the door, put the elephant in, and close the door.")){
	 JOptionPane.showMessageDialog(null, "Correct");
	 Score++;

 }

			else{
		 JOptionPane.showMessageDialog(null, "No. The answer was Open the door, put the elephant in, and close the door.");
	 
	}

 String Riddle_Answer_3 = JOptionPane.showInputDialog("What are the 4 steps to putting a giraffe in the refrigerator?(Use correct gramar)");
 if(Riddle_Answer_3.equals("Open the door, take the elephant out, put the giraffe in, and close the door.")){
	 JOptionPane.showMessageDialog(null, "Correct");
	 Score++;

 }

			else{
		 JOptionPane.showMessageDialog(null, "The Sneaky Snek says Nope. The answer was Open the door, take the elephant out, put the giraffe in, and close the door.");
	 
	}

 String Riddle_Answer_4 = JOptionPane.showInputDialog("The Lion King is having a birthday. All animals come but 1. Which animal is that and why?");
 if(Riddle_Answer_4.equals("The giraffe.  He's stuck in the refrigerator you put him in.")){
	 JOptionPane.showMessageDialog(null, "Correct");
	 Score++;

 }

			else{
		 JOptionPane.showMessageDialog(null, "The snooping Snek says No. The answer was The giraffe.  He's stuck in the refrigerator you put him in.");
	 
	}

 String Riddle_Answer_5 = JOptionPane.showInputDialog("Billy Bob Joe has to cross an crocodile infested river. He swims across safely. Why is that?");
 if(Riddle_Answer_5.equals("The crocodiles are at the party.")){
	 JOptionPane.showMessageDialog(null, "Correct");
	 Score++;

 }

			else{
		 JOptionPane.showMessageDialog(null, "The Fabulos Snek With a Top Hat say Blergh. The answer was The crocodiles are at the party.");
	 
	}

 String Riddle_Answer_6 = JOptionPane.showInputDialog("Billy Bob Joe dies anyway. Why?");
 if(Riddle_Answer_6.equals("He was hit by a falling brick.")){
	 JOptionPane.showMessageDialog(null, "Correct");
	 Score++;

 }

			else{
		 JOptionPane.showMessageDialog(null, "The snek Tzar says for you to be beheaded. The answer was He was hit by a falling brick");
	 
	}

 
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, Score + "");
		JOptionPane.showMessageDialog(null, "If you got any answer wrong because of grammar, it is entirely your fault");
	}
}
