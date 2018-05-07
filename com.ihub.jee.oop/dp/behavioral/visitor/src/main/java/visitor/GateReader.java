package visitor;

public class GateReader extends Components {

	private String id;
	private String gateType;
	private String width;
	private String length;
	private String height;

	/**
	 * A constructor was created to create a gateReader according to a
	 * parameter.
	 * 
	 * Verilen parametrelere göre bir gateReader oluşması için constructor
	 * yaratıldı.
	 */
	public GateReader(String id, String gateType, String width, String length, String height) {
		this.setId(id);
		this.gateType = gateType;
		this.height = height;
		this.length = length;
		this.width = width;

	}

	/**
	 * overrides accept() method and has parameter in visit method which is
	 * GateReader object.
	 * 
	 * accept() metodu override edildi ve bu metot içinde yer alan visit metodu
	 * içinde parametre olarak GateReader objesine döner.
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

	public String getGateType() {
		return gateType;
	}

	public void setGateType(String gateType) {
		this.gateType = gateType;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
