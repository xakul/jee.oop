package command.bank;

import command.ICommand;
import command.ReceiverBank;

public class BankDeleteCommand implements ICommand {
	
	private ReceiverBank receiverBank ;
	
	public BankDeleteCommand(ReceiverBank receiverBank) {
		this.receiverBank = receiverBank;
	}

	public void Execute() {
		receiverBank.Delete();
	}

}
