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
		 * Çalışma günlerini hesaplar.
		 */
		workingDay();
		/**
		 * Set the coeffience.
		 * 
		 * Katsayıyı belirler.
		 */
		coeficient();
		/**
		 * Set the Consulting day.
		 * 
		 * Danışmanlık günlerini belirler.
		 */
		customerConsulting();
		salary();
	}

	public final void SalaryForHR() {
		officeShift();
		coeficient();
		workingDay();
		salary();
		
	}
}
