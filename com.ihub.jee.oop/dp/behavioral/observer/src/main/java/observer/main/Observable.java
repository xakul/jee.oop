package observer.main;

public interface Observable {
	
	void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}