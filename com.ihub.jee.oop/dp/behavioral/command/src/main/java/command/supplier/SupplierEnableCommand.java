package command.supplier;

import command.ICommand;
import command.ReceiverSupplier;

public class SupplierEnableCommand implements ICommand {

	private ReceiverSupplier receiverSupplier;

	public SupplierEnableCommand(ReceiverSupplier receiverSupplier) {
		this.receiverSupplier = receiverSupplier;
	}

	public void Execute() {
		this.receiverSupplier.Enable();
	}

}
