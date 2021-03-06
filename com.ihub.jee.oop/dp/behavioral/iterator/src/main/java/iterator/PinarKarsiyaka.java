package iterator;

public class PinarKarsiyaka implements Team {

	private Player[] team;

	/**
	 * Pinarkarsiyaka class list their player with array.
	 * 
	 * Pinarkarsiyaka sınıfını incelediğimiz zaman, oyuncuların bir Array içinde
	 * tutulduğunu görmekteyiz.
	 */
	public PinarKarsiyaka() {

		/**
		 * Pınarakarsiyaka class list their player with array.
		 *
		 * Pınarakarsiyaka sınıfını incelediğimiz zaman, oyuncuların bir Array
		 * içinde tutulduğunu görmekteyiz.
		 */
		team = new Player[5];
		team[0] = new Player("Scott", 4);
		team[1] = new Player("Alp", 6);
		team[2] = new Player("Dominic", 7);
		team[3] = new Player("Marco", 12);
		team[4] = new Player("Akif", 15);

	}

	public Player[] getTeam() {
		return team;
	}

	public void setTeam(Player[] team) {
		this.team = team;
	}

	public Iterator getIterator() {

		return new ArrayIterator(getTeam());
	}

}
