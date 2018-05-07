package iterator;

import java.util.ArrayList;

public class EfesPilsen implements Team {

	private ArrayList<Player> team;

	public EfesPilsen() {

		team = new ArrayList<Player>();
		team.add(new Player("Drew", 4));
		team.add(new Player("Ender", 6));
		team.add(new Player("Cenk", 7));
		team.add(new Player("Kerem", 12));
		team.add(new Player("Loren", 15));

	}

	public ArrayList<Player> getTeam() {
		return team;
	}

	public void setTeam(ArrayList<Player> team) {
		this.team = team;
	}

	public Iterator getIterator() {

		return new ArrayListIterator(getTeam());

	}
}
