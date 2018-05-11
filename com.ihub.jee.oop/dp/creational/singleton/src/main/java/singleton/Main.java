/**
  * Singleton Design Pattern
  * Singleton Design Pattern Scenario with connection Odata 
  * Release version 1.0 at 20.04.2018
  * @author Bayram Hakan Kocatepe || @github xhkocatepe 
*/
package singleton;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		/**
		 * We want to get a singleton instance once, so we get an instance
		 * inside the Singleton class, not from the outside (Main) with new.
		 *
		 * Singleton da tek bir defa instance alınmasını istediğimiz için new
		 * ile dışarıdan(Main) değil Singleton class'ın içinde instance
		 * alıyoruz.
		 */

		Connector connector = Connector.getInstance();

		/**
		 * Get orders from Northwind.svc from only one instance.
		 * 
		 * Instance'i alınan Connector classının getOrders methodu ile
		 * Northwinden Orderları alıyoruz.
		 */

		String orders = connector.getOrders();
		System.out.println(orders);

		/**
		 * Get products from Northwind.svc from only one instance We can not
		 * create new instance.
		 *
		 * Instance'i alınan Connector class�n�n getProducts methodu ile
		 * Northwinden Product'lar� alıyoruz. Yeni bir instance almadık.
		 */

		String products = connector.getProducts();
		System.out.println(products);
	}

}
