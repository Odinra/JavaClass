package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class DrawGraphics {
	ArrayList<Mover> movingSprites = new ArrayList<Mover>();

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
		movingSprites.add(new StraightMover(200, 250, box));
		circle = new Circle(27, Color.YELLOW);
		movingSprites.add(new StraightMover(250, 200, circle));

		movingSprites.get(3).setMovementVector(-2, 0);
		movingSprites.get(4).setMovementVector(0, -2);
	}

	/** Draw the contents of the window on surface. */
	public void draw(Graphics surface) {
		for (Mover m : movingSprites) {
			m.draw(surface);
		}
	}
}
