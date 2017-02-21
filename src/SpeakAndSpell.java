import javax.swing.JOptionPane;



public class SpeakAndSpell {

	public static void main(String[] args) {
		
		speak("Transcendentalism");
		
String duck = JOptionPane.showInputDialog("");

if(duck.equals("Trancendentalism")){
speak("Correct");	
}
else{
	speak("Wrong");
}
speak("xiphactinus");

String cow = JOptionPane.showInputDialog("");

if(cow.equals("xiphactinus")){
speak("Correct");	
}
else{
speak("Wrong");
}
speak("psittacosaurus");

String chicken = JOptionPane.showInputDialog("");

if(chicken.equals("psittacosaurus")){
speak("Correct");	
}
else{
speak("Wrong");
}
speak("schizophrenic");

String pigg = JOptionPane.showInputDialog("");

if(pigg.equals("schizophrenic")){
speak("Correct");	
}
else{
speak("Wrong");
}
speak("shoryuken");

String isPige = JOptionPane.showInputDialog("");

if(isPige.equals("shoryuken")){
speak("Correct");	
}
else{
speak("Wrong");
}
//1. Use the speak method to say the word. "e.g. spell mandlebrot"
// 2. Catch the user's answer in a String
// 3. If the user spelled the word correctly, speak "correct"
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

