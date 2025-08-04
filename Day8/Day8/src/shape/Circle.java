package shape;


public class Circle extends Shape{
	private double radius;
	
	
	public Circle(double r) {
		this.radius = r;
		}
	
	@Override
	public double calculateArea() {
		
		return Math.PI*this.radius*this.radius;
	}
	@Override
	public double calculatePerimeter() {
		return 2*this.radius*this.radius;
	}
	 public void draw() {
	        System.out.println("Drawing a circle with radius " + radius);
	    }
	
	
}