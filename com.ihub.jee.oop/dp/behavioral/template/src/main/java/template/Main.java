/**
 * Tamplate Design Pattern 
 * This project introduces the implementation of
 * tamplate pattern * Release version 1.0 at 30.04.2018
 * @author Ali Baran Ozden || @github xabozden
 */

package template;

public class Main {

	public static void main(String[] args) {

		/**
		 * Cosultant t�r�nde yeni bir salary objesi yarat�yoruz.Bu objeyi
		 * yartat�ktan sonra i�inden salaryforcosultant methoduyla i�lem
		 * yap�yoruz.
		 * 
		 * Creating a salaryCalculation object with type consultant. then call
		 * salaryforCosultant method.
		 *
		 */

		SalaryCalculation salary = new Consultant();

		salary.SalaryForConsultant();

		/**
		 * hr t�r�nde yeni bir salary objesi yarat�yoruz.Bu objeyi yartat�ktan
		 * sonra i�inden salaryfor r methoduyla i�lem yap�yoruz.
		 * 
		 * Creating a salaryCalculation object with type hr. then call
		 * salaryforhr method.
		 */
		SalaryCalculation hrSalary = new Hr();

		hrSalary.SalaryForHR();

	}

}
