package transactions;

import proxy.ICheck;

/**
 * In Proxy Pattern, CheckTransaction is Real Subject Class which is client
 * really must do it operations.Client can not access directly.All Client
 * transactions can do it succesfully by the real subject class.
 * 
 * CheckTransaction classi Proxy Pattern da Real Subject Class'a karşılık 
 * geliyor,Client erişemediği gibi client'in tüm işlemlerini de burası
 * yapıyor.
 * 
 */

public class CheckTransaction implements ICheck {
	
	private static CheckTransaction checkTransaction = null;
	/**
	 * the isValidCheck method checks whether the check is valid .
	 * Some controller checks that the client must not know.
	 * 
	 * Method çekin geçerli olup olmadığını kontrol eder.
	 * Müşterinin bilmediği bazı kontroller de burada yapılır.
	 * 
	 */
	private CheckTransaction() {
		
		
	}
	public synchronized static CheckTransaction getInstance() {
		if(checkTransaction == null) {
			checkTransaction = new CheckTransaction();
		}
		return checkTransaction;
	}
	public String isValidCheck(String username , String checkNumber) {
		
		if(checkNumber.startsWith("869")) {
			
			return "check is valid, please ask your agent for your money";
			
		}else {
			return "check no is not valid,please contact customer service";
		}
		
	}
}
