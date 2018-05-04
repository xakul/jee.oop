package facade;

public class CustomerReport {

	private String id;
	private String location;
	private String industry;

	/*
	 * Verilen parametrelere göre bir rapor oluşturmak için CustomerReport
	 * constructor oluşturuldu.
	 * 
	 * A CustomerReport constructor was created to generate a report according
	 * to the given parameters.
	 */
	public CustomerReport(String id, String location, String industry) {

		this.id = id;
		this.location = location;
		this.industry = industry;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	/**
	 * We begin our database process with beginTransaction () method.
	 * 
	 * beginTransaction() metodu ile veritabanı işlemimizi başlatıyoruz. 
	 */
	public void beginTransaction() {
		System.out.println("Database connection started...");
	}

	/**
	 * We commit our data to the database with the commitTransaction() method.
	 * 
	 * commitTransaction() metodu ile veritabanımıza verileri commit ediyoruz.
	 */
	public void commitTransaction() {
		System.out.println("Commit process started...");
	}
	
}
