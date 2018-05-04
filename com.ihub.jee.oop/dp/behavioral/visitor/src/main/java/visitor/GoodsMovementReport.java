package visitor;

public class GoodsMovementReport extends Visitor {

	/**
	 * We override the vist methods found in the Visitor. We pass our classes
	 * that derive from the Component class as parameters to this visit method.
	 * Thus, we use our objects that derive from our Component class to print
	 * our report through the Visitor.
	 * 
	 * Visitor içinde bulunan vist metotlarını override ediyoruz. Component
	 * sınıfından türeyen sınıflarımızı bu visit metoduna parametre olarak
	 * veriyoruz. Böylece ilgili raporumuzu Component sınıfından türeyen
	 * nesnelerimizi kullanarak Visitor üzerinden yazdırmış oluyoruz.
	 */
	@Override
	public void visit(Pallet pallet) {
		System.out.println("Pallet ID: " + pallet.getTagId());
		System.out.println("Pallet Type: " + pallet.getType());
		System.out.println("Pallet Shape: " + pallet.getShape());
		
	}

	@Override
	public void visit(GateReader gateReader) {
		System.out.println("Gate: " + gateReader.getGateType());
		System.out.println("Gate Width: " + gateReader.getWidth());
		System.out.println("Gate Length: " + gateReader.getLength());
		System.out.println("Gate Height: " + gateReader.getHeight());
		
	}

	@Override
	public void visit(ZippyReader zippyReader) {
		System.out.println("ZippyReader ID: " + zippyReader.getId());
		System.out.println("ZippyReader Model: " + zippyReader.getModel());
		System.out.println("ZippyReader Type: " + zippyReader.getZippyType());
		
	}

	@Override
	public void visit(Shelf shelf) {
		System.out.println("Shelf ID: " + shelf.getShelfId());
		System.out.println("Shelf Type: " + shelf.getShelfType());
		System.out.println("Shelf Width: " + shelf.getWidth());
		System.out.println("Shelf Length: " + shelf.getLength());
		System.out.println("Shelf Height: " + shelf.getHeight());
		
	}

}
