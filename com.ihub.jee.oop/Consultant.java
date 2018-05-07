package template;

public class Consultant extends SalaryCalculation {

	@Override
	void WorkingDay() {
		System.out.println("This consultant work 24 day last month");

	}

	@Override
	void Coeficient() {

		System.out.println("Coeficient is : 2.5");

	}

	@Override
	void CustomerConsulting() {
		System.out.println("This consultant work for customer 20 day ");

	}

	@Override
	void OfficeShift() {
		
	}

	@Override
	void Salary() {

		System.out.println("Salary : 10000 $");
	}

}
