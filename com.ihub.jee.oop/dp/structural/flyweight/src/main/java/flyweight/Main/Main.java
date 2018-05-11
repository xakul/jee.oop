package flyweight.Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.olingo.odata2.api.edm.Edm;
import org.apache.olingo.odata2.api.ep.entry.ODataEntry;
import org.apache.olingo.odata2.api.ep.feed.ODataFeed;
import org.apache.olingo.odata2.api.exception.ODataException;

import flyweight.Classes.Order;
import flyweight.Service.ServicesForOrder;

public class Main {

	public static void main(String[] args) throws IOException, ODataException {
		/**
		 * Okuma işlemini yapacak olan servisi çağırıyoruz.
		 */
		/**
		 * Getting instance for the read operation.
		 */
		ServicesForOrder servicesForOrder = new ServicesForOrder();

		/**
		 *  Entrylerin bulunacağı bir Hashmap yaratıyoruz.
		 */
		/**
		 * Creating hashmap for entries.
		 */
		Map<String, Object> hmapForOrder = new HashMap<String, Object>();

		/**
		 *  Servisten gelen bütün entrylerin bulunacağı arraylisti oluşturuyoruz.
		 */
		/**
		 * Creating arraylist for all entries.
		 */
		List<ODataEntry> arrlistForOrder = new ArrayList<ODataEntry>();

		/**
		 *  İşlemler bittikten sonra oluşturduğumuz objeleri beraber tutabilmek için
		 *  Obje tipimizde bir arraylist oluşturuyoruz.
		 */
		/**
		 * Creating list for Order object. 
		 */
		List<Order> orderList = new ArrayList<Order>();

		/**
		 *  Base Urlimi veriyoruz.
		 */
		/**
		 * Base Url.
		 */
		String serviceUrl = "http://services.odata.org/V2/Northwind/Northwind.svc";

		/**
		 *  Kullanmak istediğimiz formatı belirliyoruz.
		 */
		/**
		 * Format that we want to use.
		 */
		String usedFormat = ServicesForOrder.APPLICATION_JSON;
		/**
		 *  Verdiğimiz Url'e bağlanmak için servisimizden readEdm i çağırıyoruz.
		 */
		/**
		 * Using readEdm for connection.
		 */
		Edm edm = servicesForOrder.readEdm(serviceUrl);
		/**
		 *  Databaseden veri seti geleceği için ODataFeed ile , EntitySetimizin ismini
		 *  vererek Expand edilmiş halindeki verileri okuyoruz.
		 */
		/**
		 * ODataFeed is the type of EntitySet.
		 * We will read with expanded version by calling readFeed with parameters.
		 */
		ODataFeed feedForOrder = servicesForOrder.readFeed(edm, serviceUrl, usedFormat, "Orders","Order_Details","Product");
		arrlistForOrder = feedForOrder.getEntries();
		for (int i = 0; i < arrlistForOrder.size(); i++) {
			/**
			 *  Her yeni entry için bir instance alıyoruz.
			 */
			/**
			 * We are getting instance for every single entry.
			 */
			Order order = new Order();
			/**
			 *  Gelen entrynin alanlarını okuyarak HashMapimizin içine atıyoruz.
			 */
			/**
			 * Getting properties of entry and adding to hashmap.
			 */
			hmapForOrder = arrlistForOrder.get(i).getProperties();
			for (Entry<String, Object> entry : hmapForOrder.entrySet()) {
				/**
				 *  Gelen propertylerin sol kısmını "Key" olarak alıyoruz.
				 */
				/**
				 * Left side of the property is "Key".
				 */
				String key = entry.getKey();
				/**
				 *  Sağ tarafını Value olarak alıyoruz.
				 */
				/**
				 * Right side of the property is "Value".
				 */
				Object value = entry.getValue();
				/**
				 *  Bu değerleri aldıktan sonra Order classının içinde yarattığımız methodu
				 *  çağırıyoruz ve Set ediyoruz.
				 */
				/**
				 * We are calling the function that setting attribute to Order object.
				 */
				
				order.setOrderAttribute(key, value);
			}
			/**
			 *  Oluşan objeyi daha önce yarattığımız listemize ekliyoruz.
			 */
			/**
			 * Lastly we are adding that object to list.
			 */
			orderList.add(order);
		}

	}
}
