package interpreter;

public class CreateOperation extends DatabaseOperation {

	/**
	 * Abstract operation() method created to create different operations with using
	 * same method.
	 *
	 * Ayn� metodu kullanarak birden fazla operation yaratmak i�in abstract
	 * operation() metodu olu�turuldu.
	 */
	public void operation(Context context) {
		if (context.getContext().equals("C")) {
			System.out.println("Create Operation");
		}
	}

}
