package iterator;

public interface Iterator {

	/**
	 * hasNext() metodu ile bir takımın sahip olduğu listenin bir sonraki
	 * pozisyonunda oyuncu olup, olmadığı tespit edilir. Eğer liste sonuna
	 * gelinmişse false değeri geri verilerek, listede oyuncu kalmadığı sinyali
	 * verilir. next() metodu ile listenin bir sonraki elementi edinilir.
	 * 
	 * With hasNext() method we are know is there any player in next position.İf
	 * we are in last element the method return as false and we understand there
	 * is no more player. next() method is using for geting next ellement of
	 * list.
	 */

	boolean hasNext();

	Object next();
}
