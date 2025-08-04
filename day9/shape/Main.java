package shape;

public class Main {
	public static void main(String[] args) {
		Drawable circle = new Circle(23);
		circle.draw();
		circle.toString();
		System.out.println(circle.toString());
		
		Drawable rectangle = new Rectangle(2,3);
		rectangle.draw();
		System.out.println(rectangle.toString());
	}
}
