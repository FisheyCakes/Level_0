import java.util.Random;

import javax.swing.JOptionPane;

public class NUMBERSSSSSSSSSSS {
public static void main(String[] args) {
	String twigs = JOptionPane.showInputDialog("Give me a number Between 1 & 100");
	int ducks = Integer.parseInt(twigs);
	int w = 0;
	for(int i = 0; i%2==0; i +=2){
		Random rand = new Random();
		int q = rand.nextInt(100)+1;
		w++;
		System.out.println(q+"  "+ducks+"  " +w);
		if(q==ducks){
			i++;
			JOptionPane.showMessageDialog(null, "GOTEEEEEM");
			JOptionPane.showMessageDialog(null, "That took "+ w + " tries");  
		}
	}


}
}
