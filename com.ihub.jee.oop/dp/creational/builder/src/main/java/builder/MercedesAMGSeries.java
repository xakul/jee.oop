package builder;

/**
 * Subclass MercedesAMGSeries is created.
 * Altsınıf MercedesAMGSeries yaratıldı.
 * 
 * CarAbstract class is extended and its methods are overrided.
 * Abstract class olan CarAbstract extend edilerek i�indeki metotlar override edildi.
 * 
 * CarAbstract class is extended and its methods are overrided.
 * Abstract class olan CarAbstract extend edilerek içindeki metotlar override edildi.
 * 
 * The car features belonging to the AMG series were filled with getter methods.
 * AMG serisine ait olan araba özellikleri getter metotlari ile dolduruldu.
*/
public class MercedesAMGSeries extends CarAbstract {

	@Override
	public String getColor() {
		return "Metallic Black";
	}

	@Override
	public String getName() {
		return "Mercedes AMG Series";
	}

	@Override
	public String getModel() {
		return "AMG-GTX";
	}

	@Override
	public String getType() {
		return "Sport Car";
	}

	@Override
	public double getPrice() {
		return 800000;
	}

}
