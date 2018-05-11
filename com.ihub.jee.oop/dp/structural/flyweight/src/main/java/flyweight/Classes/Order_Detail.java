package flyweight.Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.olingo.odata2.core.ep.entry.ODataEntryImpl;

public class Order_Detail {
	private int OrderID;
	private int ProductID;
	private double UnitPrice;
	private short Quantity;
	private float Discount;
	/**
	 * Patternımızı burada kullanmaya başlıyoruz.
	 * Bütün siparişlerde birden fazla ürün olabileceği için ve her seferinde yeni bir instance alıp
	 * Sistemimizi yavaşlatmasının önüne geçmek için bir HashMap yaratıyoruz.
	 * Ve Hashmapimizin Key'i ProductID , Value ise Product objesinin kendisidir.
	 * Bu sayede eğer ProductID daha önce varsa yeni bir obje yaratmak yerine var olanı
	 * çağırıyoruz.
	 */
	Map<Integer, Object> hmapForProduct = new HashMap<Integer, Object>();

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		this.OrderID = orderID;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		this.ProductID = productID;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.UnitPrice = unitPrice;
	}

	public short getQuantity() {
		return Quantity;
	}

	public void setQuantity(short quantity) {
		this.Quantity = quantity;
	}

	public float getDiscount() {
		return Discount;
	}

	public void setDiscount(float discount) {
		this.Discount = discount;
	}

	public Object setOrderDetailsAttribute(String key, Object value) {
		if (key.equals("OrderID")) {
			this.setOrderID((Integer) value);
		} else if (key.equals("ProductID")) {
			this.setProductID((Integer) value);
		} else if (key.equals("UnitPrice")) {
			this.setUnitPrice(new Double(value.toString()));
		} else if (key.equals("Quantity")) {
			this.setQuantity((Short) value);
		} else if (key.equals("Discount")) {
			this.setDiscount((Float) value);
		} else if (key.equals("Product")) {
			if (hmapForProduct.containsKey(this.getProductID())) {
				if (hmapForProduct.get(this.getProductID()) != null) {
					return hmapForProduct.get(this.getProductID());
				}
			} else {
				Product product = new Product();
				/**
				 *  Servisten dönen OData tipi olarak instanceı alıyoruz
				 */
				ODataEntryImpl productEntry = (ODataEntryImpl) value;
				/**
				 *  Propertylerimizi oturtabilmek için HashMap yaratıyoruz
				 */
				Map<String, Object> productProperties = productEntry.getProperties();
				/**
				 *  Entrylerimizin bulunacağı bir liste oluşturuyoruz
				 */
				Set<Entry<String, Object>> arrlist = productProperties.entrySet();
				for (Entry<String, Object> entry : arrlist) {
					product.setProductAttribute(entry.getKey(), entry.getValue());
				}
				hmapForProduct.put(this.getProductID(), product);
			}
		}
		return hmapForProduct.get(this.getProductID());
	}
}
