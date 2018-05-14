package atm;

public class Dollar50Dispenser implements DispenseChain {
	private DispenseChain chain;

	public void setNextChain(DispenseChain nextChain) {
		/*
		 * 
		 * function
		 *
		 * Bundan sonra gelecek iş(zincir), bu objenin zinciri olarak atanır.
		 */
		this.chain = nextChain;
	}

	public void dispense(Currency currency) {
		/*
		 * If this part of chain is responsible for this job, do the job. (Hence
		 * the if check)
		 * 
		 * Eğer bu işten bu zincir halkası sorumluysa yapsın. ("If check", bunu
		 * kontrol ediyor)
		 */
		if (currency.getAmount() >= 50) {
			int number = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + number + " 50$ note");

			/*
			 * If the remainder is not zero, transfer it to the next chain.
			 * 
			 * Kalan sıfırdan farklı ise, kalanı sonraki zincire aktar.
			 */
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			/*
			 * İşi sonraki halkaya devir et. 
			 * 
			 * Transfer the job to the next part.
			 */
			this.chain.dispense(currency);
		}
	}
}
