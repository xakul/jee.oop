#### [English](#topic) / [Turkish](#konu)
# Topic

Visitor Pattern

### UML Diagram of Visitor Pattern

![|Solid](https://raw.githubusercontent.com/incubationhub/jee.oop/master/com.ihub.jee.oop/dp/behavioral/visitor/images/visitorUML.PNG)

## Prequisites

* To understand this design pattern you will need to understand 4 object oriented programming concepts (Inheritence, Polymorphism, Abstraction and Inheritence). 
* You will also need JAVA Programming knowledge.

## Scenario

In the scenario that we handled, we deal with a automotive factory whose have components like shelf, pallet, gateReader and zippyReader and the company wants to see goods movement reports, shelf movement reports and carrier movement reports. The reports will include component properties like pallet id, gate type, etc.

## Explanation

The Visitor Design Pattern is one of the behavioral design pattern. Visitor pattern is used when we have to perform an operation on a group of similar kind of objects. With the help of Visitor Pattern, we can move the operational logic from the objects to another class. For example, in our project we have four components which are pallet, zippyReader, shelf and gateReader and we want to create reports from them. These four components extends Component abstract class. This class has a method called accept() and the method includes a parameter as Visitor type. All components overrides this method into themselfs. Abstract Visitor class has four abstract visit() method and this methods have object parameters(Pallet, GateReader, ZippyReader and Shelf). GoodsMovementReport, ShelfMovementReport and CarrierMovementReport classes extend Abstract Visitor class and override visit() methods. Our components, use this visit() method to do their transaction. The accept() method allows these transactions because this method returns itself as a parameter to the Visit method on the object derived from the Visitor interface sent to it. The corresponding Visit method in the ConcreteVisitor object that is sent is executed.

## Summary

* Allows you to add operations to a Composite structure without changing the structure itself.
* Adding new operations is relatively easy.
* The code for operations performed by the Visitor is centralized.

## Links

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial

---
---

# Konu

Facade Pattern

## Önkoşullar

* Bu tasarım modelini anlamak için 4 nesne yönelimli programlama kavramını (Inheritence, Polymorphism, Abstraction and Inheritence) anlamalısınız. 
* Ayrıca JAVA Programlama bilgisine de ihtiyacınız olacak.

## Senaryo

Kullandığımız senaryoda, raf, palet, gateReader ve zippyReader gibi bileşenleri olan bir fabrika ile ilgileniyor ve fabrika mal hareket raporlarını, raf hareket raporlarını ve taşıyıcı hareket raporlarını görmek istiyor. Raporlar palet kimliği, kapı tipi, vb. gibi bileşen özelliklerini içerecektir.

## Açıklama

Visitor Pattern davranışsal tasarım modellerinden biridir. Benzer bir nesneye benzer bir grup üzerinde bir işlem yapmamız gerektiğinde, visitor kalıbı kullanılır. Visitor pattern yardımıyla, operasyonel mantığı nesnelerden başka bir sınıfa taşıyabiliriz. Örneğin, projemizde palet, zippyReader, raf ve gateReader olmak üzere dört bileşenimiz var ve bunlardan raporlar oluşturmak istiyoruz. Bu dört bileşen, Component soyut sınıfını extend eder. Bu sınıfın, accept() adında bir metodu vardır ve bu metot, Visitor türü olarak bir parametre içerir. Tüm bileşenler bu yöntemi kendilerine göre override eder. Abstract Visitor sınıfında dört adet abstract visit() metodu vardır ve bu yöntemlerin nesne parametreleri (Palet, GateReader, ZippyReader ve Shelf) vardır. GoodsMovementReport, ShelfMovementReport ve CarrierMovementReport sınıfları, Abstract Visitor sınıfını extend eder ve visit() metodunu override eder. Bileşenlerimiz bu visit () metodunu işlemlerinde kullanır. accept() metodu bu işlemlere izin verir, çünkü bu metot kendisine gönderilen Visitor arabiriminden türetilen nesne üzerindeki visit() metoduna kendini parametre olarak döndürür. Gönderilen Visitor nesnesinde karşılık gelen visit() metodu yürütülür.


## Özet

* Yapının kendisini değiştirmeden Kompozit bir yapıya operasyon eklemenizi sağlar.
* Yeni operasyonlar eklemek nispeten kolaydır.
* Visitor tarafından gerçekleştirilen işlemlerin kodu merkezileştirilmiştir.

## Linkler

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial

