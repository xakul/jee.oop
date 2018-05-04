package visitor;

public abstract class Visitor {

	/**
	 * visit() methods created and these methods has component object parameters
	 * that we have defined.
	 * 
	 * visit() metodu oluşturuldu ve bu yöntemler component nesne
	 * parametrelerine sahip tanımladığımız.
	 */
	public abstract void visit(Pallet pallet);

	public abstract void visit(GateReader gateReader);

	public abstract void visit(ZippyReader zippyReader);

	public abstract void visit(Shelf shelf);

}
