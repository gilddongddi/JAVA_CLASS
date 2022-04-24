import java.awt.Point;

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();	//Point 객체 생
		p.set(1, 2);
		p.showPoint();
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}
