/**
 * Facade Pattern 
 * This project introduces the implementation of facade pattern 
 * Release version 1.0 at 18.04.2018
 * @author Gokhan Guler || @github xgguler
 */

package facade;

public class Main {

	public static void main(String[] args) {

		/**
		 * customerReport and customerFacade instances created. customerReport
		 * is used in CustomerFacade object as a parameter.
		 * 
		 * customerReport ve customerFacade örnekleri oluşturuldu.
		 * customerReport, ClientFacade nesnesinde bir parametre olarak
		 * kullanılır.
		 */
		CustomerReport customerReport = new CustomerReport("C1001", "Eskisehir", "Food Industry");
		CustomerFacade customerFacade = new CustomerFacade(customerReport);

		/**
		 * With using our Facade class(CustomerFacade) we can insert and update
		 * our customerReports into database.
		 * 
		 * Facade sınıfımızı kullanarak customerReports'u veritabanına
		 * ekleyebilir ve güncelleyebiliriz.
		 */
		customerFacade.insert(customerReport);
		customerFacade.update(customerReport);

	}

}
