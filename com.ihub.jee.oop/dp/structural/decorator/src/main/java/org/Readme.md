#### [English](#topic) / [Turkish](#konu)
# Topic

The purpose of the Decorator Pattern Tutorial, Structural Design Patterns, will explain in a Java project why and where it is used.

## Prequisites

*   Basic Java Knowledge.
*   Beginner level OOP knowledge.

## Scenario

In this scenario, we have hotel room selection with additional room features. 


## Explanation

Component Interface – The interface or abstract class defining the methods that will be implemented. In our case Room will be the component interface.

Component Implementation – The basic implementation of the component interface. We can have StandardRoom class as our component implementation.

Decorator(RoomDecorator) – Decorator class implements the component interface and it has a HAS-A relationship with the component interface. The component variable should be accessible to the child decorator classes, so we will make this variable protected.

Concrete Decorators – Extending the base decorator functionality and modifying the component behavior accordingly. We can have concrete decorator classes as DeluxeRoom, KingRoom, RoomViewSeai RoomViewNature.

## Links

* [Decorator Pattern](https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm) - Decorator Pattern

---
---
