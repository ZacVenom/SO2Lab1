package drawingTool;

import java.awt.Graphics;

public class Head {
	Graphics pen;

	public Head(Graphics pen) {
		this.pen = pen;
	}

	public void drawAt(int left, int bottom) {
		pen.drawOval(left, bottom, 150, 150);
		//TODO: Add class hair and face, in which add nose, and in it add classes eyes and mouth
		
	}

}
