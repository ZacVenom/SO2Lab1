package drawingTool;

import java.awt.Graphics;

public class Tail {
	private Graphics pen;
	public Tail(Graphics pen) {
		this.pen = pen;
	}
	public void drawAt(int left, int bottom) {
		int xPoints[] = {left,left+50,left+150,left+100,left+80};
		int yPoints[] = {bottom, bottom+20,bottom-150,bottom-130,bottom-100};
		pen.drawPolygon(xPoints, yPoints, 5);
	}
}
