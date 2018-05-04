/**
 * Visitor Pattern 
 * This project introduces the implementation of visitor pattern 
 * Release version 1.0 at 02.05.2018
 * @author Gokhan Guler || @github xgguler
 */

package visitor;

public class Main {

	public static void main(String[] args) {

		/**
		 * Defined abstract visitors using polymorphism consept of object
		 * oriented programming.
		 * 
		 * Nesne tabanlı programlama mantığı olan polymorphizm kullanarak
		 * abstarct visitorlar tanımlandı.
		 */
		Visitor visitor = new GoodsMovementReport();
		Visitor visitor2 = new ShelfMovementReport();
		Visitor visitor3 = new CarrierMovementReport();

		System.out.println("GoodsMovement Report !!!");

		/**
		 * The reports are printed by using write() method.
		 * 
		 * Raporlar write() metodunu kullanarak yazdırıldı.
		 * 
		 */
		write(visitor);
		System.out.println();

		System.out.println("ShelfMovement Report !!!");
		write(visitor2);
		System.out.println();

		System.out.println("CarrierMovement Report !!!");
		write(visitor3);
		System.out.println();

	}

	/**
	 * write() method is created for print reports and this method has parameter
	 * in type of Visitor
	 * 
	 * write() metadu raporları yazdırmak için yaratıldı ve bu metot Visitor
	 * tipinde bir parametreye sahip
	 */
	public static void write(Visitor visitor) {

		/**
		 * Component instances are created.
		 * 
		 * Component instanceları oluşturuldu.
		 */
		Pallet pallet = new Pallet("P0001", "Two Dimension", "Metal");
		Shelf shelf = new Shelf("S1000", "Heavy Tonnage", "100", "100", "200");
		ZippyReader zippyReader = new ZippyReader("01", "Forklift", "BMC");
		GateReader gateReader = new GateReader("G100", "Door", "400", "600", "600");

		/**
		 * We are giving the visitor parameter by using accept() method to our
		 * component classes than we are deriving reports thanks to Visitor.
		 * 
		 * Visitor parametresini, component sınıflarımıza accept ()
		 * metodunu kullanarak veriyoruz, daha sonra Visitor sayesinde
		 * raporları yazdırıyoruz.
		 */
		pallet.accept(visitor);
		shelf.accept(visitor);
		zippyReader.accept(visitor);
		gateReader.accept(visitor);
	}

}
