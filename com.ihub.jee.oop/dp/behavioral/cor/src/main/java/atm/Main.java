package atm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		
		int amount = 0;
		System.out.println("Enter amount to dispense");
		Scanner input = new Scanner(System.in);
		amount = input.nextInt();
		input.close();
		
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of 10s.");
			return;
		}
		
		// process the request
		atmDispenser.chain1.dispense(new Currency(amount));
	}
	
}