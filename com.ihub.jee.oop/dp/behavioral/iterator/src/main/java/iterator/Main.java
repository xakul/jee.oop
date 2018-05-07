/**
 * Iterator Design Pattern 
 * This project introduces the implementation of
 * iterator pattern * Release version 1.0 at 7.05.2018
 * @author Ali Baran Ozden || @github xabozden
 */

package iterator;

public class Main {

	public static void main(String[] args) {

		/**
		 * Main class is able to do act on the list that the teams have with
		 * getting a iterator objects which are customized for teams via using
		 * next(), hasNext() methods. Also, the main class do not have to know
		 * listing type of classes.
		 * 
		 * Main sınıfı her takımdan bir iterator nesnesi edinerek, hasNext() ve
		 * next() metotları ile o takımın sahip olduğu liste üzerinde işlem
		 * yapabilir, bunun için listenin hangi tipte olması gerektiğini bilmek
		 * zorunda değildir.
		 */
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
