package memento;

public class Memento {
	
	/*
	 * In this example, "State" is considered a string.
	 * Durum değişkeni, bu örnekte "String" tipinde.
	 */
	private String state;
	
	/*
	 * The value is received in constructor.
	 * Constructor'da "State" değişkeni doluyor.
	 */
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
}