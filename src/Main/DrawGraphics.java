package Main;

import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box, box2, box3;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(2, 1);
        box2 = new BouncingBox(50, 200, Color.BLUE);
        box2.setMovementVector(1, 2);
        box3 = new BouncingBox(100, 100, Color.GREEN);
        box3.setMovementVector(2, 5);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawArc(10, 10, 20, 20, 0, 300);
        
        surface.drawOval(50, 50, 80, 100);
        
        surface.drawRoundRect(100, 200, 50, 100, 20, 20);
        
        box.draw(surface);
        box2.draw(surface);
        box3.draw(surface);
    }
} 