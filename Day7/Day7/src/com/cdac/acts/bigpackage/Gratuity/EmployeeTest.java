package com.cdac.acts.bigpackage.Gratuity;
import java.time.LocalDate;
import java.time.Period;
public class EmployeeTest {

	public static void main(String[] args) {
		
		//LocalDate dob = LocalDate.of(2003, 1, 15);
		//LocalDate doj = LocalDate.of(2018, 1, 15);
		Employee[] e = new Employee[2];
		 e[0] = new Employee("ronak", 565,LocalDate.of(2003, 1, 15),LocalDate.of(2018, 1, 15),Dept.MGR);
		
//		LocalDate dob1 = LocalDate.of(2003, 1, 15);
//		LocalDate doj1 = LocalDate.of(2023, 1, 15);
		
		e[1] = new Employee("pranay", 255,LocalDate.of(2003, 1, 15),LocalDate.of(2023, 1, 15),Dept.HR);
		for(int i=0;i<e.length;i++) {
			if( Period.between( e[i].getDoj(),LocalDate.now()).getYears() > 5) {
				System.out.println(e[i].toString()+ " eligible for gratuity!!");
				
			}
			else {
				System.out.println(e[i].toString()+ " not eligible for gratuity!!");
			}
		}
		
	}
}
