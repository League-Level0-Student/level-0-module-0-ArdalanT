import org.jointheleague.graphical.robot.Robot;

public class Hey {
public static void main(String[] args) {
	Robot walle = new Robot();
	walle.setSpeed(100);
	walle.penDown();
	walle.turn(15);
	walle.move(200);
	walle.turn(140);
	walle.move(200);
	walle.penUp();
	walle.turn(180);
	walle.move(100);
	walle.turn(290);
	walle.penDown();
	walle.move(60);
	walle.penUp();
	walle.move(100);
	walle.sparkle();
}
}
