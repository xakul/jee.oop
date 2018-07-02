#### [English](#topic) / [Turkish](#konu)
# Topic

The purpose of this exercise is to understand the Chains of Responsibility pattern, and how we can use it in a scenario.
Each hoop of the chain contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain.

### UML Diagram of Builder Pattern

![|Solid](https://raw.githubusercontent.com/incubationhub/jee.oop/com.ihub.jee.oop/dp/behavioral/chainOfResponsibility/images/corUML.PNG)

## Prerequisites

*   Basic Java/OOP knowledge.

## Scenario

Imagine an ATM machine that needs to dispense an amount of money that will be in multiple of 10.
It contains 50$, 20$ and 10$ banknotes inside it.
How do we dispense the money, starting from 50$ to 10$, based on the amount?
We use Chain of Responsibility pattern, which is the OOP way of "if... else if... else etc".

## Explanation

First of all, we define a class that contains a common "Currency" variable that all the sub-classes will use.

Then, "DispenseChain" interface is defined containing two prototype functions.

##### DispenseChain.java
```
public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
}
```

After this, a series of "chains" are created, spesifically, 3 classes that dispense 50$, 20$ and 10$ banknotes, respectively.
These classes implement "DispenseChain" function, and also they include a "DispenseChain" instance, to connect other chains with this one.
This structure is made so that after we dispense 50$ on the machines, and if the amount of the remaining money is less than 50$, a new connected
chain will take the job and continue the execution.

##### Dollar50Dispenser.java
```
public class Dollar50Dispenser implements DispenseChain {
	private DispenseChain chain;

	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	public void dispense(Currency currency) {
		if (currency.getAmount() >= 50) {
			int number = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + number + " 50$ note");

			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		}
		else {
			this.chain.dispense(currency);
		}
	}
}
```

"Dollar20Dispenser" and "Dollar10Dispenser" classes contain the same structure.

"ATMDispenseChain" class, contains a "DispenseChain" instance, and connects the responsible classes to each other to create a "Chain of Responsibility".

##### ATMDispenseChain.java
```
public class ATMDispenseChain {
	
	DispenseChain chain1;

	public ATMDispenseChain() {
		this.chain1 = new Dollar50Dispenser();
		DispenseChain chain2 = new Dollar20Dispenser();
		DispenseChain chain3 = new Dollar10Dispenser();

		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
	}

}
```

Finally, we create the "Main" class and function, that instantiates the objects based on the scenario.
Notice that, the chain is initiated here, and the structure carries the rest.

##### Main.java
```
public class Main {

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();

        ...
        
		atmDispenser.chain1.dispense(new Currency(amount));
	}
	
}

```

## Links

* [Chain](https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm) - Chains of Responsibility Tutorial

---
---

# Konu

Bu alıştırmanın amacı Chain of Responsibility, yani Sorumluluk Zinciri desenini anlamak ve bir senaryo üzerinde nasıl kullandığımızı görmektir.
Zincirin her halkası, belirli bir mantıkta yazılmış bir kod bloğu içerir. Halkadan halkaya geçerken, bir obje üzerinde farklı operasyonlar yapılır.

## Önkoşullar

*   Temel Java ve Nesne-Yönelimli Programlama bilgisi.

## Senaryo

Bir ATM'nin para verme senaryosunu düşünelim. Para, ATM tarafından 10 ve katları olarak verilecek.
Makinada 10$, 20$ ve 50$'lık banknotlar var.
10'un katlarında bulunan herhangi bir para miktarını, bu makinadan nasıl bir düzenle çıkarmalıyız?
Sorumluluk Zinciri deseni, "if... else if... else..." yapısının OOP halidir.

## Açıklama

İlk olarak, "Currency" değişkenini kullanacak bir sınıflandırma tanımlıyoruz. Alt sınıflar da bu değişkeni kullanacak.
Sonra, iki tane prototip method bulunduran "DisperseChain" arayüzünü tanımlıyoruz.

##### DispenseChain.java
```
public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
}
```

Bundan sonra, bir seri "Zincir halkası" yaratılılır. Bu senaryo için 3 tane sınıflandırma tanımlanır: 50$, 20$ ve 10$ banknotlar için.
Bu sınıflandırmalar, "DispenseChain" arayüzünden beslenir ve aynı zamanda "DispenseChain" yapısını değişken olarak barındırır. Bunun sebebi, zincirin halkalarını bu yapı üzerinden bağlamaktır.
Bu yapı, eğer 50$ bir banknot verilirse ve kalan para 50$'dan azsa, iş, bağlanmış olan diğer zincir halkasına (20$) geçer ve o halka aynı işi yaparak akışı yönetir.

##### Dollar50Dispenser.java
```
public class Dollar50Dispenser implements DispenseChain {
	private DispenseChain chain;

	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;ban
	}

	public void dispense(Currency currency) {
		if (currency.getAmount() >= 50) {
			int number = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + number + " 50$ note");

			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		}
		else {
			this.chain.dispense(currency);
		}
	}
}
```

"Dollar20Dispenser" ve "Dollar10Dispenser" sınıflandırmaları, aynı yapıyı içeriyor.

"ATMDispenseChain" sınıflandırması, bir "DispenseChain" yaratımı içerir ve "Sorumluluk Zinciri"  oluşturmak için, sırayla sorumlu sınıflandırmaları birbirine bağlar.

##### ATMDispenseChain.java
```
public class ATMDispenseChain {
	
	DispenseChain chain1;

	public ATMDispenseChain() {
		this.chain1 = new Dollar50Dispenser();
		DispenseChain chain2 = new Dollar20Dispenser();
		DispenseChain chain3 = new Dollar10Dispenser();

		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
	}

}
```

Son olarak, "Main" sınıflandırması ve methodu oluşturuyoruz. Bu methodda sınıflandırmalarımızdan nesne tanımlıyoruz.
Burada zinciri tanımladıktan sonra, zaten yaratılmış olan yapı, geri kalan kontrol ve akışı yönetecektir.

##### Main.java
```
public class Main {

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();

        ...
        
		atmDispenser.chain1.dispense(new Currency(amount));
	}
	
}

```

## Linkler

* [Chain](https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm) - Sorumluluk Zinciri Tanımı/Örneği
