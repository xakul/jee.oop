package command;

/**
 * This class are called Receiver Class from Command Design.
 * There are no relation other receiver classes.Only Supplier
 * commands are done.
 * 
 * Command Desing Pattern'da Receiver Classları olarak 
 * bilinir.Diğer Receiver Class'ları ile bir ilişkisi yoktur,
 * Sadece Tedarikçi komutlarının işini yapandır.
 */
public class ReceiverSupplier {
	
	private int supplierId;
	private String supplierName;
	
	public ReceiverSupplier(int supplierId , String supplierName) {
		this.supplierId = supplierId;
		this.supplierName = supplierName;
	}
	
	public void Enable() {
		System.out.println("* " + this.supplierId + " " + this.supplierName + " is activated." );
	}
	
	public void Disabled() {
		System.out.println("* " + this.supplierId + " " + this.supplierName + " is disabled." );
	}
}
