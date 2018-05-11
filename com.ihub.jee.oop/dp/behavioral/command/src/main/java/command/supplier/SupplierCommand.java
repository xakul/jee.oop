package command.supplier;

import command.ICommand;
import command.ReceiverSupplier;
public abstract class SupplierCommand implements ICommand {
	
	protected ReceiverSupplier receiverSupplier;
	
	public SupplierCommand(ReceiverSupplier receiverSupplier) {
		this.receiverSupplier = receiverSupplier;
	}
	
	public abstract void Execute();
	
}
