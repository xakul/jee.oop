#### [English](#topic) / [Turkish](#konu)
# Topic

The purpose of Tutorial ;
The Command Design Pattern, one of the Behavariol Design Patterns, will explain why and where it is used through a Java project.

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

Tutorialda Behavioral Design Pattern'lerden biri olan Command DP'nin çalışma mantığı, neden kullanıldığı ve nerelerde kullandığını bir Java projesi üzerinden açıklanacaktır.

## Gereksinimler

*   Temel programlama bilgisi.
*   Başlangıç seviyesinde OOP bilgisi.

## Senaryo

Bir şirketin farklı süreçlerde bağımsız olan işlemleri vardır, bu işler birbirinden bağımsız oldukları için aynı class'a ait olmayabilirler ama bunların kümelenmiş bir biçimde kuyrukta bekleme ihtiyacı olabilmektedir.Örnek olarak Şirketin finans işlemlerini yaptığı anlaşmalı bankaları ekleyip çıkartabilir, ayrı olarak da tedarik süreci çalıştığı firmayı aktif veya pasif etme durumları olabilmektedir. Yani tek bir komutla yeni bir banka eklerken, tedarikçi ile de yollarını ayrılabilir ve aynı kuyrukta da tutulması gerekebilir.Birbirinden farklı süreçleri nasıl bir araya getirebiliriz ? 

## Açıklama

Command Design Pattern, seneryoda da anlatıldığı gibi farklı işleri bir araya getirerek komutlarla işlerin yürütülmesini sağlamaktadır.

##### Command : 
Gün sonunda gerçekleşek işlem içib Interface olan classtır.
##### ConcreateCommand : 
Command nesnesindeki metotları uygular ve Recevier Classındaki metotları da kullanan sınıftır.
##### Receiver : 
Client tarafından iletişime geçilecek olan classtır.
##### Invoker :
Command nesnesinin referansı burada bulunur ve command nesnesini çalıştırır, invoke edilendir yani.

##### Ne zaman Command Kullanmalıyız ? 

Her bir sınıfın tek bir sorumluluk ile çalışma prensibi olduğunu biliyoruz, peki bu prensip ile farklılaşan sınıflarımızı kümelendirip tek bir komutla toplu bir şekilde çağırıp, ve gerektiği gibi   istemez miyiz ? Cevabınız evet ise işte size Command Design Patternn :)

## Özet

Command Design Pattern'i niçin,nasıl  kullanmalıyız, sorularına cevap aradık.
Kısaca özet geçmek gerekirse; 
*   Command Design Pattern farklı işlevleri olan sınıflarımızı kümeleme ihtiyacı hissettiğimiz de ve kuyrukta onları bekletip ihtiyacımız olduğunda çağırabilmek için kullanılacaktır.
*   Command Design Pattern ile çok sık kullanılan kümelenme işlemleri gün içinde tek komutla kullanabiliriz yani sonuç olarak kendimize tarayıcı "sık kullanılanlar"ı yapabiliriz :)

## Linkler

* [Tasarım Desenleri ve Mimarileri Ali Kaya & Engin Bulut]