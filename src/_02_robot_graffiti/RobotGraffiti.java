package _02_robot_graffiti;
import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
public static void main(String[] args) {
	Robot jon = new Robot();
	jon.setSpeed(100);
	jon.move(100);
	jon.penDown();
	jon.turn(90);
	jon.move(200);
	jon.turn(180);
	jon.move(100);
	jon.turn(-90);
	jon.move(250);
	jon.turn(90);
	jon.move(75);
	jon.penUp();
	jon.move(100);
}
}
