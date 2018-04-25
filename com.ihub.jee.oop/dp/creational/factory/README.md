#### [English](#topic) / [Turkish](#konu)

# Topic

Factory Pattern


## Prequisites

Basic java programming knowledge

Basic OOP knowledge


## Scenario

In the scenario we dealt with a creating differnt type of order reports,
we have two type reports which are sales and purchase.Each of the has different attributes.

## Explanation

In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.



## Summary
"Define an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation it uses to subclasses."

Creating an object often requires complex processes not appropriate to include within a composing object. The object's creation may lead to a significant duplication of code, may require information not accessible to the composing object, may not provide a sufficient level of abstraction, or may otherwise not be part of the composing object's concerns. The factory method design pattern handles these problems by defining a separate method for creating the objects, which subclasses can then override to specify the derived type of product that will be created.

The factory method pattern relies on inheritance, as object creation is delegated to subclasses that implement the factory method to create objects

## Links

* [javaturk](http://www.javaturk.org/tasarim-kaliplari-factory-method-uretici-metot-i/) - Design Patterns tutorial(tr)
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) - Design Patterns tutorial(en)

# Konu
Factory design
## Önkoşullar
Temel programlama bilgisi.
Başlangıç seviyesinde OOP bilgisi.

## Senaryo

Senaryoda farklı tiplerde sipariş raporu çıktısı almayı konu aldık. Daha sonra bu senaryoyu factory pattern ile nasıl ele alacağımıza odaklandık.

## Açıklama

Nesne-merkezli programlardaki tabi olarak en temel iş, nesne yaratmaktır. Uygulamalarda farklı karmaşıklıkta pek çok sınıf vardır ve bu sınıfların nesneleri uygulamanın farklı yerlerinde oluşturulur. Bu kalıp, nesnelerin yaratılmalarını soyutlamakta ve bu işi “üretici” ya da “factory” metoda havale etmektedir. Factory method, nesnelerin yaratılmasından sorumlu bir metottur öyle ki bir arayüzün alt sınıfında bulunur.

Client’ın,  nesnelerinin sadece arayüzlerini değil aynı zamanda nasıl yaratılacaklarını da bilmesi, Client’ın Product’lara olan bağımlılığını arttırır. Çoğu zaman bir nesneyi yaratmak, onu kullanmaktan daha karmaşıktır.

## Özet
Factory Method  creational grubununa ait, aynı arayüzü kullanan nesnelerin üretiminden sorumlu tasarım desenidir
Factory pattern yinelenen tasarım sorunlarının esnek ve yeniden kullanılabilir nesne tabanlı yazılımları tasarlamak için nasıl kullanılacağını açıklar; bu, uygulanması, değiştirilmesi, test edilmesi ve yeniden kullanılması daha kolay nesnelerdir.

factory Method tasarım deseni aynı abstract sınıfı veya arayüzü uygulayan sınıfların üretiminden sorumludur. Nesne üretiminden sorumlu bir class olur ve bu sınıftaki metoda gönderilen parametre ile üretilecek sınıfın türü belirlenir
