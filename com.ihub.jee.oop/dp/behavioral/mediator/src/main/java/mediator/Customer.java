package mediator;

public class Customer {

	private String customerId;
	private String customerName;
	private String customerAddress;

	public Customer(String customerId, String customerName, String customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;

	}

	/**
	 * insert() method is used to insert the customer to database by using our
	 * Mediator class EntityManager. persist() method implemented in
	 * EntityManager class.
	 * 
	 * insert() metodu, Mediator sınıfımız olan EntityManager'ı kullanarak
	 * ilgili müşteriyi veritabanımıza eklemek için yazıldı. persist() metodu
	 * EntityManager sınıfımızda tanımlandı.
	 */
	public void insert() {
		EntityManager.persist(this);

	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
}
