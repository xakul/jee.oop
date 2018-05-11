package observer.main;

public class UserWoman implements Observer {

    private Observable observable;

    public void setObservable(Observable observable) {
        this.observable = observable;
    }
    /**
     * Mesajın basıldığı yer.
     */
    /**
     * Printing the message.
     */
    public void notify(String message) {
        System.out.println(message + " UserWoman received notification.");
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }

}