package atm;

public class Dollar20Dispenser implements DispenseChain {
	private DispenseChain chain;

	public void setNextChain(DispenseChain nextChain) {
		/*
		 * The task(chain) that comes after is set as the chain for this
		 * function Bundan sonra gelecek iş(zincir), bu objenin zinciri olarak
		 * atanır.
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
		if (currency.getAmount() >= 20) {
			int number = currency.getAmount() / 20;
			int remainder = currency.getAmount() % 20;
			System.out.println("Dispensing " + number + " 20$ note");

			/*
			 * If the remainder is not zero, transfer it to the next part of the
			 * chain.
			 * 
			 * Kalan sıfırdan farklı ise, kalanı sonraki zincir halkasına aktar.
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
