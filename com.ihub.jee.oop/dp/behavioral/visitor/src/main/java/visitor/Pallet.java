package visitor;

public class Pallet extends Components {

	private String tagId;
	private String shape;
	private String type;

	/**
	 * A constructor was created to create a pallet according to a parameter.
	 * 
	 * Verilen parametrelere göre bir pallet oluşması için constructor
	 * oluşturuldu.
	 */
	public Pallet(String tagId, String shape, String type) {
		this.shape = shape;
		this.tagId = tagId;
		this.type = type;

	}

	/**
	 * overrides accept() method and has parameter in visit method which is
	 * Pallet object.
	 * 
	 * accept() metodu override edildi ve bu metot içinde yer alan visit metodu
	 * içinde parametre olarak Pallet objesine döner.
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
