package drawingTool;

import java.awt.Graphics;

public class Body{

	private Graphics pen;
	public Body(Graphics pen) {
		this.pen = pen;
	}
	
	public void drawAt(int left, int bottom) {
		pen.drawOval(left, bottom, 200, 300);
		Leg leftLeg = new Leg(pen);
		leftLeg.drawAt(left, bottom+250);
		Leg rightLeg = new Leg(pen);
		rightLeg.drawAt(left+150, bottom+250);
		Tail tail = new Tail(pen);
		tail.drawAt(left+190, bottom+220);
		Head head = new Head(pen);
		head.drawAt(left+25,bottom-150);
		//TODO: Add classes for arms
	}

}
