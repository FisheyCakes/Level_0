import org.jointheleague.graphical.robot.Robot;

public class Robot_Graffiti {
	public static void main(String[] args) {
		Robot Marvin = new Robot("vic");
		Marvin.setRandomPenColor();
		Marvin.setSpeed(10);
		Marvin.setX(50);
		Marvin.setY(800);
		Marvin.penDown();
		Marvin.move(700);
		Marvin.turn(180);
		Marvin.move(700);
		Marvin.turn(-90);
		Marvin.setRandomPenColor();
		Marvin.move(400);
		Marvin.penUp();
		Marvin.setRandomPenColor();
		Marvin.move(100);
		Marvin.penDown();
		Marvin.turn(-90);
		Marvin.setRandomPenColor();
		Marvin.move(500);
		Marvin.turn(150);
		Marvin.setRandomPenColor();
		Marvin.move(575);
		Marvin.setRandomPenColor();
		Marvin.turn(-150);
		Marvin.move(500);
		Marvin.penUp();
		Marvin.turn(90);
		Marvin.move(200);
		Marvin.setRandomPenColor();
		Marvin.penDown();
		Marvin.move(400);
		Marvin.setRandomPenColor();
		Marvin.turn(125);
		Marvin.move(640);
		Marvin.setRandomPenColor();
		Marvin.turn(-125);
		Marvin.move(400); 
		Marvin.penUp();
		
		for (int i = 0; i == 0;){
			Marvin.moveTo(1000, 500);
			Marvin.turn(360);
			Marvin.moveTo(1000, 500);
			Marvin.turn(360);
			Marvin.moveTo(500, 420);
			Marvin.turn(360);
			Marvin.moveTo(400, 666);
			Marvin.turn(360);
			Marvin.moveTo(700, 800);
			Marvin.turn(360);
			Marvin.moveTo(200, 650);
			Marvin.turn(360);
			Marvin.moveTo(700, 900);
			Marvin.turn(360);
			Marvin.moveTo(100, 100);
			Marvin.turn(360);
			Marvin.moveTo(900, 700);
			Marvin.turn(360);
			Marvin.moveTo(650, 200);
			Marvin.turn(360);
			Marvin.moveTo(800, 700);
			Marvin.turn(360);
			Marvin.moveTo(666, 400);
			Marvin.turn(360);
			Marvin.moveTo(420, 500);
			Marvin.turn(360);	
		}
		
	}
}
