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

Tutorialda Creational Design Pattern'lerden biri olan Singleton Desing Pattern'in çalýþma mantýðý, neden kullanýldýðý ve nerelerde kullandýðýný bir Java projesi üzerinden açýklanacaktýr.

## Gereksinimler

*   Temel programlama bilgisi.
*   Baþlangýç seviyesinde OOP bilgisi.

## Senaryo

'Connector' ve 'Main' olan 2 class'imiz var.
Connector class'i Singleton olacak ve 'Northwind Odata V2' servisine baðlantý kuracak ve Odata baðlantý URL bilgileri, servise eriþimi ve bazý entitylerden String olarak veriler alýnacaktýr. 'Main' classýnda ise  önce Singleton classimiz çaðrýlacak ve alýnan datalarý ekrana yazdýrýlacak.

## Açýklama

Singleton Design Pattern, bir classýn tek bir instance'ni almak için kullanýlýr.Buradaki amaç instance'i alýnan nesneye global eriþebilmeyi saðlamaktýr.Run-time da ikinci bir instance oluþturulmasýna izin verilmez, ve nesnenin tek defa oluþtuðu garanti olur.

Eðer objenin instance'i alýnmasýnýn önüne geçilemeyecekse 2 farklý thread ard arda yapacaðý istek sonucunda , birinin sonucuna ukaþamadan yeni bir instance yapar ama eðer lock'lama yapýlýrsa ilkinin bitmesini bekler ve tek bir instance ile iþlem tamamlanýr.

##### Ne zaman Singleton Kullanmalýyýz ? 

Bazý objeler de her bir istek için yeni bir instance almaya gerek yoktur, örneðin connectionlar daki gibi, Her client için ayrý ayrý bu nesneyi oluþturmaya gerek yoktur, eðer oluþturulursa performans kaybýna neden olacak  ve yönetmek zor olacaktýr. Connection nettir, her client için aynýdýr ulaþacaðý connector'u. Bizim örneðimizde de Norhtwind servisine connection'u gerçekleþtiren bir Connector Singleton classs kullandýk.

*   ##### Singleton vs Statik Kullaným, hangisini tercih etmeli ?  

    *   Singleton, OOP yapýsýna uygundur Spring ve Hibarnate gibi frameworkler de statik den uzak dururlar.
	*   Statik methodlar override edilemezler.
	*    Singleton nesnesinin oluþturulmasý geciktiriebilir , lazy loading olarak kullanýlabilir ama statikler çaðrýldýðý an belleðe yükleneceklerdir.
    *   Statik kullanýmýn artýsý nesne oluþturmana ve o nesneyi yönetmene ihtiyaç kalmadan ilgil methodlara , attributelarý eriþmini saðlayacaktýr ama bu seni tembelliðe yiter ve OOP dan uzaklaþýrsýn.

##### Connector.java

```
public class Connector {

    //ilk class çaðrýldýðýnda null olarak uniqueInstance yaratýlacaktýr. 
	private static Connector uniqueInstance = null;
	
	private final String hostURL ;
	private final String pathURL ;
	private final String serviceURL;
		
	//Constructor private olmalýdýr, dýþarýdan çaðrýlamamasý için.
	private Connector () {
		 hostURL = "http://services.odata.org";
		 pathURL = "/V2/Northwind/Northwind.svc/";
		 serviceURL = hostURL + pathURL;
	}

	// Birden fazla instance'i almayý engellemek için kontrol ediliyor.
	//synchronized keyword'u ile de run-time da 2 kere ayný anda yaratýlmayý engellemiþ oluyoruz. 
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
		//'Main' Classýn da singleton olan 'Connector' classýnýn instance'ni alýyoruz.  
		Connector connector = Connector.getInstance();

		//instance'i alýnan Connector classýnýn getOrders methodu ile Northwinden Orderlarý çekiyoruz.
		String orders = connector.getOrders();
		System.out.println(orders);
		
		...
	}

}
```

## Özet

Singleton Design Pattern'i niçin,nasýl  kullanmalýyýz, sorularýna cevap olarak geliþtirdik.
Kýsaca özet geçmek gerekirse; 
*   Singleton Design Pattern tek bir instance'i alýnmasý ihtiyacý yeterli olunan, birden fazla class'ýn yeni instance'i çaðrýlmasýný engellemek için kullandýðýmýz bir OOP desing pattern.
*   Statik kullanýmla benzerdir ama statik kullanýmý kullanmak yerine OOP zone'nundan çýkmamak için singleton kullanmalýyýz :)

## Linkler

* [Singleton Oracle Java](http://www.oracle.com/technetwork/articles/java/singleton-1577166.html) - Oracle Java Singleton
* [Northwind V2 OData SVC ](http://services.odata.org/V2/Northwind/Northwind.svc/) - Northwind Odata 