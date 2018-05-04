package visitor;

public abstract class Components {

	/**
	 * Defined accept method for transactions that is happening in Visitor.
	 * 
	 * Visitor'da bulunan işlemler için accept() metodu tanımlandı.
	 */
	public abstract void accept(Visitor visitor);
}
