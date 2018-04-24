package factory;

//Create concrete classes implementing the same interface.
// Orders interfaceni implement et.
public class SalesOrder implements Orders {

	private int id;
	private String customerID = "1";
	private int totalPrice;

	public Sales_Order_Details sod;

	public void getOrderReport() {

		System.out.println(toString());
	}

	public int getId() {
		return id;
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

	public Sales_Order_Details getSod() {
		return sod;
	}

	public void setSod(Sales_Order_Details sod) {
		this.sod = sod;
	}

	@Override
	public String toString() {

		return "Sales : " + id + " CustomerID : " + customerID + " TotalPrice : " + totalPrice
				+ " Sales Order Details : " + sod;
	}
}
