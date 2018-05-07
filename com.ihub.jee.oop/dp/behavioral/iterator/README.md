#### [English](#topic) / [Turkish](#konu)

# Topic

Iterator pattern,This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.

### UML DIAGRAM OF TAMPLATE PATTERN

![|Solid](https://raw.githubusercontent.com/incubationhub/jee.oop/master/com.ihub.jee.oop/dp/behavioral/iterator/images/iterator.PNG)

## Prequisites

Basic java programming knowledge

Basic OOP knowledge


## Scenario

In this scenario,we have discussed two teams that in the turkish basketball league .These teams list players and technical team in two different ways.Our purpose is to hide the list structure used by the teams and to allow the client to perform operations on the different types of lists via the defined interface methods.Evne if, teams use any type of list, they will be able to be processed by user classes using Iterator interface methods, as long as they have an appropriate iterator object.This makes the user independent of the list of classes the teams use.




## Explanation
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
The Java standard library abstraction that makes it possible to decouple collection classes and algorithms.
Promote to "full object status" the traversal of a collection.
Polymorphic traversal.

### Iterator.java

public interface Iterator {
	boolean hasNext();
	Object next();
}

### AraylistIterator.java
public class ArrayListIterator implements Iterator {

	private ArrayList<Player> team;
	private int position;

	public ArrayListIterator(ArrayList<Player> team2) {

		setTeam(team2);
	}

	public boolean hasNext() {

		if (position >= getTeam().size() || getTeam().get(position) == null) {
			return false;

		}

		else
			return true;
	}

	public Object next() {

		Player player = getTeam().get(position);
		position++;
		return player;

	}

	public ArrayList<Player> getTeam() {
		return team;
	}

	public void setTeam(ArrayList<Player> team) {
		this.team = team;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}


}


### ArrayIterator.java


public class ArrayIterator implements Iterator {

	private Player[] team;
	private int position;

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public ArrayIterator(Player[] team) {
		setTeam(team);
	}

	public boolean hasNext() {
		if (position >= getTeam().length || getTeam()[position] == null)
			return false;
		else
			return true;

	}

	public Object next() {
		Player player = getTeam()[position];
		position++;

		return player;
	}

	public Player[] getTeam() {
		return team;
	}

	public void setTeam(Player[] team) {
		this.team = team;
	}

}
### Team.java


public interface Team {
	
	public Iterator getIterator();
	

}

### Player.java


public class Player {

	private String name;
	private int number;



## Summary

Template method pattern is a behavioral design pattern that defines the program skeleton of an algorithm in an operation, deferring some steps to subclasses. It lets one redefine certain steps of an algorithm without changing the algorithm's structure.The template method is one of the twenty-three well-known patterns described in the "Gang of Four" book Design Patterns.
## Links

* [javaturk](http://www.javaturk.org/tasarim-kaliplari-factory-method-uretici-metot-i/) - Design Patterns tutorial(tr)
* [Tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) - Design Patterns tutorial(en)


# Konu
İterator design

## Önkoşullar
Temel programlama bilgisi.

Başlangıç seviyesinde OOP bilgisi.

## Senaryo
Bu senaryoda türkiye basketbol liginde mücade eden iki takımı ele aldık.Bu takımlar,oyuncu ve teknik ekip listelerini iki farklı şekilde listelemektedir.Iterator tasarım şablonunu kullanarak Client sınıfının yapısını çok daha basit bir hale getirebiliriz. Amacımız takımlar tarafından kullanılan liste yapısını gizlemek ve clienta tanımlanmış interface metotları üzerinden değişik tipteki listeler üzerinde işlem yapmalarını sağlamaktır. Takımlar ne tip bir liste kullanırlarsa kullansınlar, kendilerine uygun bir iterator nesnesine sahip oldukları sürece, kullanıcı sınıflar tarafından oyuncu listeleri, Iterator interface metotları kullanılarak işlenebilir hale gelecektir. Böylece kullanıcı sınıf takımların kullandıkları listelerden bağımsız bir hale gelir.
## Açıklama

Template tasarım deseninde bir operasyonu gerçekleştirmek için gerekli olan adımlar ve bu adımları çalıştıracak metotlar abstract bir sınıfta tanımlanır. Bu abstract sınıfı uygulayan gerçek sınıflar gerekli adımları overwrite eder ve abstract sınıfında bu adımları kullanan metotlar çağrılarak işlem gerçekleştirilir. Böylece kod tekrarı yapılmasının önüne geçilmiş olunur.

## Özet

Template tasarım deseni; behavioral grubuna ait bir algoritmanın adımlarının abstract sınıfta tanımlanarak farklı adımların concrete sınıflarında overwrite edilip çalıştırılmasını düzenler.
