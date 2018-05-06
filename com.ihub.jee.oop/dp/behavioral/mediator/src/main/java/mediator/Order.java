package mediator;

public class Order {

	private String orderId;
	private String customerId;
	private String employeeId;
	
	public Order(String orderId, String customerId, String employeeId) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.employeeId = employeeId;
		
	}
	
	/**
	 * insert() method is used to insert the order to database by using our
	 * Mediator class EntityManager. persist() method implemented in
	 * EntityManager class.
	 * 
	 * insert() metodu, Mediator sınıfımız olan EntityManager'ı kullanarak
	 * ilgili siparişi veritabanımıza eklemek için yazıldı. persist() metodu
	 * EntityManager sınıfımızda tanımlandı.
	 */
	public void insert() {
		EntityManager.persist(this);

	} 

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

}
