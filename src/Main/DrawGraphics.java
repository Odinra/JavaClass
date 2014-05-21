package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox>  boxes = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes.add(new BouncingBox(200, 50, Color.RED));
        boxes.add(new BouncingBox(50, 200, Color.BLUE));
        boxes.add(new BouncingBox(100, 100, Color.GREEN));
        boxes.get(0).setMovementVector(6, 2);
        boxes.get(1).setMovementVector(3, 4);
        boxes.get(2).setMovementVector(1, 5);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawArc(10, 10, 20, 20, 0, 300);
        
        surface.drawOval(50, 50, 80, 100);
        
        surface.drawRoundRect(100, 200, 50, 100, 20, 20);
        
        for(BouncingBox b: boxes){
        	b.draw(surface);
        }
    }
} 