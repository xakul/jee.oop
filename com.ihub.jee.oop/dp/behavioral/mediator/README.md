#### [English](#topic) / [Turkish](#konu)
# Topic

Mediator Pattern

### UML Diagram of Mediator Pattern

![|Solid](https://raw.githubusercontent.com/incubationhub/jee.oop/master/com.ihub.jee.oop/dp/behavioral/mediator/images/meditorUML.PNG)

## Prequisites

* To understand this design pattern you will need to understand 4 object oriented programming concepts (Inheritence, Polymorphism, Abstraction and Inheritence). 
* You will also need JAVA Programming knowledge.

## Scenario

In the scenario considered, two different objects, which are Order and Customer classes, were inserted to the database using the persist method which is an EntityManager operation. EntityManager class is defined as our Mediator class. With this class, we reduced the communication between Order and Customer while they doing insert operation. 


## Explanation

Mediator pattern is used to reduce communication complexity between multiple objects or classes. This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling. Mediator pattern falls under behavioral pattern category. In our example, we defined a Mediator class which is EntityManager and this class have two methods called persist() which are taking different type of object as parameter. This method is using for insert operation of the related objects to the database. In our two classes, Customer and Order classes, has insert method and this method is used for insert operation to the database by using Entitymanager.persist(this). Basicly, defining EntiyManager class as Mediator class is reduces the communication between Order and Customer. Whenever insert operation is called the EntityManager is responsible this operation. 

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

Düşünülen senaryoda, bir EntityManager operasyonu olan persit() metodu kullanılarak, Order ve Customer sınıfları olan iki farklı nesne veri tabanına eklenmiştir. EntityManager sınıfı, Mediator sınıfımız olarak tanımlanır. Bu sınıfla, ekleme işlemi yaparken Order ve Customer arasındaki iletişimi azalttık.

## Açıklama

Mediator Pattern, birden çok nesne veya sınıf arasındaki iletişim karmaşıklığını azaltmak için kullanılır. Bu model, normal olarak farklı sınıflar arasındaki tüm iletişimleri işleyen ve kodun gevşek bağlantıyla kolay bakımını destekleyen bir aracı sınıfı sağlar. Mediator Pattern davranış paterni kategorisine girer. Örneğimizde, EntityManager olan bir Mediator sınıfını tanımladık ve bu sınıfın, parametre olarak farklı nesne türlerini alan persist() adında iki metodu var. Bu yöntem, ilgili nesnelerin veri tabanına eklenmesi için kullanılır. Bizim iki sınıfta, Customer ve Order sınıfları, insert() metodu vardır ve bu metot Entitymanager.persist(this) kullanılarak veritabanına işlem eklemek için kullanılır. Temel olarak, EntiyManager sınıfını Mediator olarak tanımlamak, Order ve Customer arasındaki iletişimi azaltır. Ekleme işlemi çağrıldığında, EntityManager bu işlemden sorumludur.

## Özet

* Mediator Pattern, birden çok nesne veya sınıf arasındaki iletişim karmaşıklığını azaltmak için kullanılır.
* Kodun loosely-couple yoluyla kolay bakımını destekleyen bir aracı sınıf sağlar.

## Linkler

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial

