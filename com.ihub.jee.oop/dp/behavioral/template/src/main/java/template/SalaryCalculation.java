package template;

public abstract class SalaryCalculation {

	abstract void workingDay();

	abstract void coeficient();

	abstract void customerConsulting();

	abstract void officeShift();

	abstract void salary();

	/**
	 * template method
	 */
	public final void SalaryForConsultant() {

		/**
		 * Calculation of workingday.
		 * 
		 * 
		 * çalýþma günlerini hesaplar.
		 */
		workingDay();
		/**
		 * Set the coeffience.
		 * 
		 * Katsayýyý belirler.
		 */
		coeficient();
		/**
		 * Set the Consulting day.
		 * 
		 * Danýþmanlýk Gunlerini belirler.
		 */
		customerConsulting();
		salary();
	}

	public final void SalaryForHR() {

		/**
		 * calculation of officeShift
		 * 
		 * ofiste çalýþýlan günler.
		 */
		officeShift();

		coeficient();
		workingDay();
		salary();

	}
}
