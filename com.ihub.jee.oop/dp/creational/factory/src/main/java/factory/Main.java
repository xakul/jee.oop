/**
   * Factory Design Pattern Scenario 
   * @author Ali Baran Ozden || @github xabozden
*/
package factory;

//	Use the Factory to get object of concrete class by passing an information such as type.
public class Main {

	public static void main(String[] args) {


		/*
		 * get an object of PurchaseOrder and call its getOrderReport method.
		 * 
		 * Purchase objesi yarat ve getOrderReport metodunu cagirir
		 **/
		Orders order = OrderFactory.setOrderType("PO");
		order.getOrderReport();
		/*
		 * get an object of SalesOrder and call its getOrderReport method.
		 * SalesOrder objesi yarat ve getOrderReport metodunu cagirir
		 */

		order = OrderFactory.setOrderType("SO");
		order.getOrderReport();


	}

}
