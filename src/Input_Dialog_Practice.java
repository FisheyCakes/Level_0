import javax.swing.JOptionPane;

public class Input_Dialog_Practice {
	public static void main(String[] args) {
		for (int i = 0; i < 987654321; i++) {
			String LTUAE = JOptionPane.showInputDialog("What are ducks?" );
			JOptionPane.showMessageDialog(null, "By your logic, ducks are "
					+ LTUAE);
		}

	}
	

}
