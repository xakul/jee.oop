package atm;

public class Dollar10Dispenser implements DispenseChain {
	private DispenseChain chain;

	public void setNextChain(DispenseChain nextChain) {
		/*
		 * The task(chain) that comes after is set as the chain for this function
		 * Bundan sonra gelecek iş(zincir), bu objenin zinciri olarak atanır.
		 */
		this.chain = nextChain;
	}

	public void dispense(Currency currency) {
		/*
		 * If this chain is responsible for the job, do the job. (Hence the if check)
		 * Eğer bu işten bu zincir sorumluysa yapsın. ("If check", bunu kontrol ediyor)
		 */
		if (currency.getAmount() >= 10) {
			int number = currency.getAmount() / 10;
			int remainder = currency.getAmount() % 10;
			System.out.println("Dispensing " + number + " 10$ note");
			
			/*
			 * If the remainder is not zero, transfer it to the next chain.
			 * Kalan sıfırdan farklı ise, kalanı sonraki zincire aktar.
			 */
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		}
		else {
			/*
			 * İşi sonraki zincire devir et.
			 * Transfer the job to the next chain
			 */
			this.chain.dispense(currency);
		}
	}
}
