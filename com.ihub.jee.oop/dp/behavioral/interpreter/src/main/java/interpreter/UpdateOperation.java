package interpreter;

public class UpdateOperation extends DatabaseOperation {

	/**
	 * operation() method is implemented and specified which contains Context as parameter.
	 * 
	 * Context tipinde parametre içeren operation() metodunu kullanıldı ve özelleştirildi.
	 */
	@Override
	public void operation(Context context) {
		if(context.getContext().equals("U")){
			System.out.println("Update Operation");
		}
	}

}
