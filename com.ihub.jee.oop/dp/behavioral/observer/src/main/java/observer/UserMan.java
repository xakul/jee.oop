package observer;

public class UserMan implements Observer {

    private Observable observable;
    /**
     * Mesajın basıldığı yer.
     */
    /**
     * Printing the message.
     */
    public void notify(String message) {
        System.out.println(message + " UserMan received notification.");
    }
    
    public void removeObserver(){
        observable.removeObserver(this);
    }

}
