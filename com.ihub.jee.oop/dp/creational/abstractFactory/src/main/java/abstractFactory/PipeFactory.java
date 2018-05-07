package abstractFactory;

/**
 * Create Factory classes extending AbstractFactory to generate object of
 * concrete class based on given information.
 * 
 * AbstracFactoryden extend edilen bir class oluştur Bu class hangi tip pipe
 * oluşturulacağına karar verir.
 */
public class PipeFactory extends AbstractFactory {

	@Override
	PipeShape getShape(String shape) {

		if (shape.equalsIgnoreCase("PLASTIC")) {
			return new PlasticPipe();
		}

		else if (shape.equalsIgnoreCase("SILICONE")) {

			return new SiliconePipe();
		}
		return null;
	}

	@Override
	PalletType getType(String type) {
		return null;
	}

}
