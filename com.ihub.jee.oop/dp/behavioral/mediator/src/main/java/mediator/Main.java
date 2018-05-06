/**
 * Mediator Pattern 
 * This project introduces the implementation of visitor pattern 
 * Release version 1.0 at 05.05.2018
 * @author Gokhan Guler || @github xgguler
 */

package mediator;

public class Main {

	public static void main(String[] args) {

		/**
		 * We created our instances of object as giving the parameters.
		 * 
		 * Nesnelerimizin instance'larını parametreler vererek oluşturduk.
		 */
		Customer customer = new Customer("C1000", "Mark", "Germany");
		Order order = new Order("1000", "C1000", "E9001");

		/**
		 * The created samples were inserted into the database.
		 * 
		 * Oluşturulan örnekler için veritabanına insert işlemi
		 * gerçekleştirildi.
		 */
		customer.insert();
		order.insert();

	}

}
