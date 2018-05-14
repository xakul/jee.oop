#### [English](#topic) / [Turkish](#konu)
# Topic

The purpose of this exercise is to understand the Chains of Responsibility pattern, and how we can use it in a scenario.
Each chain contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain.

## Prerequisites

*   Basic Java/OOP knowledge.
*	Maven structure basics.

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