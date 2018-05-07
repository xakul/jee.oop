/**
   * Abstract Factory Design Pattern 
   * This project introduces the implementation of abstract factory pattern 
   * * Release version 1.0 at 30.04.2018
   * @author Ali Baran Ozden || @github xabozden
*/
package abstractFactory;

/**
 * Use the FactoryProducer to get AbstractFactory in order to get factories of
 * concrete classes by passing an information such as type FactoryProducer
 * kullanarak abstracFactoryden shape ve ya type factorysi olu�turur.
 */

public class Main {

	public static void main(String[] args) {

		/**
		 * Get pipe factory.Pipe factory olu�tur.
		 *
		 */
		AbstractFactory pipeFactory = FactoryProducer.getFactory("PIPE");

		/**
		 * Get an object of PipeShape silicone.
		 * 
		 * // * PipeShape class�ndan silicon pipe �ret.
		 */

		PipeShape pipe1 = pipeFactory.getShape("SILICONE");

		/**
		 * Call palletShape method of Shape 3D.
		 * 
		 * SiliconePipe class�ndan palletType methodunu ca��r.
		 * 
		 */

		pipe1.pipeType();

		/**
		 * Get Pallet factory. Pallet factory olu�tur.
		 */
		AbstractFactory palletFactory = FactoryProducer.getFactory("PALLET");

		/**
		 * Get an object of Pallettype Steal.
		 * 
		 * PalletType s�n�f�nfan steal objesi yarat.
		 */
		PalletType pallet = palletFactory.getType("steal");
		/**
		 * Call palletType method of type steal.
		 * 
		 * Steal class�ndan palletType methodunu ca��r.
		 * 
		 */

		pallet.palletType();

	}

}
