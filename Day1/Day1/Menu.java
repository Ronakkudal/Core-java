import java.util.Scanner;

public class Menu{
	public static void main(String[] args){
			System.out.println("*****MENU******");
			System.out.println("1. Addition");
			System.out.println("2. Subtract");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice){
				case 1: {
						System.out.println("Enter value of A");
						int a = sc.nextInt();
						System.out.println("Enter value of B");
						int b = sc.nextInt();
						System.out.println("Adddition of A and B is : " + (a + b));
						break;
				}
				case 2: {
						System.out.println("Enter value of A");
						int a = sc.nextInt();
						System.out.println("Enter value of B");
						int b = sc.nextInt();
						System.out.println("Subtract of A and B is : " + (a - b));
						break;
				}
				case 3: {
						System.out.println("Enter value of A");
						int a = sc.nextInt();
						System.out.println("Enter value of B");
						int b = sc.nextInt();
						System.out.println("Multiplication of A and B is : " + (a * b));
						break;
				}
				case 4: {
						System.out.println("Enter value of A");
						int a = sc.nextInt();
						System.out.println("Enter value of B");
						int b = sc.nextInt();
						System.out.println("Division of A and B is : " + (a / b));
						break;
				}
				default:
						System.out.println("Invalid Choice!!!");
						break;
			}
	}
}

/*2. Write menu driven java program for performing Add, Subtract,
Multiplication and division of numbers. */