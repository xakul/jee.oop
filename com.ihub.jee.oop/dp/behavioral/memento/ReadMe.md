#### [English](#topic) / [Turkish](#konu)
# Topic

The purpose of this exercise is to understand the Memento pattern, and how we can use it in a scenario.
Memento pattern allows the past assignments or instances of an object to be stored.

## Prerequisites

*   Basic Java/OOP knowledge.
*	Maven structure basics.

## Scenario

In the RIM scenario. We are going to keep the previous forklift states as Memento objects.

## Explanation

First of all, we will create the Memento class, that will hold the state of the object as a String.

Then, we create the "Forklift" class, which has the state variable inside.
With the "saveStateToMemento" function, we can save the current state of the object to the Memento.

##### Originator.java
```
public class Originator {
	
	private String state;

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento saveStateToMemento() {
		return new Memento(state);
	}
	
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
    
}
```
"CareTaker" class is created, which contains the list that holds the Mementos for the object. 

##### CareTaker.java
```
public class CareTaker {
	
	/*
	 * A list that holds the past states as Memento objects are created.
	 * Geçmiş durumları(state) tutan bir Memento listesi yaratılır.
	 */
	private List<Memento> mementoList = new ArrayList<Memento>();

	/*
	 * Adds a past state as Memento object to the list.
	 * Listeye, bir durumu(state), Memento objesi olarak ekler.
	 */
	public void add(Memento state) {
		mementoList.add(state);
	}
	
	/*
	 * Similarly, this function gets the desired value by the index.
	 * Benzer şekilde, bu fonksiyon listedeki sırasına göre durumu döner.
	 */
	public Memento get(int index) {
		return mementoList.get(index);
	}
	
}
```

Finally, we create the "Main" class and function, in which we create a Forklift object.
We save the desired states of the forklift using the Memento pattern structure.

##### Main.java
```
public class Main {
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("Forklift is busy.");
		originator.setState("Forklift is free.");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("Forklift cannot be used.");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("Forklift is free.");
		System.out.println("Current State: " + originator.getState());

		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());
	}
	
}
```

## Links

* [Memento](https://www.tutorialspoint.com/design_pattern/memento_pattern.htm) - Memento Pattern Tutorial

---
---