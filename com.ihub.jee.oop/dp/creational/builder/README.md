#### [English](#topic) / [Turkish](#konu)
# Topic

Builder Pattern

## Prequisites

* To understand this design pattern you will need to understand 4 object oriented programming concepts (Inheritence, Polymorphism, Abstraction and Inheritence). 
* You will also need JAVA Programming knowledge.

## Scenario

In this scenario we are going to  dealt with a factory that produces cars with different models, colors and types.And We learn  how to handle this scenario with the builder pattern.

## Explanation

Builder Pattern allows you to create more complicated object structures than simple object structures. Builder design pattern is one of the creational design pattern structure.

The scenario which explained above.First of all,Created a interface which contain common car properties.The main purpose of creating this interface is that customized implementation of unimplemented methods in the subclasses.After that implemtation, we implement the interface into the abstract class.Then,we extend this abstract class into subclasses(MercedesASeries.java&MercedesAMGSeries.java) and customized the method which are defined in interface and abstract class.In our CarBuilder class methods, a new AMG series and A series tools are produced from CarAbstract class using polymorphism which is object oriented programming concept. In the Main class, we also print with the write () method.

## CarAbstract.java
public abstract class CarAbstract implements CarProperties {

	private String name;
	private String model;
	private String color;
	private String type;

## CarProperties.java
public interface CarProperties {

	public String getName();

	public String getColor();

	public String getModel();

	public String getType();

}

## MercedesAMGSeries.java
public class MercedesAMGSeries extends CarAbstract {

	@Override
	public String getColor() {
		return "Metallic Black";
	}

	@Override
	public String getName() {
		return "Mercedes AMG Series";
	}

	@Override
	public String getModel() {
		return "AMG-GTX";
	}

	@Override
	public String getType() {
		return "Sport Car";
	}

	@Override
	public double getPrice() {
		return 800000;
	}

}

## MercedesASeries.java

public class MercedesASeries extends CarAbstract {

	@Override
	public String getColor() {
		return "Red Car";
	}

	@Override
	public String getModel() {
		return "A-180";
	}

	@Override
	public String getName() {
		return "Mercedes A Series";
	}

	@Override
	public String getType() {
		return "City Car";
	}

	@Override
	public double getPrice() {
		return 200000;
	}

}

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
