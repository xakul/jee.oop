package command;

import command.bank.BankAddCommand;
import command.bank.BankDeleteCommand;
import command.supplier.SupplierDisableCommand;
import command.supplier.SupplierEnableCommand;

public class Main {

	public static void main(String[] args) {
		/**
		 * Invoker class is created , all commands are added this instance.
		 * 
		 * Invoker sınıfımız yaratıldı, tüm komutlar bu sınıfa eklenecek.
		 */
		CommandManager commandManager = new CommandManager();
		
		/**
		 * Receiver classes are created for Banks.
		 * Both of them have add() and delete() methods,
		 * However both methods are called by CommandManager.
		 * 
		 * Receiver class ları Banka için yaratıldı, Bunların içindeki 
		 * add() ve delete() methodları commandManager instance'i ile 
		 * çağrılacak.
		 */
		ReceiverBank bankING = new ReceiverBank("ING Bank");
		ReceiverBank bankHSBC = new ReceiverBank("HSBC Bank");
		
		/**
		 * We prepare bank commands related to ReceiverBank(create instance), 
		 * but We don't yet execute.
		 * 
		 * Receiver Classındaki Banka işlemleri ile ilgili classlarının
		 * instancelarını alıyoruz ama daha işlem yapmadık.
		 */
		ICommand addBankCommand = new BankAddCommand(bankING);
		ICommand deleteBankCommand = new BankDeleteCommand(bankHSBC);
		
		/**
		 * Receiver classes are created for Suppliers.
		 * Both of them have enable() and disable() methods,
		 * However both methods are called by CommandManager.
		 * 
		 * Receiver class ları Supplier için yaratıldı, Bunların içindeki 
		 * enable() ve disable() methodları commandManager instance'i ile 
		 * çağrılacak.
		 */
		ReceiverSupplier supplierPG = new ReceiverSupplier(1, "P&G");
		ReceiverSupplier supplierUnilever = new ReceiverSupplier(2, "Unilever");
		
		/**
		 * We prepare supplier commands related to ReceiverBank(create instance), 
		 * but We don't yet execute.
		 * 
		 * Receiver Classındaki Supplier işlemleri ile ilgili classlarının
		 * instancelarını alıyoruz ama daha işlem yapmadık.
		 */
		ICommand enableSupplierCommand = new SupplierEnableCommand(supplierPG);
		ICommand disableSupplierCommand = new SupplierDisableCommand(supplierUnilever);
		
		/**
		 * All commands added to commandmanager.Different commands are gathering
		 * in order to execute only one line.
		 * 
		 * Bütün komutlar commandmanager'e ekleniyor ve farklı sınıfların farklı
		 * komutlarına tek satırda execute edebilmek için.
		 */		
		commandManager.CommandList.add(addBankCommand);
		commandManager.CommandList.add(deleteBankCommand);
		commandManager.CommandList.add(enableSupplierCommand);
		commandManager.CommandList.add(disableSupplierCommand);
		
		/**
		 * We have all commands and they can be executed.
		 * 
		 * Tüm komutlara sahibiz ve artık bu komutları classlara işlemler yaptırabiliriz.
		 */
		commandManager.ExecuteAll();
	}

}
