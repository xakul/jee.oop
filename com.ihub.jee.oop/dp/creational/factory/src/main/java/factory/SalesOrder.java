package factory;

/**
 * Create concrete classes implementing the same interface. Orders interfaceni
 * implement et.
 **/
public class SalesOrder implements Orders {

	private int id = 1001;
	private String customerID = "1";
	private int totalPrice = 200;
	String[] salesOrderArray;
	
	
	private SalesOrderDetails salesOrderDetails = new SalesOrderDetails();

	public void getOrderReport() {
		salesOrderArray = salesOrderDetails.getSodArray();
		System.out.println(toString());
	}

	public int getId() {
		return id;
	}

	public SalesOrderDetails getSalesOrderDetails() {
		return salesOrderDetails;
	}

	public void setSalesOrderDetails(SalesOrderDetails salesOrderDetails) {
		this.salesOrderDetails = salesOrderDetails;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {

		return "Sales : " + id + " CustomerID : " + customerID + " TotalPrice : " + totalPrice
				+ " Sales Order Details : " + " " + salesOrderArray[0] + " " + salesOrderArray[1] + " "
				+ salesOrderArray[2];
	}
}
