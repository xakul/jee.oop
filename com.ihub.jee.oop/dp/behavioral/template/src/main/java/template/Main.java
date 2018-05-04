package template;

public class Main {

	public static void main(String[] args) {
	
		SalaryCalculation salary = new Consultant();
		
		salary.SalaryForConsultant();
		
		SalaryCalculation hrSalary = new Hr();
		
		hrSalary.SalaryForHR();
		
	}

}
