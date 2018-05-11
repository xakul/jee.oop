package factory;

public class SalesOrderDetails {

	private String customerName = "BurgerKing";
	private String customerAddres = "ISTANBUL / BESIKTAS";
	private String unitPrice = "20";
	private String[] sodArray = { customerName, customerAddres, unitPrice };

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddres() {
		return customerAddres;
	}

	public void setSodArray(String[] sodArray) {
		this.sodArray = sodArray;
	}

	public String[] getSodArray() {
		return sodArray;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

}
