package builder;

/**
 * Subclass MercedesASeries is created.
 * Alts�n�f MercedesASeries yarat�ld�.
 * 
 * CarAbstract class is extended and its methods are overrided.
 * Abstract class olan CarAbstract extend edilerek i�indeki metotlar override edildi.
 * 
 * The car features belonging to the A series were filled with getter methods.
 * A serisine ait olan araba �zellikleri getter metotlar� ile dolduruldu.
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
