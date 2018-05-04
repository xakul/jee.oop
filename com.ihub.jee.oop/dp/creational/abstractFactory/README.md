#### [English](#topic) / [Turkish](#konu)

# Topic

The Abstract Factory  design pattern is one of the twenty-three well-known GoF design (The Gang of Four are the four authors of the book, "Design Patterns: Elements of Reusable Object-Oriented Software."). patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse.

##UML DIAGRAM OF FACTORY PATTERN

![|Solid](https://raw.githubusercontent.com/incubationhub/jee.oop/master/com.ihub.jee.oop/dp/creational/factory/images/AbstractfactoryUml.PNG)

## Prequisites

Basic java programming knowledge

Basic OOP knowledge


## Scenario
In this Scenario we are going to handle with a factory that produce industrial pipe and pallet.this factory has two type pallet that steal and wooden,and two types of pipe which are silicone and plastic.Our scope of this project,to provide an interface for creating brane-related or dependent object families without specifying concrete classes of objects.


## Explanation

Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

The Abstract Factory design pattern solves problems like: 

How can an application be independent of how its objects are created?
How can a class be independent of how the objects it requires are created?
How can families of related or dependent objects be created?


## Summary

Rather than building a concrete object, it’s building a family of related or dependent objects without specifying concrete class.
Use when: system should be independent of how what it is producing is structured or represented

## Links

* [javaturk](http://www.javaturk.org/tasarim-kaliplari-factory-method-uretici-metot-i/) - Design Patterns tutorial(tr)
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) - Design Patterns tutorial(en)


# Konu
Factory design

## Önkoþullar
Temel programlama bilgisi.

Baþlangýç seviyesinde OOP bilgisi.

## Senaryo

Bu senaryoda farklý tiplerde endutriel palet ve boru üreten bir fabrikayý ele aldýk.Bu fabrika çelik ve tahta olamk üzere iki ayrý  palet ve silikon, plastik olmak üzere iki ayrý boru tipi üretmektedir.Bu senaryodaki amacýmýz ,brbirleriyle ilgili ya da baðýmlý nesne ailelerini, nesnelerin somut sýnýflarýný belirtmeden yaratmak için bir arayüz saðlamak.


## Açýklama

Abstract factory design pattern factory design ile benzer özelliklere sahiptir.Bu iki designi ayýran en buyuk fark factory gibi tek bir interfaceden deðil,her ürün için ayrý bir interface kullanýlmasýdýr.


## Özet

Birden fazla ürün ailesi ile çaliþmak durumunda kaldýðýmýzda, kullanacaðýnýz ürün ailesi ile client tarafýný soyutlamak için abstrac factory kullanýlýr.Birbaþkakullaným amacý ise factory pattern kullanýðýmýz factoryProducer sýnýfýnýn içine if else bloclarýyla hangi objenin oluþturulucaðýna karar veririz.
