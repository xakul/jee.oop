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
		 * Calculation of Workingday. Çalışma Günlerini Hesaplar.
		 */
		WorkingDay();
		/**
		 * Set the coeffience. katsayıyı beliler.
		 */
		Coeficient();
		/*
		 * Set the Consulting day. danışmanlık günlerini belirler.
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
