package Main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle implements Sprite{
	private int radius;
	private Color color;
	
	public Circle(int radius, Color color){
		this.radius = radius;
		this.color = color;
	}
	
	public void draw(Graphics surface, int x, int y){
		surface.setColor(color);
		surface.fillOval(x, y, radius, radius);
		surface.setColor(Color.BLACK);
		((Graphics2D) surface).setStroke(new BasicStroke(5.0f));
		surface.drawOval(x, y, radius, radius);
	}
	
	public int getRadius(){
		return radius;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return radius;
	}
}
