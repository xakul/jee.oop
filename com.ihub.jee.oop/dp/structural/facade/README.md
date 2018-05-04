#### [English](#topic) / [Turkish](#konu)
# Topic

Facade Pattern

## Prequisites

* To understand this design pattern you will need to understand 4 object oriented programming concepts (Inheritence, Polymorphism, Abstraction and Inheritence). 
* You will also need JAVA Programming knowledge.

## Scenario

In the scenario that we handled, we deal with a company who want to see customer reports. These reports are including some properties which are related with customers such as id, location, industry. 

## Explanation

The Facade Pattern provides a unified interface to a set of interface in a subsystem and it defines a higher-level interface that makes the subsystem easier to use.
In the scenario we dealt with, a class (CustomerReport) defined which contains customer properties like id, location and industry. The purpose of creating this class is to identfy getter()/setter() methods and we defined database connection methods like commitTransaction() and beginTransaction(). We then used the class in the CustomerFacade class, and we used the insert, update and read methods there. By using this class definitions, our CustomerReport class is became a sub system of CustomerFacade. Because in CustomerFacade, we are taking instance of CustomerReport to handle the report that the company wants. As a result, with using CustomerFacade our sub system class becomes easier to use.

## Summary

* It defines a higher-level interface that makes the subsystem easier to use.
* Control the code and increase readability.

## Links

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial

---
---

# Konu

Facade Pattern

## Önkoşullar

* Bu tasarım modelini anlamak için 4 nesne yönelimli programlama kavramını (Inheritence, Polymorphism, Abstraction and Inheritence) anlamalısınız. 
* Ayrıca JAVA Programlama bilgisine de ihtiyacınız olacak.

## Senaryo

İşlediğimiz senaryoda, müşteri raporlarını görmek isteyen bir şirketle ilgileniyoruz. Bu raporlar, kimlik, konum, endüstri gibi müşterilerle ilgili bazı özellikleri içermektedir.

## Açıklama

Facade Pattern, bir alt sistemdeki bir arabirim kümesine birleşik bir arabirim sağlar ve alt sistemde yer alan sınıflarımızı kullanmayı daha kolay hale getiren daha üst düzey bir arabirimi tanımlar.
Ele aldığımız senaryoda, kimlik, konum ve endüstri gibi müşteri özelliklerini içeren bir sınıf (CustomerReport) tanımlanmıştır. Bu sınıfın yaratılmasının amacı, getter () / setter () yöntemlerini tanımlamak ve commitTransaction () ve beginTransaction () gibi veritabanı bağlantı yöntemlerini tanımlamaktır. Daha sonra sınıfı CustomerFacade sınıfında kullandık ve buradaki ekleme, güncelleme ve okuma yöntemlerini kullandık. Bu sınıf tanımlarını kullanarak, CustomerReport sınıfımız CustomerFacade'nin bir alt sistemi haline geldi. Çünkü CustomerFacade'de, şirketin istediği raporu yönetmek için CustomerReport örneğini alıyoruz. Sonuç olarak, CustomerFacade kullanılarak alt sistem sınıfımızın kullanımı daha kolay hale gelir.

## Özet

* Alt sistemde yer alan sınıflarımızı kullanmayı daha kolay hale getiren daha üst düzey bir arabirimi tanımlar.
* Kodun kontrolünün ve okunabilirliğini arttırır.

## Linkler

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial
* [javacodegeeks](https://www.javacodegeeks.com/2015/09/facade-design-pattern.html) - Facade Pattern Example
