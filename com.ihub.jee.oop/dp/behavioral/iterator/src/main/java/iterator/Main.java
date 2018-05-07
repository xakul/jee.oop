package iterator;

public class Main {

	public static void main(String[] args) {

		EfesPilsen efesPilsen = new EfesPilsen();

		Iterator it = efesPilsen.getIterator();

		while (it.hasNext()) {
			Player player = (Player) it.next();
			System.out.println(player.getName());

		}

		PinarKarsiyaka pinarKarsiyaka = new PinarKarsiyaka();

		it = pinarKarsiyaka.getIterator();
		while (it.hasNext()) {

			Player player = (Player) it.next();
			System.out.println(player.getName());
		}

	}

}
