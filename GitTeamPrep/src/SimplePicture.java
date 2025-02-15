// Imported
// new change
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public final String ipath = "robot.png";
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage(ipath, 200, 100);
		add(robot);

		GLabel label = new GLabel("committed", 200, 400);

		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}