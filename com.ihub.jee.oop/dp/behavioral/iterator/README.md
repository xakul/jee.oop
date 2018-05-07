#### [English](#topic) / [Turkish](#konu)

# Topic

Iterator pattern,This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.

### UML DIAGRAM OF TAMPLATE PATTERN

![|Solid](https://raw.githubusercontent.com/incubationhub/jee.oop/master/com.ihub.jee.oop/dp/behavioral/iterator/images/iterator.PNG)

## Prequisites

Basic java programming knowledge

Basic OOP knowledge


## Scenario
    
In this scenario we have discussed the cost structure of a company's employees. Two different salary calculation systems are required as human resources and consultants. We will arrive at a solution with a structure that uses the fullplate design model.


## Explanation
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
The Java standard library abstraction that makes it possible to decouple collection classes and algorithms.
Promote to "full object status" the traversal of a collection.
Polymorphic traversal.

## Summary

Template method pattern is a behavioral design pattern that defines the program skeleton of an algorithm in an operation, deferring some steps to subclasses. It lets one redefine certain steps of an algorithm without changing the algorithm's structure.The template method is one of the twenty-three well-known patterns described in the "Gang of Four" book Design Patterns.
## Links

* [javaturk](http://www.javaturk.org/tasarim-kaliplari-factory-method-uretici-metot-i/) - Design Patterns tutorial(tr)
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) - Design Patterns tutorial(en)


# Konu
İterator design

## Önkoşullar
Temel programlama bilgisi.

Başlangıç seviyesinde OOP bilgisi.

## Senaryo

Bu senaryoda bir şirketin çalışanlarını ücretlendirme yapısını ele aldık.İnsan kaynakları ve danışman olarak iki farklı maaş hesaplama sistemi gerekmektedir.Bu durumu tamplate tasarım modelini kullanan bir yapı ile çözüme ulaştıracağız.

## Açıklama

Template tasarım deseninde bir operasyonu gerçekleştirmek için gerekli olan adımlar ve bu adımları çalıştıracak metotlar abstract bir sınıfta tanımlanır. Bu abstract sınıfı uygulayan gerçek sınıflar gerekli adımları overwrite eder ve abstract sınıfında bu adımları kullanan metotlar çağrılarak işlem gerçekleştirilir. Böylece kod tekrarı yapılmasının önüne geçilmiş olunur.

## Özet

Template tasarım deseni; behavioral grubuna ait bir algoritmanın adımlarının abstract sınıfta tanımlanarak farklı adımların concrete sınıflarında overwrite edilip çalıştırılmasını düzenler.
