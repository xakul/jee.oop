package memento;

import java.util.ArrayList;
import java.util.List;

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