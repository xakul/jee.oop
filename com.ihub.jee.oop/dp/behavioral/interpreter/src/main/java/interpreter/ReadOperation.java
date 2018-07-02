package interpreter;

public class ReadOperation extends DatabaseOperation {

	/**
	 * operation() method is implemented and specified which contains Context as
	 * parameter.
	 * 
	 * Context tipinde parametre içeren operation() metodunu kullanýldý ve
	 * özelleþtirildi.
	 */
	public void operation(Context context) {
		if (context.getContext().equals("R")) {
			System.out.println("Read Operation");
		}
	}

}
