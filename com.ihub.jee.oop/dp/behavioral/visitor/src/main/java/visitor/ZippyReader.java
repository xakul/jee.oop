package visitor;

public class ZippyReader extends Components {

	private String id;
	private String zippyType;
	private String model;
	
	/**
	 * A constructor was created to create a zippyReader according to a
	 * parameter.
	 * 
	 * Verilen parametrelere göre bir zippyReader oluşması için constructor
	 * oluşturuldu.
	 */
	public ZippyReader(String id, String zippyType, String model) {
		this.id = id;
		this.zippyType = zippyType;
		this.model = model;
		
	}
	
	/**
	 * overrides accept() method and has parameter in visit method which is
	 * ZippyReader object.
	 * 
	 * accept() metodu override edildi ve bu metot içinde yer alan visit metodu
	 * içinde parametre olarak ZippyReader objesine döner.
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getZippyType() {
		return zippyType;
	}

	public void setZippyType(String zippyType) {
		this.zippyType = zippyType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
