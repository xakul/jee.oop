package template;

public class Consultant extends SalaryCalculation {
	
	
	/**
	 * SalaryCalculation extend edilip ilgili methodlar override edilir.
	 * 
	 * Extend the salaryCalculation class and override unimplemneted methods.
	 * */


	@Override
	void workingDay() {
		System.out.println("This consultant work 24 day last month");

	}

	@Override
	void coeficient() {
		System.out.println("Coeficient is : 2.5");

	}

	@Override
	void customerConsulting() {
		System.out.println("This consultant work for customer 20 day ");

	}

	@Override
	void officeShift() {

	}

	@Override
	void salary() {
		System.out.println("Salary : 10000 $");
	}

}
