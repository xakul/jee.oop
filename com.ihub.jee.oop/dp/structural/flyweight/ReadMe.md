#### [English](#topic) / [Turkish](#konu)
# Topic

State Pattern

## Prequisites

* To understand this design pattern you will need to understand 2 object oriented programming concepts (Inheritence, Polymorphism). 
* You will also need JAVA Programming knowledge.
* OData V2

## Scenario

In our scenario, there are multiple orders in detail within one order. We will use existing references instead of getting a new instance for each ordering products.
## Explanation

Because the flyweight pattern is the objective optimizer, we will reduce the memory usage by using the existing references instead of getting the instance each time for the same products. We connect to the Northwind service (OData v2) first and then we receive our data. After the order, we receive and check the product in order detail. If the product already exists, we call it. If not, we take an instance and add it to my list.

## Links

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial

---
---

# Konu

Flyweight Pattern

## Önkoşullar

* Bu tasarım modelini anlamak için 2 nesne yönelimli programlama kavramını (Inheritence, Polymorphism) anlamalısınız. 
* Ayrıca JAVA Programlama bilgisine de ihtiyacınız olacak.
* OData v2

## Senaryo

İşlediğimiz senaryoda, bir siparişimiz, siparişimizin detayları ve içinde ürünler bulunmaktadır.bir siparişin içinde birden fazla sipariş detay olabilir.Burada her bir siparişteki ürünler için yeni instance almak yerine var olan referansları kullanacağız.

## Açıklama
Flyweight patternın amacı optimazsyon olduğu için aynı ürünler için her seferinde instance almak yerine var olan referanslarını kullanarak Bellek kullanımını azaltacağız.İlk olarak Northwind servisine (OData v2) bağlanarak verilerimizi çekiyoruz.Çektikten sonra siparişi oluştururken sipariş detayının içinde olan ürünü alıyoruz ve kontrol ediyoruz.Eğer bu ürün daha önce var ise onu çağırıyoruz.Eğer yoksa bir instance alıp listemize ekliyoruz.Bu sayede bellek yönetimi yapmış oluyoruz.


## Linkler

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial
