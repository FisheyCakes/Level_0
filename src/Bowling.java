import javax.swing.JOptionPane;

public class Bowling {
	public static void main(String[] args) {

		String Score = JOptionPane.showInputDialog("What's your highest bowling score?");
		int q = Integer.parseInt(Score);
		if (q < 100 && q>=0) {
			JOptionPane.showMessageDialog(null, "You're a noob you need to practice more");
		}
		if (q >= 100 && q < 200) {
			JOptionPane.showMessageDialog(null, "You are a do a good");
		}
		if (q > 199 && q <= 300) {
			JOptionPane.showMessageDialog(null, "You are Mlg Pro 360 no scope pro");
		}
		if (q > 300) {
			JOptionPane.showMessageDialog(null, "LIER");
		}
		if(q<0){
			JOptionPane.showMessageDialog(null, "LIER");
		}
	}
}
