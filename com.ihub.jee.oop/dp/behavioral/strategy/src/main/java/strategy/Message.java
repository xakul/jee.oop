package strategy;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class Message {
	private Informer informer;

	public Message(Informer informer) {
		this.informer = informer;
	}

	public void executeOperation(String toBeSent) throws MessagingException {
		
		/*
		 * Gmail'e giriş için Kullanıcı adı ve şifre bilgileri.
		 * Username and password for Gmail authentication.
		 */
		final String username = "XXXX@gmail.com";
		final String password = "XXXX";

		/*
		 * Bağlantı özellikleri(SMTP) tanımlanır.
		 * SMTP properties are set for connection.
		 */
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		/*
		 * Verilen bilgiler ve özelliklerle giriş sağlanır
		 * With the properties and info given, a session(login) is created.
		 */
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		
		/*
		 * Mesaj gönderme fonksiyonu çağırıldı.
		 * Message sender function is called.
		 */
		informer.sendMessage(toBeSent, session);
	}
}
