import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	
	String color= JOptionPane.showInputDialog("WHATS UR FAVORITE COLOR");

	JOptionPane.showMessageDialog(null, color + " is my favorite color too!!!");
	Robot walle = new Robot();
			walle.penDown();
			walle.setSpeed(100);
			walle.move(300);
			walle.turn(120);
			walle.move(300);
			walle.turn(120);
			walle.move(300);
}
}
