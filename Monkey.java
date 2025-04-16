package drawingTool;

import java.awt.Graphics;

public class Monkey {
	private Graphics pen;
	public Monkey(Graphics pen) {
		this.pen = pen;
	}
	public void drawAt(int left, int bottom) {
		Body body = new Body(pen);
		body.drawAt(left,bottom);
	}
		
}
