#### [English](#topic) / [Turkish](#konu)

# Topic

Template pattern, an abstract class exposes defined ways to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. This pattern comes under behavior pattern category.

### UML DIAGRAM OF TAMPLATE PATTERN
![|Solid](https://raw.githubusercontent.com/incubationhub/jee.oop/master/com.ihub.jee.oop/dp/behavioral/template/images/Template.PNG)

## Prequisites

* Basic java programming knowledge.

* Basic OOP knowledge.


## Scenario
    
In this scenario we have discussed the cost structure of a company's employees. Two different salary calculation systems are required as human resources and consultants. We will arrive at a solution with a structure that uses the tamplate design model.


## Explanation

This pattern has two main parts, and typically uses object-oriented programming:

* The "template method", generally implemented as a base class (possibly an abstract class), which contains shared code and parts of the overall algorithm which are invariant. The template ensures that the overarching algorithm is always followed. In this class, "variant" portions are given a default implementation, or none at all.
* Concrete implementations of the abstract class, which fill in the empty or "variant" parts of the "template" with specific algorithms that vary from implementation to implementation.

## Summary

Template method pattern is a behavioral design pattern that defines the program skeleton of an algorithm in an operation, deferring some steps to subclasses. It lets one redefine certain steps of an algorithm without changing the algorithm's structure.The template method is one of the twenty-three well-known patterns described in the "Gang of Four" book Design Patterns.

## Links


* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/template_pattern.htm) - Design Patterns tutorial(en)


# Konu
Tamplate design

## Önkoşullar
Temel programlama bilgisi.

Başlangıç seviyesinde OOP bilgisi.

## Senaryo

Bu senaryoda bir şirketin çalışanlarını ücretlendirme yapısını ele aldık.İnsan kaynakları ve danışman olarak iki farklı maaş hesaplama sistemi gerekmektedir.Bu durumu template tasarım modelini kullanan bir yapı ile çözüme ulaştıracağız.

## Açıklama

Template tasarım deseninde bir operasyonu gerçekleştirmek için gerekli olan adımlar ve bu adımları çalıştıracak metotlar abstract bir sınıfta tanımlanır. Bu abstract sınıfı uygulayan gerçek sınıflar gerekli adımları override eder ve abstract sınıflarda bu adımları kullanan metotlar çarpılarak işlem gerçekleştirebilir. Böylece kod tekrarı yapılmasının önüne geçilmiş olunur.

## Özet

Template Method modeli, bir işlemdeki algoritmanın program iskeletini tanımlayan ve alt sınıflara bazı adımları erteleyen davranışsal bir tasarım modelidir. Algoritmanın yapısını değiştirmeden bir algoritmanın belirli adımlarını yeniden tanımlamasına izin verir. Template Method, "Gang of Four" kitabında açıklanan yirmi üç tanınmış tasarım deseni modellerinden birisidir.

## Linkler

* [javaturk](http://www.javaturk.org/tasarim-kaliplari-factory-method-uretici-metot-i/) - Design Patterns tutorial(tr)
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) - Design Patterns tutorial(en)