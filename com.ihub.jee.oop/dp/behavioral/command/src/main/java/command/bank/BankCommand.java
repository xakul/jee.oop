package command.bank;

import command.ICommand;
import command.ReceiverBank;

public abstract class BankCommand implements ICommand {

	protected ReceiverBank receiverBank;
	
	public BankCommand(ReceiverBank receiverBank) {
		this.receiverBank = receiverBank;
	}
	
	public abstract void Execute();
	
}
