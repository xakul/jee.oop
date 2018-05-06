#### [English](#topic) / [Turkish](#konu)
# Topic

Mediator Pattern

## Prequisites

* To understand this design pattern you will need to understand 4 object oriented programming concepts (Inheritence, Polymorphism, Abstraction and Inheritence). 
* You will also need JAVA Programming knowledge.

## Scenario

In the scenario considered, two different objects were inserted to the database using the persist method, the Order and Customer classes, and the EntityManager operation. The EntityManager class we use to do this is defined as the Mediator class.


## Explanation

Mediator pattern is used to reduce communication complexity between multiple objects or classes. This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling. Mediator pattern falls under behavioral pattern category. In our example, we defined a Mediator class which is EntityManager and this class has a method called persist(). This method is using for insert the related objects to the database. In our two classes Customer and Order has insert method and this method is used for insert operation to the database by using Entitymanager.persist(this). Basicly, defining EntiyManager class we reduce the communication between Order and Customer. Whenever insert operation is called the EntityManager is responsible this operation. 

## Summary

* Mediator pattern is used to reduce communication complexity between multiple objects or classes.
* Easy maintenance of the code by loose coupling.

## Links

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial

---
---

# Konu

Mediator Pattern

## Önkoşullar

* Bu tasarım modelini anlamak için 4 nesne yönelimli programlama kavramını (Inheritence, Polymorphism, Abstraction and Inheritence) anlamalısınız. 
* Ayrıca JAVA Programlama bilgisine de ihtiyacınız olacak.

## Senaryo

Ele alınan senaryoda, kalıcı yöntem, Order ve Custoemr sınıfları ve EntityManager işlemi kullanılarak iki farklı nesne veritabanına eklenmiştir. Bunu yapmak için kullandığımız EntityManager sınıfı, Mediator sınıfı olarak tanımlanır..

## Açıklama

Mediator Pattern, birden çok nesne veya sınıf arasındaki iletişim karmaşıklığını azaltmak için kullanılır. Bu model, normal olarak farklı sınıflar arasındaki tüm iletişimleri işleyen ve kodun gevşek bağlantıyla kolay bakımını destekleyen bir aracı sınıfı sağlar. Mediator Pattern davranış paterni kategorisine girer. Örneğimizde EntityManager olan bir Mediator sınıfını tanımladık ve bu sınıfta persist () adında bir metot var. Bu metot, ilgili nesneleri veritabanına eklemek için kullanıyor. Bizim iki sınıfta Customer ve Order ekleme yöntemi vardır ve bu yöntem Entitymanager.persist(this) kullanılarak veritabanına işlem eklemek için kullanılır. Temel olarak, EntiyManager sınıfını tanımlamak, Order ve Customer arasındaki iletişimi azaltır. Ekleme işlemi çağrıldığında, EntityManager bu işlemden sorumludur.

## Özet

* Mediator Pattern, birden çok nesne veya sınıf arasındaki iletişim karmaşıklığını azaltmak için kullanılır.
* Kodun loosely-couple yoluyla kolay bakımını destekleyen bir aracı sınıfı sağlar.

## Linkler

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial

