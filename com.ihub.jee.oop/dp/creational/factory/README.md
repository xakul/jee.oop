#### [English](#topic) / [Turkish](#konu)

# Topic

Factory Pattern


## Prequisites

Basic java programming knowledge

Basic OOP knowledge


## Scenario

In these Scenario we handle with a factory that wants to get report their sales and purchase order.We have different atributes for each report which are id , customerID , Total Price and salesOrderDetails for sales order and purchase id ,supplier id ,total price , purchaseOrderDetails for purchase order.Our scope of this project that creating an interface for creating two type order we define via getting value from client.


## Explanation

In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.


### Orders.java
package factory;

//Create an interface.
//Bir interface yarat.
public interface Orders {

	/*
	 * this method will be used all classes which are implemented orders Bu
	 * metod implement edilen butun siniflarda override edilmeli.
	 */
	public void getOrderReport();

}
 ### PurchaseOrder.java

package factory;

/*Create concrete classes implementing the same interface.
 Orders interfaceni implement et.*/
public class PurchaseOrder implements Orders {

	private int id = 5;
	private String supplierID = "UNO";
	private int totalPrice = 4;
	String[] purchaseOrderArray;

	public PurchaseOrder() {

	}

	/**
	 * we need to create purchase order details for get
	 * Purchase_Order_Detail_Array Purchase_Order_Detail_Array için bir
	 * Purchase_Order_Detail_Array objesi olusturmaliyiz
	 **/
	private PurchaseOrderDetails purchaseOrderDetail = new PurchaseOrderDetails();

	public void getOrderReport() {

		/**
		 * purchaseOrderArray is a string array which is created for purchase
		 * order details
		 **/
		purchaseOrderArray = purchaseOrderDetail.getPodArray();
		System.out.println(
				toString() + "  " + purchaseOrderArray[0] + " " + purchaseOrderArray[1] + " " + purchaseOrderArray[2]);

	}
  
  
  ### Salesorder.java
  
  package factory;
public class SalesOrder implements Orders {

	private int id = 1001;
	private String customerID = "1";
	private int totalPrice = 200;
	String[] salesOrderArray;
	
	
	private SalesOrderDetails salesOrderDetails = new SalesOrderDetails();

	public void getOrderReport() {
		salesOrderArray = salesOrderDetails.getSodArray();
		System.out.println(toString());
	}

## Summary
"Define an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation it uses to subclasses."

Creating an object often requires complex processes not appropriate to include within a composing object. The object's creation may lead to a significant duplication of code, may require information not accessible to the composing object, may not provide a sufficient level of abstraction, or may otherwise not be part of the composing object's concerns. The factory method design pattern handles these problems by defining a separate method for creating the objects, which subclasses can then override to specify the derived type of product that will be created.

The factory method pattern relies on inheritance, as object creation is delegated to subclasses that implement the factory method to create objects

## Links

* [javaturk](http://www.javaturk.org/tasarim-kaliplari-factory-method-uretici-metot-i/) - Design Patterns tutorial(tr)
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) - Design Patterns tutorial(en)


# Konu
Factory design

## Önkoşullar
Temel programlama bilgisi.

Başlangıç seviyesinde OOP bilgisi.

## Senaryo

Bu senaryoda sales ve purchase raporuna ihtiyaç duyan bir fabrikayı ele aldık.Bu fabrikada sales raporunda satış id , müsteri id ,toplam fiyat ve sales detayları alanları yer almalı.Purchase raporunda ise purchase id ,tedarikci id ve Purchase order alanları yer almalı.Bu senaryodaki amacımız bir tane order interfacesi yaratıp client tarafından gelen değere göre purchase veya sales raporu yaratmaktır.


## Açıklama

Nesne-merkezli programlardaki  en temel iş, nesne yaratmaktır. Uygulamalarda farklı karmaşıklıkta pek çok sınıf vardır ve bu sınıfların nesneleri uygulamanın farklı yerlerinde oluşturulur. Bu kalıp, nesnelerin yaratılmalarını soyutlamakta ve bu işi “üretici” ya da “factory” metoda havale etmektedir. Factory method, nesnelerin yaratılmasından sorumlu bir metottur öyle ki bir interfacenin alt sınıfında bulunur.

Client’ın,  nesnelerinin sadece arayüzlerini değil aynı zamanda nasıl yaratılacaklarını da bilmesi, Client’ın Product’lara(alt classlar) olan bağımlılığını arttırır. Çoğu zaman bir nesneyi yaratmak, onu kullanmaktan daha karmaşıktır.

## Özet
Factory Method  creational grubununa ait, aynı interface kullanan nesnelerin üretiminden sorumlu design patterndir.
Factory pattern tekrarlanan tasarım sorunlarının esnek ve yeniden kullanılabilir nesne tabanlı yazılımları tasarlamak için nasıl kullanılacağını açıklar; bu, uygulanması, değiştirilmesi, test edilmesi ve yeniden kullanılması daha kolay nesnelerdir.

Factory Method tasarım deseni aynı abstract sınıfı veya arayüzü uygulayan sınıfların üretiminden sorumludur. Nesne üretiminden sorumlu bir class olur ve bu sınıftaki metoda gönderilen parametre ile üretilecek sınıfın türü belirlenir
