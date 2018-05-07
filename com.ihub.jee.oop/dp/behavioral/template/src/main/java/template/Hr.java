package template;

public class Hr extends SalaryCalculation {

	@Override
	void workingDay() {
		System.out.println("This Hr work 24 day last month");

	}

	@Override
	void coeficient() {
		System.out.println("Coeficient : 2.0");

	}

	@Override
	void customerConsulting() {

	}

	@Override
	void officeShift() {
		System.out.println("24 day office shift");

	}

	@Override
	void salary() {
		System.out.println("Salary : 10000 $");
		
	}

}
