package interpreter;

public class DeleteOperation extends DatabaseOperation {

	/**
	 * operation() method is implemented and specified which contains Context as parameter.
	 * 
	 * Context tipinde parametre içeren operation() metodunu kullanıldı ve özelleştirildi.
	 */
	public void operation(Context context) {
		if (context.getContext().equals("D")) {
			System.out.println("Delete Operation");
		}

	}

}
