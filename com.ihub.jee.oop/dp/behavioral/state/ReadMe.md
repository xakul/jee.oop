#### [English](#topic) / [Turkish](#konu)
# Topic

State Pattern

## Prequisites

* To understand this design pattern you will need to understand 2 object oriented programming concepts (Inheritence, Polymorphism). 
* You will also need JAVA Programming knowledge.

## Scenario

In our scenario we have a robot with properties such as taking products, putting them and Standby mode for on hold. We will show how to execute the given commands in the code with a design pattern without any if or switchcase structure.
## Explanation

The robot will take 3 commands. The commands are Take, Put and Standby. You can take the product while the robot is waiting. After you put the product, you can put to the shelf and wait after putting the product. If you want to go to wait after putting the product you can not do this without going standby mode. The first thing to do is to manage this process without using any complicated if or switchcase structure.

## Links

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial

---
---

# Konu

State Pattern

## Önkoşullar

* Bu tasarım modelini anlamak için 2 nesne yönelimli programlama kavramını (Inheritence, Polymorphism) anlamalısınız. 
* Ayrıca JAVA Programlama bilgisine de ihtiyacınız olacak.

## Senaryo

İşlediğimiz senaryoda, ürünü taşıması, yerine koyması ve bekleme durumuna geçmesi gibi özellikleri bulunan bir robotumuz vardır.Bu robota verilen komutları kodda herhangi bir if veya switchcase yapısı olmadan design patternla nasıl yapılacağını göstereceğiz.
## Açıklama

Robotumuzun 3 adet komutu olacak.Bu komutlar Al,Koy ve Bekle.Robotumuz bekleme durumundayken ürünü alabilir.Ürünü aldıktan sonra rafa koyabilir ve rafa koyduktan sonra bekleme durumuna geçer.Eğer ürünü aldıktan sonra bekleme durumuna geçmek isterse rafa koymadan bu işlemi gerçekleştiremez.Veya ürünü yerleştirdikten hemen sonra tekrar ürün alma işlemi yapamaz, ilk önce bekleme moduna geçmelidir.Bu patternın asıl amacı herhangi bir karmaşık if veya switchcase yapısı kurmadan bu süreci yönetmek.

## Linkler

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial
