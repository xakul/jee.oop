package interpreter;

public class CreateOperation extends DatabaseOperation {

	/**
	 * operation() method is implemented and specified which contains Context as parameter.
	 * 
	 * Context tipinde parametre içeren operation() metodunu kullanıldı ve özelleştirildi.
	 */
	public void operation(Context context) {
		if (context.getContext().equals("C")) {
			System.out.println("Create Operation");
		}
	}

}
