package factory;

public class Sales_Order_Details {

	private String customerName;
	private String cutomerAddres;
	private String unitPrice;
	String[] sodArray = { customerName, cutomerAddres, unitPrice };

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCutomerAddres() {
		return cutomerAddres;
	}

	public void setCutomerAddres(String cutomerAddres) {
		this.cutomerAddres = cutomerAddres;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
