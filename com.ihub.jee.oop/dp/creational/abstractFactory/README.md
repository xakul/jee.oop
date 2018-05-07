#### [English](#topic) / [Turkish](#konu)

# Topic

The Abstract Factory design pattern is one of the twenty-three well-known design patterns that describe how to solve recurring design problems by improving design flexible and reusable object-oriented software, which objects that are easier to implement, change, test and reuse.

### UML Diagram of Abstract Method Pattern

![|Solid](https://raw.githubusercontent.com/incubationhub/jee.oop/master/com.ihub.jee.oop/dp/creational/abstractFactory/images/abstractFactorUML.PNG)

## Prequisites

* Basic java programming knowledge.

* Basic OOP knowledge.


## Scenario

In this scenario we have dealt with a factory that produces industrial pallets and pipes in different types. This plant produces two types of pallets in steel, wood, and silicon, two types of pipes in plastic. Our goal in this scenario is to create an interface to create interrelated or dependent object families without specifying concrete classes of objects.

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

public class FactoryProducer {

/**
 * These class choose that which class going to created.
 * 
 * Bu class değerlere göre hangi sınıfın çalışacağına karar verir.
 */
 
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

Özet Fabrika tasarım deseni, uygulanması kolay, değiştirilebilen, test edilen ve yeniden kullanan nesnelerin tasarlandığı esnek ve yeniden kullanılabilir nesne tabanlı yazılımları geliştirerek, yinelenen tasarım sorunlarının nasıl çözüleceğini açıklayan yirmi üç tanınmış tasarım modelinden biridir.

## Önkoşullar

* Temel programlama bilgisi.

* Başlangıç seviyesinde OOP bilgisi.

## Senaryo

Bu senaryoda farklı tiplerde endüstriyel palet ve boru üreten bir fabrika ele aldık. Bu fabrika çelik, tahta tiplerinde iki tane palet tipi ve silikon, plastik tiplerinde iki ayrı boru tipi üretmektedir.Bu senaryodaki amacımız, birbirleriyle ilgili ya da bağımlı nesne ailelerini, nesnelerin somut sınıflarını belirtmeden yaratmak için bir arayüz oluşturmak.


## Açıklama

Abstract factory design pattern, factory design ile benzer özelliklere sahiptir. Bu iki paterni ayıran en büyük fark factory gibi tek bir interface'ten değil, her ürün için ayrı bir interface kullanılmasıdır.


## Özet

Birden fazla ürün ailesi ile çalışmak durumunda kaldığımızda, kullanacağımız ürün ailesi ile client tarafını soyutlamak için abstract factory kullanılır.Bir başka kullanım amacı ise factory pattern kullandığımız factoryProducer sınıfının içine if/else yapısı ile hangi objenin oluşturulacağına karar veririz.

## Linkler

* [javaturk](http://www.javaturk.org/tasarim-kaliplari-factory-method-uretici-metot-i/) - Design Patterns tutorial(tr)
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) - Design Patterns tutorial(en)
