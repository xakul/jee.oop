#### [English](#topic) / [Turkish](#konu)
# Topic

The purpose of the Command Pattern Tutorial, Behavioral Design Patterns, will explain in a Java project why and where it is used.

## Prequisites

* Basic programming knowledge.
* Beginner level OOP knowledge.

## Scenario

A company has independent processes in different area related , which may not belong to the same class because they are independent of each other, but they may need to wait in a clustered queue. For instance, the company may add or remove contracted banks that are financed by the company, separately Supplier customers may be active or passive states.Let's think, when adding a new bank with a single command, the supplier can also be disconnected and kept in the same queue. How can we put together different processes?

## Explanation

Command Design Pattern, as described in the scenario, brings together different tasks and provides the execution of tasks with commands.

##### Command:
At the end of the day, the process which will be done is the interface class.
##### Concreate Command:
It implements the methods of the Command objects and It uses the methods of the Receiver class.
##### Receiver:
The class will communicate with client.
##### Invoker:
The reference to the Command object is located here, and the command object is run by invoker class.

##### When should we use Command?

We know that each class is a principle of working with a single responsibility, do not we want to classify necessary our differentiated classes with this very principle and call it collectively with a single command ? If your answer is yes then here is Command Design Patern :)

## Summary

We want to find answer Command Design Pattern why and how to use it.
To summarize briefly;
* The Command Design Pattern will be used to call our classrooms with different classes and processes when we need to clusters them to hold them in the queue.
* With Command Design Pattern, we can use frequently used clustering operations with a single command throughout the day, so we can do like our own browser "favorites" as a result :)

## Links

* [Design Patterns and Architects Ali Kaya & Engin Bulut
* [Enterprise Java](http://www.kurumsaljava.com/category/designpatterns/)


# Konu

Tutorialda Behavioral Design Pattern'lerden biri olan Command DP'nin çalışma mantığı, neden kullanıldığı ve nerelerde kullandığını bir Java projesi üzerinden açıklanacaktır.

## Gereksinimler

*   Temel programlama bilgisi.
*   Başlangıç seviyesinde OOP bilgisi.

## Senaryo

Bir şirketin farklı süreçlerde bağımsız olan işlemleri vardır, bu işler birbirinden bağımsız oldukları için aynı class'a ait olmayabilirler ama bunların kümelenmiş bir biçimde kuyrukta bekleme ihtiyacı olabilmektedir.Örnek olarak Şirketin finans işlemlerini yaptığı anlaşmalı bankaları ekleyip çıkartabilir, ayrı olarak da tedarik süreci çalıştığı firmayı aktif veya pasif etme durumları olabilmektedir. Yani tek bir komutla yeni bir banka eklerken, tedarikçi ile de yollarını ayrılabilir ve aynı kuyrukta da tutulması gerekebilir.Birbirinden farklı süreçleri nasıl bir araya getirebiliriz ? 

## Açıklama

Command Design Pattern, seneryoda da anlatıldığı gibi farklı işleri bir araya getirerek komutlarla işlerin yürütülmesini sağlamaktadır.

##### Command : 
Gün sonunda gerçekleşek işlem için Interface olan classtır.
##### Concreate Command : 
Command nesnesindeki metotları uygular ve Recevier Classındaki metotları da kullanan sınıftır.
##### Receiver : 
Client tarafından iletişime geçilecek olan classtır.
##### Invoker :
Command nesnesinin referansı burada bulunur ve command nesnesini çalıştırır, invoke edilendir yani.

##### Ne zaman Command Kullanmalıyız ? 

Her bir sınıfın tek bir sorumluluk ile çalışma prensibi olduğunu biliyoruz, peki bu prensip ile farklılaşan sınıflarımızı kümelendirip tek bir komutla toplu bir şekilde çağırıp, ve gerektiği gibi   istemez miyiz ? Cevabınız evet ise işte size Command Design Patternn :)

## Özet

Command Design Pattern'i niçin,nasıl  kullanmalıyız, sorularına cevap aradık.
Kısaca özet geçmek gerekirse; 
*   Command Design Pattern farklı işlevleri olan sınıflarımızı kümeleme ihtiyacı hissettiğimiz de ve kuyrukta onları bekletip ihtiyacımız olduğunda çağırabilmek için kullanılacaktır.
*   Command Design Pattern ile çok sık kullanılan kümelenme işlemleri gün içinde tek komutla kullanabiliriz yani sonuç olarak kendimize tarayıcı "sık kullanılanlar"ı yapabiliriz :)

## Linkler

* [Tasarım Desenleri ve Mimarileri Ali Kaya & Engin Bulut]
* [Kurumsal Java](http://www.kurumsaljava.com/category/designpatterns/)