package iterator;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {

	private ArrayList<Player> team;
	private int position;

	/**
	 * hasNext() ve next() metotlarını ArrayList tipi bir listede işlem
	 * yapabilecek şekilde implemente etmiştir.
	 * 
	 * hasNext() and next() implemented as can handle a list with type arraylist.
	 * 
	 */

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