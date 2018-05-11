package builder.carBuilder;
/*Subclass MercedesASeries is created.
 * Altsinif MercedesASeries yaratildi.
 * 
 * CarAbstract class is extended and its methods are overrided.
 * Abstract class olan CarAbstract extend edilerek icindeki metotlar override edildi.
 * 
 * The car features belonging to the A series were filled with getter methods.
 * A serisine ait olan araba ozellikleri getter metotlari ile dolduruldu.
 */

public class MercedesASeries extends CarAbstract {

	@Override
	public String getColor() {
		return "Red Car";
	}

	@Override
	public String getModel() {
		return "A-180";
	}

	@Override
	public String getName() {
		return "Mercedes A Series";
	}

	@Override
	public String getType() {
		return "City Car";
	}

	@Override
	public double getPrice() {
		return 200000;
	}

}
