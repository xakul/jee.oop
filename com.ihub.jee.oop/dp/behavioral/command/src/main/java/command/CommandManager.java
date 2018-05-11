package command;

import java.util.ArrayList;

/**
 * Invoker Class has Command objects and executes method of Command Objects.
 * 
 * Invoker Class'i command nesnelerine sahiptir ve command nesnesindeki methodu
 * çalıştırır.
 */
public class CommandManager {
	
	/**
	 * All different receiver commands are kept with one query.
	 * 
	 * Bütün farklı receiver sınıflara ait commandler tek kuyrukta tutulur.
	 */
	public ArrayList<ICommand> CommandList;

	public CommandManager() {
		CommandList = new ArrayList<ICommand>();
	}

	/**
	 * All Command List executes one method so command.
	 * 
	 * Tüm Komut listesi tek methodla yani komutla çalışır.
	 */
	public void ExecuteAll() {
		int i = 0;
		while (CommandList.size() > i) {
			CommandList.get(i).Execute();
			i++;
		}
	}

	/**
	 * getter(),setter() methods.
	 * 
	 */
	public ArrayList<ICommand> getCommandList() {
		return CommandList;
	}

	public void setCommandList(ArrayList<ICommand> commandList) {
		CommandList = commandList;
	}
}