package abstractFactory;

/**
 * These class choose that which class going to created.
 * 
 * Bu class değerlere göre hangi sınıfın çalışacağına karar verir.
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("PIPE")) {
			return new PipeFactory();

		} else if (choice.equalsIgnoreCase("PALLET")) {

			return new PalletFactory();

		}

		return null;
	}

}
