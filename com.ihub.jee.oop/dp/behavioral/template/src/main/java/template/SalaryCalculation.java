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
		 * �ali�ma g�nlerini Hesaplar.
		 */
		WorkingDay();
		/**
		 * Set the coeffience.
		 * 
		 * Katsay�y� belirler..
		 */
		Coeficient();
		/*
		 * Set the Consulting day.
		 * 
		 * Dan��manl�k g�nlerini belirler.
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
