#### [English](#topic) / [Turkish](#konu)

# Topic

Factory Pattern


## Prequisites

Basic java programming knowledge

Basic OOP knowledge


## Scenario

In this Scenario we are going to handle with a factory that wants to get report their sales and purchase order.We have different attributes for each report which are salesID , customerID , totalPrice and salesOrderDetails for sales order and purchaseID ,supplierID ,totalPrice , purchaseOrderDetails for purchase order.Our scope of this project that impelement factory pattern for creating two type order which we define above via getting value from client.


## Explanation

In class based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes rather than by calling a constructor.


### Orders.java
package factory;

public interface Orders {

	/*
	 * this method will be used all classes which are implemented orders Bu
	 * metod implement edilen butun siniflarda override edilmeli.
	 */
	public void getOrderReport();

}
 ### PurchaseOrder.java

package factory;

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

The factory design pattern is responsible for the generation of classes that implement the same abstract class or interface. It is a class that is responsible for object generation and the parameter sent in this class specifies the type of class to be produced

## Links

* [javaturk](http://www.javaturk.org/tasarim-kaliplari-factory-method-uretici-metot-i/) - Design Patterns tutorial(tr)
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) - Design Patterns tutorial(en)


# Konu
Factory design

## Önkoşullar
Temel programlama bilgisi.

Başlangıç seviyesinde OOP bilgisi.

## Senaryo

Bu senaryoda sales ve purchase raporuna ihtiyaç duyan bir fabrikayı ele aldık.Bu fabrikada sales raporunda satış id , müsteri id ,toplam fiyat ve sales detayları alanları yer almalı.Purchase raporunda ise purchase id ,tedarikci id ve Purchase order alanları yer almalı.Bu senaryodaki amacımız bir tane order interfacesi ver orderfactory yaratıp client tarafından gelen değere göre purchase veya sales raporu yaratmaktır.


## Açıklama

(Object-oriented)Nesne merkezli  programlardaki  en temel iş, nesne yaratmaktır. Uygulamalarda farklı pek çok sınıf vardır ve bu sınıfların nesneleri uygulamanın farklı yerlerinde oluşturulur. Bu kalıp, nesnelerin yaratılmalarını soyutlamakta ve bu işi “üretici” ya da “factory” metoda havale etmektedir. Factory method, nesnelerin yaratılmasından sorumlu bir metottur.


## Özet

Factory design pattern aynı abstract sınıfı veya interface uygulayan sınıfların üretiminden sorumludur. Nesne üretiminden sorumlu bir class olur ve bu sınıftaki metoda gönderilen parametre ile üretilecek sınıfın türü belirlenir
