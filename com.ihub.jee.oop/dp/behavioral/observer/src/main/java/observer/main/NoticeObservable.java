package observer.main;

import java.util.ArrayList;
import java.util.List;

public class NoticeObservable implements Observable {

    private List<Observer> observerList = new ArrayList<Observer>();
    private String message = "Notice... !";
    
    /**
     *  Kullanıcıları duyuruya eklemek için kullandığımız method.
     */
    /**
     * Adding users to notice list.
     */
    public void addObserver(Observer observer) {
        observerList.add(observer); 
    }
    /**
     *  Kullanıcıları duyurudan kaldırmak için kullandığımız method.
     */
    /**
     * Remove users from notice list.
     */
    public void removeObserver(Observer observer) {
        observerList.remove(observer); 
    }
    /**
     * Duyuruya kayıtlı kullanıcılara mesaj göndermek için kullandığımız method.
     */
    /**
     * Sending notification to all notice list members.
     */
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.notify(message);  
        }
    }

}