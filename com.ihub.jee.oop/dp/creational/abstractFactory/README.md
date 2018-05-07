#### [English](#topic) / [Turkish](#konu)

# Topic

The Abstract Factory  design pattern is one of the twenty-three well-known GoF design (The Gang of Four are the four authors of the book, "Design Patterns: Elements of Reusable Object-Oriented Software."). patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse.

### UML DIAGRAM OF ABSTRACT FACTORY PATTERN

![|Solid](https://raw.githubusercontent.com/incubationhub/jee.oop/master/com.ihub.jee.oop/dp/creational/abstractFactory/images/abstractFactorUML.PNG)

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


### abstractFactory.java
/**
 * Create an Abstract class to get factories for Type and Shape Objects.
 * 
 * Pipe veya pallet üretmek için bir abstract class oluştur.
 * 
 */
public abstract class AbstractFactory {

	abstract PalletType getType(String type);

	abstract PipeShape getShape(String shape);
}

## FactoryProducer.java
/*
 * These class choose that which class going to created.
 * 
 * 
 * Bu class değerlere göre hangi classın çalışacağına karar verir.
 * 
 * */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("PIPE")) {
			return new PipeFactory();
		} else if (choice.equalsIgnoreCase("PALLET")) {
			return new PalletFactory();

		}
		return null;

	}

}

### main.java
	public static void main(String[] args) {

		/**
		 * Get pipe factory.Pipe factory oluştur.
		 *
		 */
		AbstractFactory pipeFactory = FactoryProducer.getFactory("PIPE");

		/**
		 * Get an object of PipeShape silicone.
		 * 
		 * // * PipeShape classından silicon pipe üret.
		 */

		PipeShape pipe1 = pipeFactory.getShape("SILICONE");

		/**
		 * Call palletShape method of Shape 3D.
		 * 
		 * SiliconePipe classından palletType methodunu cağır.
		 * 
		 */

		pipe1.pipeType();

		/**
		 * Get Pallet factory. Pallet factory oluştur.
		 */
		AbstractFactory palletFactory = FactoryProducer.getFactory("PALLET");

		/**
		 * Get an object of Pallettype Steal.
		 * 
		 * PalletType sınıfınfan steal objesi yarat.
		 */
		PalletType pallet = palletFactory.getType("steal");
		/**
		 * Call palletType method of type steal.
		 * 
		 * Steal classından palletType methodunu cağır.
		 * 
		 */

		pallet.palletType();

	}

}

## Summary

Rather than building a concrete object, it’s building a family of related or dependent objects without specifying concrete class.
Use when: system should be independent of how what it is producing is structured or represented

## Links

* [javaturk](http://www.javaturk.org/tasarim-kaliplari-factory-method-uretici-metot-i/) - Design Patterns tutorial(tr)
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) - Design Patterns tutorial(en)


# Konu
Abstract Factory design

## Önkoþullar
Temel programlama bilgisi.

Başlangıç seviyesinde OOP bilgisi.

## Senaryo

Bu senaryoda Farklı tiplerde endutriel palet ve boru üreten bir fabrika ele aldık.Bu fabrika çelik ve tahta olamak üzere iki ayrı  palet ve silikon, plastik olmak üzere iki ayrı boru tipi üretmektedir.Bu senaryodaki amacımız,brbirleriyle ilgili ya da bağımlı nesne ailelerini, nesnelerin somut sınıflarını belirtmeden yaratmak için bir arayüz oluşturmak.


## Açıklama

Abstract factory design pattern factory design ile benzer özelliklere sahiptir.Bu iki designi ayıran en buyuk fark factory gibi tek bir interfaceden değil,her ürün için ayrı bir interface kullanılmasıdır.


## Özet

Birden fazla ürün ailesi ile çaliþmak durumunda kaldığımız, kullanacağımız ürün ailesi ile client tarafını soyutlamak için abstrac factory kullanılır.Birbaşka kullanım amacı ise factory pattern kullandığımız factoryProducer sınıfınn içine if else bloclarıyla hangi objenin oluþturulucağına karar veririz.
