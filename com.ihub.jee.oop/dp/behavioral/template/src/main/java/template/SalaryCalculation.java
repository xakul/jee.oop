package template;

public abstract class SalaryCalculation {

	abstract void WorkingDay();

	abstract void Coeficient();

	abstract void CustomerConsulting();

	abstract void OfficeShift();

	abstract void Salary();

	/**
	 * template method
	 */
	public final void SalaryForConsultant() {

		/**
		 * Calculation of Workingday.
		 * 
		 * 
		 * Çaliþma günlerini Hesaplar.
		 */
		WorkingDay();
		/**
		 * Set the coeffience.
		 * 
		 * Katsayýyý belirler..
		 */
		Coeficient();
		/*
		 * Set the Consulting day.
		 * 
		 * Danýþmanlýk günlerini belirler.
		 **/
		CustomerConsulting();

		Salary();
	}

	public final void SalaryForHR() {
		OfficeShift();
		Coeficient();
		WorkingDay();
		Salary();
	}
}
