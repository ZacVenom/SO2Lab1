package drawingTool;

import java.awt.Graphics;

public class Leg {
	Graphics pen;
	public Leg(Graphics pen) {
		this.pen = pen;
	}
	public void drawAt(int left, int bottom) {
		pen.drawOval(left, bottom, 50, 200);
	}
}
