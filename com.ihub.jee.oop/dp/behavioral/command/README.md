#### [English](#topic) / [Turkish](#konu)
# Topic

The logic of the Command DP, one of the Tutorialda Behavioral Design Patterns, will explain in a Java project why and where it is used and where it is used.

## Prequisites

* Basic programming knowledge.
* Beginner level OOP knowledge.

## Scenario

A company may have independent processes in different processes, which may not belong to the same class because they are independent of each other, but they may need to wait in a clustered queue. As an example, the company may add or remove contracted banks that are financed by the company, or passive states. So when adding a new bank with a single command, the supplier can also be disconnected and kept in the same queue. How can we put together different processes?

## Explanation

Command Design Pattern, as described in the scenario, brings together different tasks and provides the execution of tasks with commands.

##### Command:
At the end of the day, the process is done with the interface class.
##### ConcreateCommand:
It implements the methods of the Command object and uses the methods of the Receiver class.
##### Receiver:
The class to which the client will communicate.
##### Invoker:
The reference to the Command object is located here, and the command object is run, invoked.

##### When should we use Command?

We know that each class is a principle of working with a single responsibility, do not we want to classify our differentiated classes with this very principle and call it collectively with a single command, and as necessary? If your answer is yes then here is Command Design Patern :)

## Summary

We asked Command Design Pattern why and how to use it.
To summarize briefly;
* The Command Design Pattern will be used to call our classrooms with different functions when we need to clusters them and when we need them to hold them in the queue.
* With Command Design Pattern, we can use frequently used clustering operations with a single command throughout the day, so we can do our own browser "favorites" as a result :)

## Links

* [Design Patterns and Architects Ali Kaya & Engin Bulut]



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
Gün sonunda gerçekleşek işlem içib Interface olan classtır.
##### ConcreateCommand : 
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