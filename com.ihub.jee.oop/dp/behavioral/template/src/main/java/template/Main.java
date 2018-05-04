package template;
/**
   * Tamplate Design Pattern 
   * This project introduces the implementation of tamplate pattern 
   * * Release version 1.0 at 302.04.2018
   * @author Ali Baran Ozden || @github xabozden
*/

public class Main {

	public static void main(String[] args) {
		
		
	
		SalaryCalculation salary = new Consultant();
		
		salary.SalaryForConsultant();
		
		SalaryCalculation hrSalary = new Hr();
		
		hrSalary.SalaryForHR();
		
	}

}
