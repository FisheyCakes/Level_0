import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class animalFarm {

	animalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		String animals = JOptionPane.showInputDialog("Which animal woud you like to hear. Cow, Dog, Cat, Llama, or Duck(The best)");
		/* 2. Make it so that the user can keep entering new animals. */

		if (animals.equals("Cow")) {
			playMoo();
		}

		if (animals.equals("Duck")) {
			playQuack();
		}
		if(animals.equals("Dog")){
			playWoof();
		}
		if(animals.equals("Llama")){
			playLlama();
		}
		if(animals.equals("Cat")){
			playMeow();
		}
	}
	void playLlama(){
		playNoise(llamaFile);
	}
	void playMeow(){
		playNoise(meowFile);
	}
	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new animalFarm();
	}

}
