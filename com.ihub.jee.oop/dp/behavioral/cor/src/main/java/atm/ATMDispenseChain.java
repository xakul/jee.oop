package atm;

public class ATMDispenseChain {
	
	DispenseChain chain1;

	public ATMDispenseChain() {
		/*
		 * Initialize the chain structure.
		 * Zincir yapısını kur.
		 */
		this.chain1 = new Dollar50Dispenser();
		DispenseChain chain2 = new Dollar20Dispenser();
		DispenseChain chain3 = new Dollar10Dispenser();

		/*
		 * Define the responsible chains.
		 * Sorumlu olunan zincirleri belirle.
		 */
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
	}

}