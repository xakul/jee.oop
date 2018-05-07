package template;

public class Hr extends SalaryCalculation {
	
	


	@Override
	void WorkingDay() {
		System.out.println("This Hr work 24 day last month");

	}

	@Override
	void Coeficient() {
		System.out.println("Coeficient : 2.0");

	}

	@Override
	void CustomerConsulting() {

	}

	@Override
	void OfficeShift() {
		System.out.println("24 day office shift");

	}

	@Override
	void Salary() {

		System.out.println("Salary : 10000 $");
	}

}
