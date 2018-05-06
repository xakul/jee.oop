package mediator;

/**
 * EntityManager created as our Mediator class which helps us to reduce the
 * communication between objects or classes.
 * 
 *
 * EntityManager, nesneler veya sınıflar arasındaki iletişimi azaltmamıza
 * yardımcı olan Mediator sınıfımız olarak yaratıldı.
 */
public class EntityManager {

	/**
	 * Whichever object is inserted in the generated persist methods it takes
	 * the instances of its objects as parameters. Incoming Printing is
	 * performed according to the parameter.
	 * 
	 * Oluşturulan persist metotları içlerinde hangi obje insert edilecekse ona
	 * ait nesnelerin örneklerini parametre olarak alıyor. Gelen parametreye
	 * göre yazdırma işlemi yapılıyor.
	 */
	public static void persist(Customer customer) {
		System.out.println("Insert operation initializing for Customer...");
		System.out.println("Customer Id: " + customer.getCustomerId() + "\n" + "Customer Name: "
				+ customer.getCustomerName() + "\n" + "Customer Address: " + customer.getCustomerAddress());
		System.out.println("Insert operation completed for Customer...\n");
	}

	public static void persist(Order order) {
		System.out.println("Insert operation initializing for Order...");
		System.out.println("Order Id: " + order.getOrderId() + "\n" + "Customer Id: " + order.getCustomerId() + "\n"
				+ "Employee Id: " + order.getEmployeeId());
		System.out.println("Insert operation completed for Order...");
	}
}
