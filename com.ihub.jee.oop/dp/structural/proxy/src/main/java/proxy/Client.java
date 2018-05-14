package proxy;
/**
 * Singleton Design Pattern
 * Singleton Design Pattern Scenario with Bank Check System. 
 * Release version 1.0 at 14.05.2018
 * @author Bayram Hakan Kocatepe || @github xhkocatepe 
*/
public class Client {

	public static void main(String[] args) {
		String resultFromBank ;
		/**
		 * We can reach Proxy Class in order to check transactions.
		 * Thanks to Proxy Class we reach Check Transaction class then
		 * we will see check is valid or not :)
		 * 
		 * Proxy yani Vekil sınıfımıza erişim sağlayıp ve onun üzerinden
		 * CheckTransaction sınıfımızla çekin geçerliliğini sorgulayacağız.
		 */
		ICheck iCheck = new ProxyCheck();
		
		resultFromBank = iCheck.isValidCheck("admin", "86912342342");
		System.out.println(resultFromBank);
		resultFromBank = iCheck.isValidCheck("hakankocatepe", "86912342342");
		System.out.println(resultFromBank);

	}

}
