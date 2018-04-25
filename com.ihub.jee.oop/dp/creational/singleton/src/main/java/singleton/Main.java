/**
  * Singleton Design Pattern Scenerio with connection Odata 
  * Release version 1.0 at 20.04.2018
  * @author Bayram Hakan Kocatepe || xhkocatepe on @github || bayramhakankocatepe@gmail.com
*/
package singleton;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/**
		 * We want to get a singleton instance once, so we get 
		 * an instance inside the Singleton class, not from the
		 * outside (Main) with new.
		 *
		 * Singleton da tek bir defa instance al�nmas�n� istedi�imiz
		 * i�in new ile d��ar�dan(Main) de�il Singleton class'�n 
		 * i�inde instance al�yoruz.
		 */
		
		Connector connector = Connector.getInstance();

		/**
		 * Get orders from Northwind.svc from only one instance.
		 * 
		 * Instance'i al�nan Connector class�n�n getOrders methodu
		 * ile Northwinden Orderlar� al�yoruz.
		 */
		
		String orders = connector.getOrders();
		System.out.println(orders);
		
		/** 
		 * Get products from Northwind.svc from only one instance
		 * We can not create new instance.
		 *
		 * Instance'i al�nan Connector class�n�n getProducts methodu
		 * ile Northwinden Product'lar� al�yoruz. Yeni bir instance almad�k.
		 */
		
		String products = connector.getProducts();
		System.out.println(products);
	}

}
