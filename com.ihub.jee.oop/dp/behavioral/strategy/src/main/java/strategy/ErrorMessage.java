package strategy;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ErrorMessage implements Informer {

	public void sendMessage(String toBeSent, Session session) throws MessagingException {
		/*
		 * Message is created and properties are set here.
		 * Mesaj burada yaratıldı ve özellikleri dolduruldu.
		 */
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("XXXX@gmail.com"));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ERROR_RESPONSIBLE@XXXX.com"));
		message.setSubject("ERROR");
		message.setText(toBeSent);

		/*
		 * Send message.
		 * Mesajı gönder.
		 */
		Transport.send(message);
	}

}
