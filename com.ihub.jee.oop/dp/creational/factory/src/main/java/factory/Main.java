package factory;

//	Use the Factory to get object of concrete class by passing an information such as type.
public class Main {

	public static void main(String[] args) {

		// get an object of PýrchaseOrder and call its getOrderReport method.
		// Purchase objesi yarat ve getOrderReport metodunu cagýr
		Orders o1 = OrderFactory.setOrderType("PO");
		o1.getOrderReport();
		// get an object of SalesOrder and call its getOrderReport method.
		// SalesOrder objesi yarat ve getOrderReport metodunu cagýr
		o1 = OrderFactory.setOrderType("SO");
		o1.getOrderReport();

	}

}
