package builder;

/**
 * In the CarAbstract class we have identified the methods you will use in the subclasses. 
 * CarAbstract sınıfı içinde altsınıflarda kullanacağımız metotları belirledik.
 * 
 * The methods in the CarProperties interface were implemented. 
 * CarProperties interface içinde yer alan metotlar implement edildi.
 * 
 * Class property definitions were made and getter setter methods were generated.
 * Sınıfa ait attribute tanımları yapıldı ve getter, setter metotları oluşturuldu.
 */
public abstract class CarAbstract implements CarProperties {

	private String name;
	private String model;
	private String color;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract double getPrice();

}
