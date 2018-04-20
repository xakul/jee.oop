package singleton;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//We can reach Singleton Connector Class thanks to getInstance() 
		Connector connector = Connector.getInstance();

		//get orders from Northwind.svc
		String orders = connector.getOrders();
		System.out.println(orders);
		
		//get products from Northwind.svc
		String products = connector.getProducts();
		System.out.println(products);
	}

}
