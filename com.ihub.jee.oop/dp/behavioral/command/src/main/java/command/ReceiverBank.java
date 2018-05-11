package command;

/**
 * This class are called Receiver Class from Command Design. There are no
 * relation with the other receiver classes. Only Bank commands are done.
 * 
 * Command Desing Pattern'da Receiver Classları olarak bilinir. Diğer Receiver
 * Class'ları ile bir ilişkisi yoktur, sadece Banka komutlarının işini yapandır.
 */
public class ReceiverBank {

	private String bankName;

	public ReceiverBank(String bankName) {
		this.bankName = bankName;
	}

	public void Add() {
		System.out.println("* " + this.bankName + "is added into system.");
	}

	public void Delete() {
		System.out.println("* " + this.bankName + "is deleted from sytem.");
	}
}
