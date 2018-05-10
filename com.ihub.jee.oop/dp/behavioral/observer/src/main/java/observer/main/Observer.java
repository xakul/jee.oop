package observer.main;

public interface Observer {
	/**
	 * Duyurular bu interface üzerinden sağlanacak.
	 */
	/**
	 * Notifications will run from here.
	 */
    void notify(String message);
}
