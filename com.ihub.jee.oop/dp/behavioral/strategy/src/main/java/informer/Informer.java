package informer;

import javax.mail.MessagingException;
import javax.mail.Session;

public interface Informer {
	public void sendMessage(String toBeSent, Session session) throws MessagingException;
}