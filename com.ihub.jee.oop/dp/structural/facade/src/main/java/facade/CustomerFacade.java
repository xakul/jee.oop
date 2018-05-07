package facade;

public class CustomerFacade {

	/**
	 * CustomerReport instance is taken.
	 * 
	 * CustomerReport instance alındı.
	 */
	public CustomerReport customerReport;

	/**
	 * Giving the CustomerReport object to CustomerFacade as a parameter.
	 * 
	 * CustomerReport objemizi CustomerFacade sınıfına parametre olarak
	 * veriyoruz.
	 */
	public CustomerFacade(CustomerReport customerReport) {
		this.customerReport = customerReport;
	}

	/**
	 * Insert() method, is used to insert a customer report to our database with
	 * taking CustomerReport parameter.
	 *
	 * Insert() metodu, bir müşteri raporunu CustomerReport parametresi ile
	 * veritabanımıza eklemek için kullanılır.
	 */
	public void insert(CustomerReport customerReport) {

		/**
		 * beginTransaction() method is used to start a database connection with
		 * our system.
		 * 
		 * beginTransaction() metodu veritabanı bağlantısını gerçekleştirmek
		 * için kuruldu.
		 */
		customerReport.beginTransaction();

		/**
		 * read() method is used for print the data in our database.
		 * 
		 * read() metodu veritabanımızdaki verilerin yazdırılmasını sağlar.
		 */
		this.read();

		/**
		 * commitTransaction() method sends the data to database. If a
		 * transaction starts with begin() and ends with commit() all changes
		 * appear in our database.
		 * 
		 * comitTransaction() metodu veritabanımıza verileri gönderir. Eğer bir
		 * işlem begin() ile başlar ve commit() ile sonlanırsa tüm
		 * değişikliklerle veritabanımıza yansır.
		 */
		customerReport.commitTransaction();
		System.out.println("insert operation finished successfully.\n");

	}

	/**
	 * Update() method, is used to updates the customer report in our database
	 * with taking ClientReport parameter.
	 * 
	 * Update() metodu, bir müşteri raporunu CustomerReport parametresi ile
	 * veritabanımızda güncellemek için kullanılır.
	 */
	public void update(CustomerReport customerReport) {
		customerReport.beginTransaction();

		/**
		 * id, location and industry updated with setter() methods.
		 * 
		 * id, location ve endüstri setter() metotları ile güncellendi.
		 */
		customerReport.setId("C1000");
		customerReport.setLocation("Istanbul");
		customerReport.setIndustry("Chemistry");
		this.read();
		customerReport.commitTransaction();
		System.out.println("update operation finished successfully.\n");
	}

	/**
	 * read() method used for print customer report.
	 * 
	 * read() metodu müşteri raporunu yazdırmak için kullanılır.
	 */
	public void read() {
		System.out.println("Client ID: " + customerReport.getId() + "\n" + "Client Location: "
				+ customerReport.getLocation() + "\n" + "Industry: " + customerReport.getIndustry());

	}
}
