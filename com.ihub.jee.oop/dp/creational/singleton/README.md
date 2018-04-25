#### [English](#topic) / [Turkish](#konu)
# Topic

The purpose of Tutorial ;
the Singleton Design Pattern, one of the Creational Design Patterns, will explain why and where it is used through a Java project.

## Prequisites

*   Basic java programming knowledge
*   Basic OOP knowledge

## Scenario

There are two classes, 'Connector' and 'Main'.  
Connector class which is Singleton.It connects 'Northwind OData V2' services and OData connections URL info, accessing service and data which getting as string from some entities.
The other class is 'Main'.First of All, it called 'Main' of singleton class and some called methods from 'Connector' then show screen data.    

## Explanation

Singleton Design Pattern is used to get a single (only one ) instance of a class.The purpose here is to ensure that the instance is globally accessible to the object.At run-time it is not allowed second instance of class and it is granted to instance only one . 

If you can not avoid the instance of the object, 2 different threads will make a new instance as a result of the request, but if the lock is done, it will wait for the first one to finish and the operation will be completed with a single instance.

##### Why Singleton is used ? 

Some objects do not need to get a new instance for each request.For example, like db connections, there is no need to create instance for each client, if it exists, it will cause performance loss and will be diffucult to managed.Connection is clear, it is same for each client who reaching connector.Our example is also connector samples.It connects Northwind services thanks to 'Connector' singleton class.     

*   ##### Singleton or Static Usage, Which Should I Prefer  ?  

    *   Singleton, it is suitable for OOP, some frameworks like Spring and Hibarnate are avoid from static usage.
	*   Static methods can not override.
	*   The creation of the Singleton object can be delayed, it can be used as lazy loading, but the static will be loaded into memory as soon as it is called.
    *   Increasing static usage will provide access to attributes and attributes without having to create objects and manage those objects, but that will leave you lazy and get away from OOP.

##### Connector.java

```
public class Connector {

    // it is created null when first class is called.
	private static Connector uniqueInstance = null;
	
	private final String hostURL ;
	private final String pathURL ;
	private final String serviceURL;
		
	//the constructor is  defined private because it must not called from outside.
	private Connector () {
		 hostURL = "http://services.odata.org";
		 pathURL = "/V2/Northwind/Northwind.svc/";
		 serviceURL = hostURL + pathURL;
	}

	// Our method to call our class from the outside.
	// Thanks to synchronized keyword is prevented from runnig the method at the same time 
	public synchronized static Connector getInstance () {
		if(uniqueInstance == null) {
			uniqueInstance = new Connector();
		}
		
		return uniqueInstance;		
	}
	...
}
```

##### Main.java

```
public class Main {

	public static void main(String[] args) throws IOException {
		//We can reach Singleton Connector Class thanks to getInstance()
		Connector connector = Connector.getInstance();

		//get orders from Northwind.svc
		String orders = connector.getOrders();
		System.out.println(orders);
		
		...
	}

}
```

## Summary

We are developed singleton design pattern as how or why can we used ?  

as a summary;
* The Singleton Design Pattern is an OOP desing pattern we use to prevent the invocation of a new instance of more than one class, which suffices to retrieve a single instance.
* It is similar to static use, but we must use a singleton to avoid leaving the OOP zone :)

## Links

* [Singleton Oracle Java](http://www.oracle.com/technetwork/articles/java/singleton-1577166.html) - Oracle Java Singleton
* [Northwind V2 OData SVC ](http://services.odata.org/V2/Northwind/Northwind.svc/) - Northwind Odata 




# Konu

Tutorialda Creational Design Pattern'lerden biri olan Singleton Desing Pattern'in �al��ma mant���, neden kullan�ld��� ve nerelerde kulland���n� bir Java projesi �zerinden a��klanacakt�r.

## Gereksinimler

*   Temel programlama bilgisi.
*   Ba�lang�� seviyesinde OOP bilgisi.

## Senaryo

'Connector' ve 'Main' olan 2 class'imiz var.
Connector class'i Singleton olacak ve 'Northwind Odata V2' servisine ba�lant� kuracak ve Odata ba�lant� URL bilgileri, servise eri�imi ve baz� entitylerden String olarak veriler al�nacakt�r. 'Main' class�nda ise  �nce Singleton classimiz �a�r�lacak ve al�nan datalar� ekrana yazd�r�lacak.

## A��klama

Singleton Design Pattern, bir class�n tek bir instance'ni almak i�in kullan�l�r.Buradaki ama� instance'i al�nan nesneye global eri�ebilmeyi sa�lamakt�r.Run-time da ikinci bir instance olu�turulmas�na izin verilmez, ve nesnenin tek defa olu�tu�u garanti olur.

E�er objenin instance'i al�nmas�n�n �n�ne ge�ilemeyecekse 2 farkl� thread ard arda yapaca�� istek sonucunda , birinin sonucuna uka�amadan yeni bir instance yapar ama e�er lock'lama yap�l�rsa ilkinin bitmesini bekler ve tek bir instance ile i�lem tamamlan�r.

##### Ne zaman Singleton Kullanmal�y�z ? 

Baz� objeler de her bir istek i�in yeni bir instance almaya gerek yoktur, �rne�in connectionlar daki gibi, Her client i�in ayr� ayr� bu nesneyi olu�turmaya gerek yoktur, e�er olu�turulursa performans kayb�na neden olacak  ve y�netmek zor olacakt�r. Connection nettir, her client i�in ayn�d�r ula�aca�� connector'u. Bizim �rne�imizde de Norhtwind servisine connection'u ger�ekle�tiren bir Connector Singleton classs kulland�k.

*   ##### Singleton vs Statik Kullan�m, hangisini tercih etmeli ?  

    *   Singleton, OOP yap�s�na uygundur Spring ve Hibarnate gibi frameworkler de statik den uzak dururlar.
	*   Statik methodlar override edilemezler.
	*    Singleton nesnesinin olu�turulmas� geciktiriebilir , lazy loading olarak kullan�labilir ama statikler �a�r�ld��� an belle�e y�kleneceklerdir.
    *   Statik kullan�m�n art�s� nesne olu�turmana ve o nesneyi y�netmene ihtiya� kalmadan ilgil methodlara , attributelar� eri�mini sa�layacakt�r ama bu seni tembelli�e yiter ve OOP dan uzakla��rs�n.

##### Connector.java

```
public class Connector {

    //ilk class �a�r�ld���nda null olarak uniqueInstance yarat�lacakt�r. 
	private static Connector uniqueInstance = null;
	
	private final String hostURL ;
	private final String pathURL ;
	private final String serviceURL;
		
	//Constructor private olmal�d�r, d��ar�dan �a�r�lamamas� i�in.
	private Connector () {
		 hostURL = "http://services.odata.org";
		 pathURL = "/V2/Northwind/Northwind.svc/";
		 serviceURL = hostURL + pathURL;
	}

	// Birden fazla instance'i almay� engellemek i�in kontrol ediliyor.
	//synchronized keyword'u ile de run-time da 2 kere ayn� anda yarat�lmay� engellemi� oluyoruz. 
	public synchronized static Connector getInstance () {
		if(uniqueInstance == null) {
			uniqueInstance = new Connector();
		}
		
		return uniqueInstance;		
	}
	...
}
```

##### Main.java

```
public class Main {

	public static void main(String[] args) throws IOException {
		//'Main' Class�n da singleton olan 'Connector' class�n�n instance'ni al�yoruz.  
		Connector connector = Connector.getInstance();

		//instance'i al�nan Connector class�n�n getOrders methodu ile Northwinden Orderlar� �ekiyoruz.
		String orders = connector.getOrders();
		System.out.println(orders);
		
		...
	}

}
```

## �zet

Singleton Design Pattern'i ni�in,nas�l  kullanmal�y�z, sorular�na cevap olarak geli�tirdik.
K�saca �zet ge�mek gerekirse; 
*   Singleton Design Pattern tek bir instance'i al�nmas� ihtiyac� yeterli olunan, birden fazla class'�n yeni instance'i �a�r�lmas�n� engellemek i�in kulland���m�z bir OOP desing pattern.
*   Statik kullan�mla benzerdir ama statik kullan�m� kullanmak yerine OOP zone'nundan ��kmamak i�in singleton kullanmal�y�z :)

## Linkler

* [Singleton Oracle Java](http://www.oracle.com/technetwork/articles/java/singleton-1577166.html) - Oracle Java Singleton
* [Northwind V2 OData SVC ](http://services.odata.org/V2/Northwind/Northwind.svc/) - Northwind Odata 