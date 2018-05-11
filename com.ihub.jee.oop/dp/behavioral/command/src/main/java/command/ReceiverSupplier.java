package command;

/**
 * This class are called Receiver class from Command Design. There are no
 * relation with the other Receiver classes. Only Supplier commands are done.
 * 
 * Command Desing Pattern'da Receiver classları olarak bilinir.Diğer Receiver
 * class'ları ile bir ilişkisi yoktur. Sadece Tedarikçi komutlarının işini
 * yapandır.
 */
public class ReceiverSupplier {

	private int supplierId;
	private String supplierName;

	public ReceiverSupplier(int supplierId, String supplierName) {
		this.supplierId = supplierId;
		this.supplierName = supplierName;
	}

	public void Enable() {
		System.out.println("* " + this.supplierId + " " + this.supplierName + " is activated.");
	}

	public void Disabled() {
		System.out.println("* " + this.supplierId + " " + this.supplierName + " is disabled.");
	}
}
