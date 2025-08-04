import java.util.Scanner;

public class Interest{
	public static void main(String[] args){
			System.out.println("*****MENU******");
			System.out.println("1. Simple Interest");
			System.out.println("2. Compound Interest");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice){
				
				case 1: {
						System.out.println("Enter value of Principal");
						int p = sc.nextInt();
						System.out.println("Enter value of Rate of Interest");
						int r = sc.nextInt();
						System.out.println("Enter value of Year");
						int y = sc.nextInt();
						System.out.println("Simple Interest(SI) is :: " + ((p*r*y)/100));
						break;
				}
				
				case 2: {
						System.out.println("Enter value of Principal");
						double p = sc.nextInt();
						System.out.println("Enter value of Rate of Interest");
						double r = sc.nextInt();
						System.out.println("Enter value of Year");
						double y = sc.nextInt();
						
						double cal = Math.pow((1 + (r/100)), y);
						//System.out.println(cal);
						double Amount = p*cal;
						
						System.out.println("Compount Interest(CI) is :: " + Math.round((Amount - p)));
						break;
				}
			
				default:
						System.out.println("Invalid Choice!!!");
						break;
			}
	}
}