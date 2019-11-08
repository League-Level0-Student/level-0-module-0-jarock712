package _01_robot_square;
import org.jointheleague.graphical.robot.Robot;
public class RobotSquare {
    public static void main(String[] args) throws Exception {
    	Robot jon = new Robot();
    	jon.penDown();
    	jon.setSpeed(100);
    	for (int i = 0; i < 4; i++) {
			jon.move(200);
			jon.turn(90);
		}
    }
}
