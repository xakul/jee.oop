package abstractFactory;

/*
 * these class choose that which class going to created.
 * bu class alınan değere göre hangi classın çağırılcağına karar verir.
 * 
 * */
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
