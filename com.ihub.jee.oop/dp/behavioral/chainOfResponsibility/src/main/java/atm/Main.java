package atm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		
		/*
		 * Read the amount from the user.
		 * Değeri kullanıcıdan oku.
		 */
		System.out.println("Enter amount to dispense");
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.close();
		
		/*
		 * Amount should be in multiple of 10s.
		 * Değer, 10 ve katları olmalıdır.
		 */
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of 10s.");
			return;
		}
		
		/* 
		 * Start the chain.
		 * Zinciri başlat.
		 */
		atmDispenser.chain1.dispense(new Currency(amount));
	}
	
}