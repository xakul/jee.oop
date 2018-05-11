package command.bank;

import command.ICommand;
import command.ReceiverBank;

public class BankAddCommand implements ICommand {
	
	private ReceiverBank receiverBank;

	public BankAddCommand (ReceiverBank receiverBank) {
		this.receiverBank = receiverBank;
	}
	
	public void Execute() {
		this.receiverBank.Add();
	}

}
