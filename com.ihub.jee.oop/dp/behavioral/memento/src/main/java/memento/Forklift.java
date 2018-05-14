package memento;

public class Forklift {
	
	/*
	 * State tutulur.
	 */
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
	/*
	 * When this function is called, a state is saved as variable in Memento object.
	 * Bu fonksiyon çağırıldığında, Memento objesinde "State" değişkeni tutulur.
	 */
	public Memento saveStateToMemento() {
		return new Memento(state);
	}
	
	/*
	 * The state is received from Memento instance.
	 * Yaratılan Memento objesinden state devralınır.
	 */
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
	
}