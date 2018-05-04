#### [English](#topic) / [Turkish](#konu)

# Topic

Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. This pattern comes under behavior pattern category.

##UML DIAGRAM OF TAMPLATE PATTERN

## Prequisites

Basic java programming knowledge

Basic OOP knowledge


## Scenario
    
In this scenario we have discussed the cost structure of a company's employees. Two different salary calculation systems are required as human resources and consultants. We will arrive at a solution with a structure that uses the fullplate design model.


## Explanation

This pattern has two main parts, and typically uses object-oriented programming:

*The "template method", generally implemented as a base class (possibly an abstract class), which contains shared code and parts of the overall algorithm which are invariant. The template ensures that the overarching algorithm is always followed. In this class, "variant" portions are given a default implementation, or none at all.
*Concrete implementations of the abstract class, which fill in the empty or "variant" parts of the "template" with specific algorithms that vary from implementation to implementation.

## Summary

Template method pattern is a behavioral design pattern that defines the program skeleton of an algorithm in an operation, deferring some steps to subclasses. It lets one redefine certain steps of an algorithm without changing the algorithm's structure.The template method is one of the twenty-three well-known patterns described in the "Gang of Four" book Design Patterns.
## Links

* [javaturk](http://www.javaturk.org/tasarim-kaliplari-factory-method-uretici-metot-i/) - Design Patterns tutorial(tr)
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) - Design Patterns tutorial(en)


# Konu
Tamplate design

## Önkoþullar
Temel programlama bilgisi.

Baþlangýç seviyesinde OOP bilgisi.

## Senaryo

Bu senaryoda bir þirketin çalýþanlarýný ücretlendirme yapýsýný ele aldýk.Ýnsan kaynaklarý ve danýþman olarak iki farklý maaþ hesaplama sistemi gerekmektedir.Bu durumu tamplate tasarým modelini kullanan bir yapý ile çözüme ulaþtýracaðýz.

## Açýklama

Template tasarým deseninde bir operasyonu gerçekleþtirmek için gerekli olan adýmlar ve bu adýmlarý çalýþtýracak metotlar abstract bir sýnýfta tanýmlanýr. Bu abstract sýnýfý uygulayan gerçek sýnýflar gerekli adýmlarý overwrite eder ve abstract sýnýfýnda bu adýmlarý kullanan metotlar çaðrýlarak iþlem gerçekleþtirilir. Böylece kod tekrarý yapýlmasýnýn önüne geçilmiþ olunur.

## Özet

Template tasarým deseni; behavioral grubuna ait bir algoritmanýn adýmlarýnýn abstract sýnýfta tanýmlanarak farklý adýmlarýn concrete sýnýflarýnda overwrite edilip çalýþtýrýlmasýný düzenler.
