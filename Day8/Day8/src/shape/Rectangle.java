package shape;

public class Rectangle extends Shape{
	private double width;
	private double breath;
	
	public Rectangle(double w, double b) {
		this.width=w;
		this.breath=b;
	}
	
	@Override
	public double calculateArea() {
		
		return this.width*this.breath;
	}
	@Override
	public double calculatePerimeter() {
		return 2* (this.width + this.breath);
	}
	
	
	
}
