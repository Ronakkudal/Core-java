package shape.test;

import java.util.Scanner;
import shape.Rectangle;
import shape.Circle;
import shape.Shape;

public class ShapeMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
            System.out.println("\nShape Operations Menu:");
            System.out.println("1. Calculate Rectangle Area");
            System.out.println("2. Calculate Rectangle Perimeter");
            System.out.println("3. Calculate Circle Area");
            System.out.println("4. Calculate Circle Perimeter");
            System.out.println("5. Draw Circle");
            System.out.println("6. Exit");
            Shape rectangle = new Rectangle(10, 5);
            Shape circle = new Circle(4);
            System.out.print("Enter your choice (1-6): ");
            int choice = sc.nextInt();
            
            switch (choice) {
            case 1:
                System.out.println("Rectangle Area: " + rectangle.calculateArea());
                break;
                
            case 2:
                System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
                break;
                
            case 3:
                System.out.println("Circle Area: " + circle.calculateArea());
                break;
                
            case 4:
                System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
                break;
                
            case 5:
                // Downcast Circle object to call draw() method
            	 if (circle instanceof Circle) {
                     ((Circle) circle).draw();
                 }
                break;
                
            case 6:
                System.out.println("Exiting program...");
                sc.close();
                return;
                
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }
}
}