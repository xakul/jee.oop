#### [English](#topic) / [Turkish](#konu)
# Topic
The purpose of the Proxy Pattern Tutorial, Structural Design Patterns, will explain in a Java project why and where it is used.
### UML Diagram of Command Pattern

![|Solid](https://raw.githubusercontent.com/incubationhub/jee.oop/master/com.ihub.jee.oop/dp/behavioral/command/%C4%B1mages/CommandUML.PNG)
## Prequisites
* Basic programming knowledge.
* Beginner level OOP knowledge.

## Scenario
A bank company has announced to be valid to check system in their system.A Check system must be needed to be ready like check valid control, check payment etc.
As summary scenario,a customer who has a check,When he deliveres check to bank , The bank pay your money related to check.Customer does not know how to check is valid. He know only for money to check.When check transactions happen We have a proxy class which make to do another class(RealSubject) and it will return result. Finally, How can we build a bridge between Proxy classes and Client classes ? 
## Explanation

Proxy Design Pattern, as described in the scenario, How can we seperate this from  Real Class and Proxy Class to Client Class  ? 

##### Client:
Client Class, We can  think a customer. Client can request related to check transactions.
##### Subject:
Interface Class,RealSubject and Proxy Class implements this class.It allows to the client to work with a single type.
##### Real Subject:
This class that does actual job.a request which is done by the client is actually here but Client can not access .
##### Proxy:
The class that performs the actual job (RealSubject) is the reference field class. It responds to the requests of the client, and the client communicates with the proxy.

##### When should we use Proxy?

Usuage area can be divided by 3.
    1-Remote Proxy
    It can be used to need to be remote object.a proxy ( delegate ) can be assigned to the remote object and this delegate  contact this.
    2-Virutal Proxy
    It is preferred for the creation or use of objects with high usage and production cost .For instance, Loading screen, when page is loading slowly , we can show loading message to the client.
    3-Protection Proxy
    It is used with the same logic in case of authorization required for a transaction to be made or in login situations.

## Summary

We asked why and how to use the Proxy Design Pattern.
To summarize briefly;
*   Proxy Design Pattern is a pattern type that comes from the Proxy concept, a patter that is used when the proxy class and the client do not have access to it.
*   With Proxy DP, we get the confidentiality of the current controls from the client, we draw a line between the actual work class and a structure that can dynamically use our different proxy classes with the same need.

## Links

* [Design Patterns and Architects Ali Kaya & Engin Bulut ]
* [Code Senior](http://www.codesenior.com/tutorial/Vekil-Proxy-Tasarim-Deseni)


# Konu

Tutorialda Structural Design Pattern'lerden biri olan Proxy DP'nin çalışma mantığı, neden kullanıldığı ve nerelerde kullandığı bir Java projesi üzerinden açıklanacaktır.

## Gereksinimler

*   Temel programlama bilgisi.
*   Başlangıç seviyesinde OOP bilgisi.

## Senaryo

Bir banka şirketi çek kabul sisteminin artık bankalarında müştelerine hizmet verdiğini duyurmaktadır.Çek işlemlerinin karşılıksız çıkmaması, geçerli olması gibi teknik işlemlerin gerçekleştiği bir sistem kurulması gerekmektedir.
Özet olarak seneryo, çekin sahibi olan müşteri, bankaya çeki teslim edip karşılığında gerekli kontrollerin yapılmasının ardından para olarak karşılığını alması gerekmektedir.Müşteri bu kontrollerin nasıl gerçekleştğini bilmemesi gerekir.Çek işlemlerini gerçekleştirirken vekil bir sınıfımız olmalı ve bize çek kontrol işlemlerini başka bir sınıfa yaptırıp geri döndürmelidir, peki vekil sınıfla nasıl bir köprü oluşturmamız gerekir ?  

## Açıklama

Proxy Design Pattern, seneryoda da anlatıldığı gibi aslında gerçek işi yapan sınıfı proxy üzerinden client'dan nasıl çağırabiliriz ? 

##### Client : 
Client sınıfı, müşteri  olarak düşenebiliriz.Çek işlemleri için istek yapar.
##### Subject : 
Interface class'ıdır, RealSubject ve Proxy'nin implement ettiği sınıftır, Client'in tek bir tip ile çalışmasını sağlar.
##### Real Subject : 
Asıl işi yapan sınıftır, client'in yaptığı istek tam olarak burada gerçekleşir ama Client erişemez.
##### Proxy :
Asıl işi yapan sınıftan(RealSubject) referans alan sınıftır.İstemcinin isteklerine cevap verir, istemci burası ile iletişime geçer. 

##### Ne zaman Proxy Kullanmalıyız ? 

Kullanım alanını 3 e bölebiliriz.
    1-Remote( Proxy
        Remote bir nesneye ihtiyaç olan durumlarda kullanılabilir, uzaktaki nesneye bir temsilci atanır ve o temsilci ile gerekli kontroller yapılır.
    2-Virtual Proxy
        Kullanım ve üretim maliyeti fazla olan nesnelerin oluşturulması veya kullanılmasında tercih edilir.Örnek olarak loading ekranını verebiliriz, sayfa geç yüklenirken araya loading mesajını koyarız.
    3-Protection Proxy 
        Yapılacak bir işlemin yetki gerektirdiği veya login durumlarda da aynı mantıkla kullanılır. 
## Özet

Proxy Design Pattern'i niçin,nasıl  kullanmalıyız, sorularına cevap aradık.
Kısaca özet geçmek gerekirse;
*   Proxy Design Pattern, Proxy(Vekil) kavramından gelen bir pattern türüdür, vekil sınıfımız ile client'in erişemediği yada erişmesinin mantıklı olmadığı durumlarda kullanılan bir patterndir.
*   Proxy DP ile Client'dan geçerli kontrollerin gizliliğini sağlamış oluruz, yapılacak asıl işi olan sınıf ile arasına bir çizgi çekmiş oluruz, bu sayede farklı farklı yapılar proxy sınıfımızı aynı ihtiyaç ile dinamik olarak kullanabilen bir yapı oluşur.

## Linkler

* [Tasarım Desenleri ve Mimarileri Ali Kaya & Engin Bulut]
* [Code Senior](http://www.codesenior.com/tutorial/Vekil-Proxy-Tasarim-Deseni)