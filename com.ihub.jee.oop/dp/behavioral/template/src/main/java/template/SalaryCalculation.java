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
		 * �al��ma g�nlerini hesaplar.
		 */
		workingDay();
		/**
		 * Set the coeffience.
		 * 
		 * Katsay�y� belirler.
		 */
		coeficient();
		/**
		 * Set the Consulting day.
		 * 
		 * Dan��manl�k Gunlerini belirler.
		 */
		customerConsulting();
		salary();
	}

	public final void SalaryForHR() {

		/**
		 * calculation of officeShift
		 * 
		 * ofiste �al���lan g�nler.
		 */
		officeShift();

		coeficient();
		workingDay();
		salary();

	}
}
