package visitor;

public class Shelf extends Components {

	private String shelfId;
	private String shelfType;
	private String width;
	private String length;
	private String height;

	/**
	 * A constructor was created to create a shelf according to a parameter.
	 * 
	 * Verilen parametrelere göre bir shelf oluşması için constructor
	 * oluşturuldu.
	 */
	public Shelf(String shelfId, String shelfType, String width, String length, String height) {
		this.shelfId = shelfId;
		this.shelfType = shelfType;
		this.height = height;
		this.width = width;
		this.length = length;

	}

	/**
	 * overrides accept() method and has parameter in visit method which is
	 * Shelf object.
	 * 
	 * accept() metodu override edildi ve bu metot içinde yer alan visit metodu
	 * içinde parametre olarak Shelf objesine döner.
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getShelfId() {
		return shelfId;
	}

	public void setShelfId(String shelfId) {
		this.shelfId = shelfId;
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

	public String getShelfType() {
		return shelfType;
	}

	public void setShelfType(String shelfType) {
		this.shelfType = shelfType;
	}

}
