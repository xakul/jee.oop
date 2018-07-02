package interpreter;

public class CreateOperation extends DatabaseOperation {

	/**
	 * Abstract operation() method created to create different operations with using
	 * same method.
	 *
	 * Ayný metodu kullanarak birden fazla operation yaratmak için abstract
	 * operation() metodu oluþturuldu.
	 */
	public void operation(Context context) {
		if (context.getContext().equals("C")) {
			System.out.println("Create Operation");
		}
	}

}
