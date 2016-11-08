import org.jointheleague.graphical.robot.Robot;


public class TraingleShell {


	// 1. Create a new Robot
Robot carebear = new Robot();

	
	void go() {
		//drawTriangle(100); // 3. delete this line (used only for testing)
carebear.penDown();

		// 6. Make the robot go as fast as possible
carebear.setSpeed(10);

		// 4. make a variable to hold the length of the triangle and set it to 50
int twigs = 25;

		// 7. Do the following (up to step 10) 60 times
for(int i = 0; i<100; i++){

			// 9. Change the color of the pen to a random color
	carebear.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
	twigs = twigs + 5;
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(twigs);
			// 10. Turn the tortoise 6 degrees to the right
	carebear.turn(10);
}

	}


	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {

		carebear.move(length);
		carebear.turn(120);
		carebear.move(length);
		carebear.turn(120);
		carebear.move(length);
		carebear.turn(120);
		
		
	}


	
	public static void main(String[] args) {
		new TraingleShell().go();
	}
}






