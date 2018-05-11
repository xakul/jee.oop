package atm;

public class Dollar50Dispenser implements DispenseChain {
	private DispenseChain chain;

	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	public void dispense(Currency currency) {
		if (currency.getAmount() >= 50) {
			int number = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + number + " 50$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		}
		else {
			this.chain.dispense(currency);
		}
	}
}
