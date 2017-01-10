import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class COOBS {
static Robot duck = new Robot("vic");
public static void main(String[] args) {
	//duck.setSpeed(10);
	//duck.move(400);
	//duck.turn(-90);
	//duck.move(600);
	drawCube3d(50);
	drawCube3d(75);
	drawCube3d(100);
	drawCube3d(125);
	drawCube3d(150);
	drawCube3d(175);
	drawCube3d(200);
	drawCube3d(225);
	drawCube3d(250);
	drawCube3d(275);
}

static void drawCube3d(int length){
	int y = (int)(length*0.625);
	
	duck.penDown();
	duck.setRandomPenColor();
	duck.setSpeed(10);
	duck.move(length);

	duck.turn(90);
	duck.move(length);

	duck.turn(90);
	duck.move(length);

	duck.turn(90);
	duck.move(length);

	duck.turn(-45);
	duck.move(y);

	duck.turn(135);
	duck.move(length);

	duck.turn(90);
	duck.move(length);

	duck.turn(90);
	duck.move(length);

	duck.turn(90);
	duck.move(length);	
	
	duck.turn(90);
	duck.move(length);

	duck.turn(45);
	duck.move(y);
	
	duck.turn(180);
	duck.move(y);

	duck.turn(-135);
	duck.move(length);

	duck.turn(-45);
	duck.move(y);

	duck.turn(180);
	duck.move(y);
	
	duck.turn(-45);
	duck.move(length);

	duck.turn(-135);
	duck.move(y);
	duck.turn(180);
	duck.move(y);
	duck.turn(-135);


}
}