package interpreter;

public abstract class DatabaseOperation {

	/**
	 * Abstract operation() method created to create different operations with using
	 * same method.
	 *
	 * Ayný metodu kullanarak birden fazla operation yaratmak için abstract
	 * operation() metodu oluþturuldu.
	 */
	public abstract void operation(Context context);
}
