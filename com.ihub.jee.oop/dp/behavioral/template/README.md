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

## �nko�ullar
Temel programlama bilgisi.

Ba�lang�� seviyesinde OOP bilgisi.

## Senaryo

Bu senaryoda bir �irketin �al��anlar�n� �cretlendirme yap�s�n� ele ald�k.�nsan kaynaklar� ve dan��man olarak iki farkl� maa� hesaplama sistemi gerekmektedir.Bu durumu tamplate tasar�m modelini kullanan bir yap� ile ��z�me ula�t�raca��z.

## A��klama

Template tasar�m deseninde bir operasyonu ger�ekle�tirmek i�in gerekli olan ad�mlar ve bu ad�mlar� �al��t�racak metotlar abstract bir s�n�fta tan�mlan�r. Bu abstract s�n�f� uygulayan ger�ek s�n�flar gerekli ad�mlar� overwrite eder ve abstract s�n�f�nda bu ad�mlar� kullanan metotlar �a�r�larak i�lem ger�ekle�tirilir. B�ylece kod tekrar� yap�lmas�n�n �n�ne ge�ilmi� olunur.

## �zet

Template tasar�m deseni; behavioral grubuna ait bir algoritman�n ad�mlar�n�n abstract s�n�fta tan�mlanarak farkl� ad�mlar�n concrete s�n�flar�nda overwrite edilip �al��t�r�lmas�n� d�zenler.
