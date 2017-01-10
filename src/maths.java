import javax.swing.JOptionPane;

public class maths {
public static void main(String[] args) {
	String q = JOptionPane.showInputDialog("Choose a number");
	String w = JOptionPane.showInputDialog("Choose another number");
	int x = Integer.parseInt(q);
	int y = Integer.parseInt(w);
	int s = x+=y;
	JOptionPane.showMessageDialog(null, ""+s);
}
}
