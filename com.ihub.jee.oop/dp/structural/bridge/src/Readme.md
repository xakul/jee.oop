#### [English](#topic) / [Turkish](#konu)
# Topic

The purpose of the Bridge Pattern Tutorial, Structural Design Patterns, will explain in a Java project why and where it is used.

## Prequisites

*   Basic Java Knowledge.
*   Beginner level OOP knowledge.

## Scenario

We have production line for Bolt. We have two types of Form which are Hexagonal and Square, and also have two types of radius which are M8 and M10. 

## Explanation

We have the bridge between FormBolt and RadiusBolt interfaces and use of composition in implementing the bridge pattern.

We have a RadiusBolt interface which is acting as a bridge implementer and concrete classes M8, M10 implementing the RadiusBolt interface. 

FormBolt is an abstract class and will use object of RadiusBolt.

## Links

* [Bridge Pattern](https://www.journaldev.com/1491/bridge-design-pattern-java) - Bridge Pattern
