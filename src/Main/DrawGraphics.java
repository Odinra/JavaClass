package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

//public class DrawGraphics {
//	ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
//
//	/** Initializes this class for drawing. */
//	public DrawGraphics() {
//		boxes.add(new BouncingBox(200, 50, Color.RED));
//		boxes.add(new BouncingBox(50, 200, Color.BLUE));
//		boxes.add(new BouncingBox(100, 100, Color.GREEN));
//		boxes.get(0).setMovementVector(6, 2);
//		boxes.get(1).setMovementVector(3, 4);
//		boxes.get(2).setMovementVector(1, 5);
//	}
//
//	/** Draw the contents of the window on surface. Called 20 times per second. */
//	public void draw(Graphics surface) {
//		surface.drawLine(50, 50, 250, 250);
//		surface.drawArc(10, 10, 20, 20, 0, 300);
//
//		surface.drawOval(50, 50, 80, 100);
//
//		surface.drawRoundRect(100, 200, 50, 100, 20, 20);
//
//		for (BouncingBox b : boxes) {
//			b.draw(surface);
//		}
//	}
//}

public class DrawGraphics {
    ArrayList<Bouncer> movingSprites = new ArrayList<Bouncer>();
    ArrayList<StraightMover> movingSpritesStraight = new ArrayList<StraightMover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        movingSprites.add(new Bouncer(100, 170, box));
        box = new Rectangle(20, 15, Color.PINK);
        movingSprites.add(new Bouncer(170, 100, box));
        movingSprites.get(0).setMovementVector(3, 1);
        movingSprites.get(1).setMovementVector(1, 3);
        Circle circle = new Circle(20, Color.BLUE);
        movingSprites.add(new Bouncer(10, 10, circle));
        movingSprites.get(2).setMovementVector(2, 2);
        
        box = new Rectangle(25, 30, Color.GREEN);
        movingSpritesStraight.add(new StraightMover(200, 250, box));
        circle = new Circle(27, Color.YELLOW);
        movingSpritesStraight.add(new StraightMover(250, 200, circle));
        
        movingSpritesStraight.get(0).setMovementVector(2, 0);
        movingSpritesStraight.get(1).setMovementVector(0, 2);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for(Bouncer b : movingSprites){
        	b.draw(surface);
        }
        for(StraightMover s : movingSpritesStraight){
        	s.draw(surface);
        }
    }
}
