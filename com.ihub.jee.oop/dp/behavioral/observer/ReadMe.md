#### [English](#topic) / [Turkish](#konu)
# Topic

Observer Pattern

## Prequisites

* To understand this design pattern you will need to understand 2 object oriented programming concepts (Inheritence, Polymorphism). 
* You will also need JAVA Programming knowledge.

## Scenario

In the scenario that we handled, we will send notifications to users. 
## Explanation

After adding the userMan and userWoman to the announcement and notifying, we removed the userWoman object from the announcement and we did this by sending the observeable object. In the addObserver method, the parameter to which the user class gets the parameter that is not directly parameterized is an interface object. If we directly passed one parameter from the user class, we would have created a dependency, and when we passed another user parameter, we would have to overload the method, which would increase the dependency. In order to prevent this, we preferred to do it via the interface.

## Links

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial

---
---

# Konu

Observer Pattern

## Önkoşullar

* Bu tasarım modelini anlamak için 2 nesne yönelimli programlama kavramını (Inheritence, Polymorphism) anlamalısınız. 
* Ayrıca JAVA Programlama bilgisine de ihtiyacınız olacak.

## Senaryo

İşlediğimiz senaryoda, kullanıcalara ilgilendikleri konularla ilgili bildirim atılacak.
## Açıklama

userMan ve userWoman’ı duyuruya ekledik ve notify ettikten sonra userWoman nesnesini duyurudan geri çıkardık ve bunu observable nesnesini göndererek yapmış olduk. addObserver metodunda kullanıcı sınıfını direk parametre geçmedik metodun aldığı parametre bir interface nesnesi . Eğer direk kullanıcı sınıfından birini parametre geçseydik bir bağımlılık oluştumuş olurduk ve başka bir kullanıcı parametresi geçtiğimizde o metodu overloading yapmak zorunda kalacaktık bu da bağımlılığı arttıracaktı. Bunu önlemek adına interface üzerinden yapmayı tercih ettik.

## Linkler

* [Head First Design Patterns](https://github.com/kanastasov/Advanced-Java-Programming--First-Semeste-/blob/master/Design%20Patterns%20For%20Dummies%20%26%20HeadFirst/head%20first%20design%20patterns%20-%20ora%202004.pdf) - Design Patterns pdf
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm) - Design Patterns tutorial
