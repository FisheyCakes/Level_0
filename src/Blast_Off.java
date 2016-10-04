import java.io.IOException;

import javax.swing.JOptionPane;

public class Blast_Off {
public static void main(String[] args) {
	for (int TWIGS = 10; TWIGS > 0 ;TWIGS--){
		//JOptionPane.showMessageDialog(null, TWIGS); 
	try {
		Runtime.getRuntime().exec("say " + TWIGS).waitFor();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
JOptionPane.showMessageDialog(null, "It's High Noot");
}
}
