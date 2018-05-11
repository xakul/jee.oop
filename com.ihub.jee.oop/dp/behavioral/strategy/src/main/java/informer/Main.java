package informer;

import javax.mail.MessagingException;

public class Main {
	public static void main(String[] args) throws MessagingException {
		Message message = new Message(new AcceptedMessage());
		message.executeOperation("Your offer is ACCEPTED by the buyer party.");
		
		message = new Message(new RejectedMessage());
		message.executeOperation("Your offer is REJECTED by the buyer party. Reason: XXXX");
		
		message = new Message(new ErrorMessage());
		message.executeOperation("Error Code: XXXX. The system has failed.");
	}
}
