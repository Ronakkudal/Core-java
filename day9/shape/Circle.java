package shape;

public class Circle implements Drawable {
	private double radius;
	
	public Circle() {
		this.radius = 0.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle is Drawn!");
	}
	
	@Override
	public String toString() {
		return "\nCircle is drawn of radius: " + this.radius;
	}
	
}
