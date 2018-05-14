package memento;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * An originator, the class that creates the Mementos,
		 * and a caretaker, that stores the Mementos, are created.
		 * 
		 * Bir tane "Originator", Memento objelerinin ve durumların yaratıldığı fonksiyon,
		 * bir de "CareTaker", Memento'ların muhafaza edildiği obje yaratılır.
		 */
		Forklift forklift = new Forklift();
		CareTaker careTaker = new CareTaker();

		/*
		 * This state is not saved. Because "saveStateToMemento" is not called.
		 * Bu durum kaydedilmedi. Çünkü "saveStateToMemento" çağırılmadı.
		 */
		forklift.setState("Forklift is busy.");
		
		forklift.setState("Forklift is free.");
		careTaker.add(forklift.saveStateToMemento());

		forklift.setState("Forklift cannot be used.");
		careTaker.add(forklift.saveStateToMemento());

		forklift.setState("Forklift is free.");
		System.out.println("Current State: " + forklift.getState());

		forklift.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + forklift.getState());
		forklift.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + forklift.getState());
	}
	
}