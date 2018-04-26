package factory;

/**
 * Create concrete classes implementing the same interface.
 * 
 * Orders interfaceni implement et.
 */
public class PurchaseOrder implements Orders {

	private int id = 5;
	private String supplierID = "UNO";
	private int totalPrice = 4;
	String[] purchaseOrderArray;

	public PurchaseOrder() {

	}

	/**
	 * we need to create purchase order details for get
	 * Purchase_Order_Detail_Array
	 * 
	 * Purchase_Order_Detail_Array için bir Purchase_Order_Detail_Array objesi
	 * olusturmaliyiz.
	 *
	 **/
	private PurchaseOrderDetails purchaseOrderDetail = new PurchaseOrderDetails();

	public void getOrderReport() {

		/**
		 * purchaseOrderArray is a string array which is created for purchase
		 * order details
		 * 
		 * purchaseOrderArray , purchaseOrderDetail arrayindeki değerleri almak
		 * için olulturulan bir arraydir.
		 **/
		purchaseOrderArray = purchaseOrderDetail.getPodArray();
		System.out.println(
				toString() + "  " + purchaseOrderArray[0] + " " + purchaseOrderArray[1] + " " + purchaseOrderArray[2]);

	}

	public PurchaseOrderDetails getPod() {

		purchaseOrderArray = purchaseOrderDetail.getPodArray();
		return purchaseOrderDetail;
	}

	public void setPod(PurchaseOrderDetails purchaseOrderDetails) {
		this.purchaseOrderDetail = purchaseOrderDetails;
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

		return "Purchase id : " + id + " SupplierID : " + supplierID + " total Price : " + totalPrice
				+ " Purchase Order Details : ";
	}

}
