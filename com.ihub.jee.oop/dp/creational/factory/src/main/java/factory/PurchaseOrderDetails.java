package factory;

public class PurchaseOrderDetails {

	private String supplierName = "UNO";
	private String supplierAddress = "ISTANBUL / UMRANIYE";
	private String unitPrice = "20";
	/**
	 * this array hold purchase orders details atributies purchase orderdaki
	 * degiskenleri tasimak icin tanimlandi
	 **/
	private String[] purchaseOrders = { supplierAddress, supplierName, unitPrice };

	public String[] getPodArray() {

		return purchaseOrders;

	}

	public void setPodArray(String[] purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

	public PurchaseOrderDetails() {

	}

	@Override
	public String toString() {
		return supplierName + supplierAddress + unitPrice;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

}
