package factory;
//Create concrete classes implementing the same interface.
// Orders interfaceni implement et.
public class PurchaseOrder implements Orders {

	private int id = 5;
	private String supplierID = "jj";
	private int totalPrice = 4;
	private PurchaseOrderDetails pod = new PurchaseOrderDetails();
	String[] s;

	public PurchaseOrder() {

	}

	public void getOrderReport() {

		s = pod.getPodArray();
		System.out.println(toString() + "  " + s[1]);

	}

	public PurchaseOrderDetails getPod() {

		s = pod.getPodArray();
		return pod;
	}

	public void setPod(PurchaseOrderDetails pod) {
		this.pod = pod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Purchase id : " + id + " SupplierID : " + supplierID + " total Price : " + totalPrice
				+ " Purchase Order Details : ";
	}

}
