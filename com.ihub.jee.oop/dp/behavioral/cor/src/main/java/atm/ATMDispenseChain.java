package atm;

public class ATMDispenseChain {
	
	DispenseChain chain1;

	public ATMDispenseChain() {
		// initialize the chain
		this.chain1 = new Dollar50Dispenser();
		DispenseChain chain2 = new Dollar20Dispenser();
		DispenseChain chain3 = new Dollar10Dispenser();

		// set the chain of responsibility
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
	}

}