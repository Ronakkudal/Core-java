package printer;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrinterMain {
	
	private static void addPrinter(Scanner sc) {
		
		//Integer serialNo, String modelNo, Double price, PrinterEnum printerType, LocalDate mfDate
		System.out.println("Enter serialNo: ");
		int serialNo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter modelNo: ");
		String modelNo = sc.nextLine();
		
		System.out.println("Enter price: ");
		double price = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter printer Type: ");
		String type = sc.nextLine();
		PrinterEnum printer = PrinterEnum.valueOf(type);
		
		System.out.println("Enter mfDate [yyyy-MM-dd]: ");
		String mfDate = sc.nextLine();
		LocalDate mDate = LocalDate.parse(mfDate);
	}
	
	public static void main(String[] args) {
		Map<Integer, Printer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("Printer Class"
					+ "\n1. Add Printer"
					+ "\n2. Update Printer Price"
					+ "\n3. Print all Printers"
					+ "\n4. Exit!");
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				addPrinter(sc);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
			
		} while(choice!= 4);
	}
}
/*
Create Printer class with serialNo, modelNo, price, printerType,
manufacturingDate. Create Enum for PrinterType with values as LASER,
INKJET, DOTMATRIX.
Store the printers objects in file using ObjectOutputStream. On program
startup read all printers from file and store them in HashMap where
serialNo will be key and printer object will be value.
1.Add Printer
2.Update Printer Price
3.Print all Printers
*/