package interpreter;

public class DeleteOperation extends DatabaseOperation {

	/**
	 * operation() method is implemented and specified which contains Context as
	 * parameter.
	 * 
	 * Context tipinde parametre i�eren operation() metodunu kullan�ld� ve
	 * �zelle�tirildi.
	 */
	public void operation(Context context) {
		if (context.getContext().equals("D")) {
			System.out.println("Delete Operation");
		}

	}

}
