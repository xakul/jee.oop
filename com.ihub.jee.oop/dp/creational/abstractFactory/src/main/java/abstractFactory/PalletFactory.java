package abstractFactory;

/**
 * Create Factory classes extending AbstractFactory to generate object of
 * concrete class based on given information.
 * 
 * AbstracFactoryden extend edilen bir PalletFactory class� olu�tur.
 * 
 */

public class PalletFactory extends AbstractFactory {

	/**
	 * create a new steal or wooden object via getting instance.
	 * 
	 * Bir instance alarak(wooden veya steal) hangi s�n�ftan yarat�laca��na
	 * karar verir.
	 * 
	 **/
	@Override
	PalletType getType(String type) {
		if (type.equalsIgnoreCase("STEAL")) {
			return new Steal();

		}

		else if (type.equalsIgnoreCase("WOODEN")) {
			return new Wooden();

		}
		return null;
	}

	@Override
	PipeShape getShape(String shape) {

		return null;
	}

}
