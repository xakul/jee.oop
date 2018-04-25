#### [English](#topic) / [Turkish](#konu)
# Topic

Builder Pattern

## Prequisites

* To understand this design pattern you will need to understand 4 object oriented programming concepts (Inheritence, Polymorphism, Abstraction and Inheritence). 
* You will also need JAVA Programming knowledge.

## Scenario

In the scenario we dealt with a factory that produces cars with different models, colors and types. We then focused on how to handle this scenario with the builder pattern.

## Explanation

Builder Pattern allows you to create more complicated object structures than simple object structures. This design pattern is under the creational design pattern structure.
In the scenario we dealt with, an interface (CarProperties) containing car properties common to all cars was written. The purpose of creating this interface is to implement the unimplemented methods written in the subclasses specifically for the tool to be built. We then implemented the interface in the CarAbstract class, which is an abstract class, and we used the methods there, and in this abstract class subclasses, we extended our subclasses to Mercedes ASeries and MercedesAMGSeries. In our CarBuilder class methods, a new AMG series and A series tools are produced from CarAbstract class using polymorphism which is object oriented programming concept. In the Main class, we also print with the write () method.

## Summary

* Builder pattern allows objects to be constructed in a multistep.
* Encapsulates the way a complex object is constructed.
* Hides the internal representation of the product from client.

## Links

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial

---
---

# Konu

Builder Pattern

## Önkoşullar

* Bu tasarım modelini anlamak için 4 nesne yönelimli programlama kavramını (Inheritence, Polymorphism, Abstraction and Inheritence) anlamalısınız. 
* Ayrıca JAVA Programlama bilgisine de ihtiyacınız olacak.

## Senaryo

Senaryoda farklı model, renk ve tipte araba üreten bir fabrikayı ele aldık. Daha sonra bu senaryoyu builder pattern uygulayarak çözmeye odaklandık.

## Açıklama

Builder Pattern basit obje yapılarından daha karmaşık obje yapıları oluşturmamıza olanak sağlamaktadır. Bu design pattern türü creational design pattern yapısının altında yer almaktadır.
Ele aldığımız senaryoda tüm arabalar için ortak olan araba özelliklerini içeren bir interface (CarProperties) yazıldı. Bu interface'i oluşturmamızdaki amaç içerde yazılan implement edilmemiş metotları altsınıflarda oluşturulacak araç türüne özel bir şekilde implement etmekti. Daha sonra abstract sınıf olan CarAbstract sınıfında interface'i implement ederek oradaki metotları kullandık ve bu abstract sınıfı altsınıflarda yani MercedesASeries ve MercedesAMGSeries extend edip altsınıflarımızı özelleştirdik. CarBuilder sınıfımızdaki metotlarda ise object oriented programming konsepti olan polymorphism kullanarak CarAbstract sınıfından yeni bir AMG serisi ve A serisi araç üretiliyor. Main sınıfında da write() metodumuz ile yazdırma işlemini gerçekleştiriyoruz.

## Özet

* Builder pattern objelerin çok aşamalı bir şekilde oluşturulmasına olanak verir.
* Karmaşık bir nesnenin oluşturulmasını encapsulate eder.
* Ürünün iç yapısını client için gizler. Yani client ürünün hangi aşamalardan geçip oluştuğundan haberi yoktur.

## Linkler

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial
