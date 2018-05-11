package flyweight.Classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.olingo.odata2.api.ep.entry.ODataEntry;
import org.apache.olingo.odata2.api.exception.ODataException;
import org.apache.olingo.odata2.core.ep.feed.ODataDeltaFeedImpl;


public class Order {
	/** 
	 * Bir siparişin içinde birden fazla sipariş detayı olabilir
	 *  o yüzden liste olarak yaratıyoruz.
	 */
	/**
	 * We are creating Order Details as a list because an order can have more than one.
	 */
	List<Order_Detail> orderDetails;
	private int OrderID;
	private String CustomerID;
	private int EmployeeID;
	private int ShipVia;
	private double Freight;
	private String ShipName;
	private String ShipAddress;
	private String ShipCity;
	private String ShipRegion;
	private String ShipPostalCode;
	private String ShipCountry;

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public int getShipVia() {
		return ShipVia;
	}

	public void setShipVia(int shipVia) {
		ShipVia = shipVia;
	}

	public double getFreight() {
		return Freight;
	}

	public void setFreight(double freight) {
		Freight = freight;
	}

	public String getShipName() {
		return ShipName;
	}

	public void setShipName(String shipName) {
		ShipName = shipName;
	}

	public String getShipAddress() {
		return ShipAddress;
	}

	public void setShipAddress(String shipAddress) {
		ShipAddress = shipAddress;
	}

	public String getShipCity() {
		return ShipCity;
	}

	public void setShipCity(String shipCity) {
		ShipCity = shipCity;
	}

	public String getShipRegion() {
		return ShipRegion;
	}

	public void setShipRegion(String shipRegion) {
		ShipRegion = shipRegion;
	}

	public String getShipPostalCode() {
		return ShipPostalCode;
	}

	public void setShipPostalCode(String shipPostalCode) {
		ShipPostalCode = shipPostalCode;
	}

	public String getShipCountry() {
		return ShipCountry;
	}

	public void setShipCountry(String shipCountry) {
		ShipCountry = shipCountry;
	}

	/** 
	 * Servisten gelen cevaptan sonra Attributelerini set etmek için
	 * bir method yazıyoruz.
	 */
	/**
	 * Method for setting attributes of object.
	 */
	public void setOrderAttribute(String key, Object value)
			throws IOException, ODataException {

		if (key.equals("OrderID")) {
			this.setOrderID((Integer) value);
		} else if (key.equals("CustomerID")) {
			this.setCustomerID((String) value);
		} else if (key.equals("EmployeeID")) {
			this.setEmployeeID((Integer) value);
		} else if (key.equals("ShipVia")) {
			this.setShipVia((Integer) value);
		} else if (key.equals("Freight")) {
			this.setFreight(new Double(value.toString()));
		} else if (key.equals("ShipName")) {
			this.setShipName((String) value);
		} else if (key.equals("ShipAddress")) {
			this.setShipAddress((String) value);
		} else if (key.equals("ShiptCity")) {
			this.setShipCity((String) value);
		} else if (key.equals("ShipRegion")) {
			this.setShipRegion((String) value);
		} else if (key.equals("ShipPostalCode")) {
			this.setShipPostalCode((String) value);
		} else if (key.equals("ShipCountry")) {
			this.setShipCountry((String) value);
		} else if (key.equals("Order_Details")) {
			/**
			 *  Order_Detail objemizin instanceını alıyoruz.
			 */
			/**
			 * Get instance from Order Detail object.
			 */
			Order_Detail orderDetail = new Order_Detail();
			/**
			 *  Servisten dönen OData tipi olarak instanceı alıyoruz.
			 */
			/**
			 * ODataDeltaFeedImpl type of the entity.
			 */
			ODataDeltaFeedImpl orderDetailFeed = (ODataDeltaFeedImpl) value;
			/**
			 *  Propertylerimizi oturtabilmek için HashMap yaratıyoruz.
			 */
			/**
			 * Creating hashmap for setting properties.
			 */
			Map<String, Object> orderDetailProperties = new HashMap<String, Object>();
			/**
			 *  Entrylerimizin bulunacağı bir liste oluşturuyoruz
			 */
			/**
			 * Creating list for all entries
			 */
			List<ODataEntry> orderDetailEntry = orderDetailFeed.getEntries();
			/**
			 *  Order_Details objemiz Order Objemizle 1'e (n) ilişkisi olduğu
			 *  için OrderDetails tipinde bir arraylist yaratıyoruz.
			 */
			/**
			 * Creating arraylist that type of Order_detail because Order and OrderDetails have 1*n relation.
			 */
			this.orderDetails = new ArrayList<Order_Detail>();

			for (int i = 0; i < orderDetailEntry.size(); i++) {
				orderDetailProperties = orderDetailEntry.get(i).getProperties();
				for (Entry<String, Object> entry : orderDetailProperties.entrySet()) {
					/**
					 *  Objemizi doldurduktan sonra daha once oluşturduğumuz
					 *  arraylistimizin içine atıyoruz.
					 */
					/**
					 * Lastly add object to list.
					 */
					orderDetail.setOrderDetailsAttribute(entry.getKey(), entry.getValue());
					this.orderDetails.add(orderDetail);
				}
			}

		}
	}

}
