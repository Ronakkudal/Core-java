package shape;

public class Rectangle implements Drawable{
	private double length;
	private double breadth;
	
	public Rectangle() {
		this.breadth = 0.0;
		this.length = 0.0;
	}
	
	public Rectangle(double breadth, double length) {
		this.breadth = breadth;
		this.length = length;
	}
	
	@Override
	public void draw() {
		System.out.println("Recatangle is Drawn!");
	}
	
	@Override
	public String toString() {
		return "\nRectangle is drawn of length: " + this.length + " breadth: "  + this.breadth;
	}
}
