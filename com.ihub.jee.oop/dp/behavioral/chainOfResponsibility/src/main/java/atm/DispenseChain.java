package atm;

public interface DispenseChain {
	
	/*
	 * Function prototypes.
	 * Fonksiyon prototipleri.
	 */
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
	
}