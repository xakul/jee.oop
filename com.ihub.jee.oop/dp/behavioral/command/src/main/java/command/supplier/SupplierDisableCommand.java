package command.supplier;

import command.ICommand;
import command.ReceiverSupplier;

public class SupplierDisableCommand implements ICommand {

	private ReceiverSupplier receiverSupplier;

	public SupplierDisableCommand(ReceiverSupplier receiverSupplier) {
		this.receiverSupplier = receiverSupplier;
	}

	public void Execute() {
		this.receiverSupplier.Disabled();
	}

}
