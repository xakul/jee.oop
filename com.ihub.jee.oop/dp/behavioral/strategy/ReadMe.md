#### [English](#topic) / [Turkish](#konu)
# Topic

The purpose of this exercise is to understand the Strategy pattern, and how we can use it in a scenario
Strategy pattern is a pattern that allows for one task to be completed in different ways.

## Prerequisites

*   Basic Java/OOP knowledge.
*	Maven structure basics.
*   JavaMail library structure.

You need to add JavaMail (javax.Mail) to the Maven dependencies part of your "pom.xml" file in your project.

```
<dependencies>
    ...
    <dependency>
		<groupId>com.sun.mail</groupId>
		<artifactId>javax.mail</artifactId>
		<version>1.5.5</version>
	</dependency>
    ...
</dependencies>
```

## Scenario

Imagine a consultant that makes offers to customers.
Based on the response of the customer, different mails to different people need to be sent.
Strategy pattern can achieve this from a common function that takes different actions based on the situation.

## Explanation

First of all, we need to create an interface that the child classes will fill the functions of.

##### Informer.java
```
public interface Informer {
	public void sendMessage(String toBeSent, Session session) throws MessagingException;
}
```

Then, a "Message" class is created. This class will have the role of being the intermediate class between the interface and
the child classes, in terms of object invocation and functions. The function "executeOperation" will be called from different
objects, based on the situation.

##### Message.java
```
public class Message {

    private Informer informer;

	public Message(Informer informer) {
		this.informer = informer;
	}

	public void executeOperation(String toBeSent) throws MessagingException {
		
        ...
        informer.sendMessage(toBeSent, session);
    }
    
}
```

"AcceptedMessage" class, implements the "Informer" class, and fills the function "sendMessage", depending on it's needs.
This structure is also true for "RejectedMessage" and "ErrorMessage" classes.

##### AcceptedMessage.java
```
public class AcceptedMessage implements Informer {

	public void sendMessage(String toBeSent, Session session) throws MessagingException {
		
        ...
	}

}
```

Finally, we create the "Main" class and function, that instantiates the objects based on the scenario.
Notice that, the same function on the interface is called all the time.

##### Main.java
```
public class Main {
	public static void main(String[] args) throws MessagingException {
		Message message = new Message(new AcceptedMessage());
		message.executeOperation("Your offer is ACCEPTED by the buyer party.");
		
		message = new Message(new RejectedMessage());
		message.executeOperation("Your offer is REJECTED by the buyer party. Reason: XXXX");
		
		message = new Message(new ErrorMessage());
		message.executeOperation("Error Code: XXXX. The system has failed.");
	}
}

```

## Links

* [Strategy](https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm) - Strategy Pattern Tutorial
* [JavaMail](https://docs.oracle.com/javaee/7/api/javax/mail/package-summary.html) - JavaMail (Javax.Mail)

---
---

# Konu

Bu alıştırmanın amacı, Strateji deseninin, (Strategy Pattern) nasıl nesne tabanlı programlamada kullanılabileceğine bakmaktır.
Strateji deseni, bir işlemin birden fazla şekilde gerçekleştirilebilineceği durumları düzenleyen tasarım desenidir.

## Önkoşullar

*   Temel Java ve Nesne-Yönelimli Programlama bilgisi.
*	Maven Yapısı Temelleri.
*   JavaMail kütüphanesinin yapısı.

Maven projenizde bulunan "pom.xml" dosyasına, gereksinim olarak "javax.Mail" kütüphanesini eklemeniz gerekmektedir.

```
<dependencies>
    ...
    <dependency>
		<groupId>com.sun.mail</groupId>
		<artifactId>javax.mail</artifactId>
		<version>1.5.5</version>
	</dependency>
    ...
</dependencies>
```

## Senaryo

Şirkette bir çalışanın, müşterilerine teklif yaptığını düşünelim.
Gelen cevaba göre, farklı çalışanlara, farklı maillerin atılması gerekiyor.
Strateji deseni, ortak bir sınıflandırmadan, farklı işleri yapan fonksiyonlar kullanarak bunu sağlayabilir.

## Açıklama

Öncelikle, alt sınıflandırmaların fonksiyonlarını dolduracağı bir arayüz (Interface) yaratıyoruz.

##### Informer.java
```
public interface Informer {
	public void sendMessage(String toBeSent, Session session) throws MessagingException;
}
```

Daha sonra, Informer sınıfını bulunduran ve Informer sınıfında yaratılan "sendMessage" fonksiyonunu çağıran ara katman
bir sınıflandırma yazıyoruz. Bu sınıfta bulunan "executeOperation" fonksiyonu, mesaj objelelerine göre farklı şekillerde
çağırılacaktır.

##### Message.java
```
public class Message {

    private Informer informer;

	public Message(Informer informer) {
		this.informer = informer;
	}

	public void executeOperation(String toBeSent) throws MessagingException {
		
        ...
        informer.sendMessage(toBeSent, session);
    }
    
}
```

"AcceptedMessage" sınıfı, "Informer" sınıfını tamamlayarak (implement) kendi isteğine göre doldurur.
Bu yapı, "RejectedMessage" ve "ErrorMessage" sınıfları için de geçerlidir.

##### AcceptedMessage.java
```
public class AcceptedMessage implements Informer {

	public void sendMessage(String toBeSent, Session session) throws MessagingException {
		
        ...
	}

}
```

Son olarak, bu yapıların kullanıldığı "Main" sınıfı, istenilen duruma göre objeleri ve fonksiyonları,
kurduğumuz yapıya göre çağırıyor.

##### Main.java
```
public class Main {
	public static void main(String[] args) throws MessagingException {
		Message message = new Message(new AcceptedMessage());
		message.executeOperation("Your offer is ACCEPTED by the buyer party.");
		
		message = new Message(new RejectedMessage());
		message.executeOperation("Your offer is REJECTED by the buyer party. Reason: XXXX");
		
		message = new Message(new ErrorMessage());
		message.executeOperation("Error Code: XXXX. The system has failed.");
	}
}

```

## Linkler

* [Strategy](https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm) - Strategy Pattern Tutorial
* [JavaMail](https://docs.oracle.com/javaee/7/api/javax/mail/package-summary.html) - JavaMail (Javax.Mail)