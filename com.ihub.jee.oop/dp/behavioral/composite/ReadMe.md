#### [English](#topic) / [Turkish](#konu)
# Topic

The purpose of this exercise is to understand the Composite pattern, and how we can use it in a scenario.
Composite pattern is used where we need to treat a group of objects in similar way as a single object.

## Prerequisites

*   Basic Java/OOP knowledge.
*	Maven structure basics.

## Scenario

Imagine that we need an organization schema of a Startup company, and we want to hold this information as a single class structure.
We will create an Employee class, and put all the subordinates inside each Employee, if any, to create a tree-like structure.

## Explanation

First of all, we will create the Employee class, that will hold the Employee properties and also,
a list that holds all the subordinates of the initialized Employee.

##### Employee.java
```
public class Employee {
	
	private String name;
	private String department;
	private int salary;
	
	private List<Employee> subordinates;

	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public void add(Employee employee) {
		subordinates.add(employee);
	}
	
	public void remove(Employee employee) {
		subordinates.remove(employee);
	}
    
    ...
    
}
```

Then, we create the "Main" class and function, in which we create the Employee objects, as an organization scheme.
We add the subordinates of the given Employees, to their corresponding lists.

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

* [Composite](https://www.tutorialspoint.com/design_pattern/composite_pattern.htm) - Composite Pattern Tutorial

---
---