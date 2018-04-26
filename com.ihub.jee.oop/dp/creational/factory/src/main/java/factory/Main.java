/**
   * Factory Design Pattern 
   * This project introduces the implementation of factory pattern 
   * * Release version 1.0 at 18.04.2018
   * @author Ali Baran Ozden || @github xabozden
*/
package factory;

public class Main {

	public static void main(String[] args) {

		/**
		 * get an object of PurchaseOrder and call its getOrderReport method.
		 * 
		 * Purchase objesi yarat ve getOrderReport metodunu çağır.
		 */
		Orders order = OrderFactory.setOrderType("PO");
		order.getOrderReport();
		/*
		 * get an object of SalesOrder and call its getOrderReport method.
		 * 
		 * SalesOrder objesi yarat ve getOrderReport metodunu çağır.
		 */
		order = OrderFactory.setOrderType("SO");
		order.getOrderReport();

	}

}
