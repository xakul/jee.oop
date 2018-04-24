package factory;

public class PurchaseOrderDetails {

	private String supplierName = "s";
	private String supplierAddress = "1";
	private String unitPrice = "ed";
	private String[] podArray = { "supplierAddress", "supplierName"," unitPrice" };

	
	public String[] getPodArray() {
		return podArray;
	}

	public void setPodArray(String[] podArray) {
		this.podArray = podArray;
	}

	public PurchaseOrderDetails() {
		super();
		//this.podArray = podArray;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return supplierName + supplierAddress + unitPrice;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
