package Main;

import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawArc(10, 10, 20, 20, 0, 300);
        
        surface.drawOval(50, 50, 80, 100);
        
        surface.drawRoundRect(300, 300, 50, 100, 20, 20);
        
        box.draw(surface);
    }
} 