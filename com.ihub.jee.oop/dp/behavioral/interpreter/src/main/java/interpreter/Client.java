package interpreter;

import java.util.Scanner;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		DatabaseOperation databaseOperation;
		Context context = new Context();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Database Operation: ");
		context.setContext(sc.nextLine());

		/**
		 * Here we provide character-based interpretation of the types of operations the
		 * user has entered, thus ensuring that the desired output is obtained. The
		 * polymorphism method that we use calls the operation method belonging to the
		 * data type entered.
		 * 
		 * Burada kullan�c�n�n girdi�i Operasyon tiplerini karakter baz�nda yorumlayarak
		 * istenilen ��kt�n�n al�nmas�n� sa�l�yoruz. Kulland���m�z polymorphizm y�ntemi
		 * ile girilen veri tipine ait olan operasyon metodu �a�r�l�yor.
		 */
		if (context.getContext().equals("C")) {
			databaseOperation = new CreateOperation();
			databaseOperation.operation(context);
		} else if (context.getContext().equals("R")) {
			databaseOperation = new ReadOperation();
			databaseOperation.operation(context);
		} else if (context.getContext().equals("U")) {
			databaseOperation = new UpdateOperation();
			databaseOperation.operation(context);
		} else if (context.getContext().equals("D")) {
			databaseOperation = new DeleteOperation();
			databaseOperation.operation(context);
		}
	}
}
