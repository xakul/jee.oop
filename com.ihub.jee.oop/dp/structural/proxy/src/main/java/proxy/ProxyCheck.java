package proxy;

/**
 * Proxy Class is a bridge between Client and CheckTransaction class.
 * Client only must proxy class in order to do all transactions.
 * 
 * Proxy Sınıfımızı Müşteri ve Çek İşlemlerini gerçekleştiren
 * CheckTransaction class'i ile bir köprüdür.Müşteri işlemlerini
 * sadece Proxy üzerinden yürütmelidir.
 */
public class ProxyCheck implements ICheck {
	/**
	 * We define CheckTransaction private .
	 * 
	 * CheckTranscation classını private olarak tanımlıyoruz.
	 */
	private CheckTransaction realObject;
	
	public ProxyCheck () {
		realObject = new CheckTransaction();
	}
	
	/**
	 * Some Controller can be done by this class.However, we must be carefully,
	 * this controller must not be related check transactions.For instance,
	 * this control is related to admin.
	 * 
	 * Bazı kontrollerimizi bu sınıf ile yapabiliriz fakat çek ile ilgili
	 * işlemler olmamasına dikkat edelim. Örneğimiz de admin kontrolü yapıyoruz.
	 */
	public String isValidCheck(String username , String checkNumber) {

		if(this.isAdmin(username)) {
			/**
			 * After we are sure that user is admin we call CheckTransaction.
			 * 
			 * Kullanıcının admin olduğuna öğrendikten sonra CheckTransaction
			 * sınıfını çağırıyoruz.
			 */
			String result = realObject.isValidCheck( username ,checkNumber);
			
			return result;
			
		}else {
			return "Only admin users can do transactions!";
		}
	}
	
	public Boolean isAdmin (String username) {
		/**
		 * hehehh I am the Admin :p
		 * 
		 * ahahah Admin benim :p 
		 */
		if(username == "kocatepehakan") {
			
			return true;
		}else {
			
			return false;
		}
	}
}
