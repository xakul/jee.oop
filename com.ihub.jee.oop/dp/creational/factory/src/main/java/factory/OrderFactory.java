package factory;

//Create a Factory to generate object of concrete class based on given information.
public abstract class OrderFactory {

	/*
	 * use setOrderType method to get object of type Order setOrderType
	 * methodunu kullanarak purchase veya sales order objesi yarat
	 */

	// use setOrderType method to get object of type Order
	// setOrderType methodunu kullanarak purchase veya sales order objesi yarat

	public static Orders setOrderType(String ordertype) {
		if (ordertype.equalsIgnoreCase("PO")) {
			return (Orders) new PurchaseOrder();
		} else if (ordertype.equalsIgnoreCase("SO")) {
			return (Orders) new SalesOrder();

		}
		return null;

	}
}