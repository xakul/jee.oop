/**
 * Release version 1.0 at 18.04.2018
 * @author Gokhan Guler || @github xgguler
 */

package builder;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * An instance has been created to access the methods in the CarBuilder class. 
		 * 
		 * CarBuilder sınıfındaki metotlara erişmek için instance oluşturuldu.
		 */
		Builder carBuilder = new Builder();
		
		/*
		 * carAbstract instance was created. 
		 * 
		 * carAbstract instance oluşturuldu.
		 */
		CarAbstract carAbstract = null;

		/*
		 * The AMG series created in CarBuilder also synchronized our car to the
		 * carAbstract instance.
		 * 
		 * carBuilder da oluşturulan AMG serisi arabamızı
		 * carAbstract örneğine eşitledik.
		 */
		carAbstract = carBuilder.createAMGSeries();
		
		/*
		 * We give the carAbstract instance as a parameter to write() method to
		 * print the feature of AMG Series car.
		 * 
		 *  write() metodumuza parametre
		 * olarak verdiğimiz AMG serisi arabamızın özelliklerini yazdırdık.
		 */
		write(carAbstract);

		/*
		 * The A series created in CarBuilder also synchronized our car to the carAbstract instance. 
		 * 
		 * carBuilder da oluşturulan A serisi arabamizi carAbstract örneğine eşitledik.
		 */
		carAbstract = carBuilder.createASeries();
		write(carAbstract);

	}

	/*
	 * The write() method, which holds a CarAbstract type parameter, was written. 
	 * 
	 * İçinde CarAbstract tipinde bir parametre tutan write() metodu yazıldı.
	 */
	public static void write(CarAbstract abstractCar) {
		System.out.println("Model of car " + abstractCar.getModel());
		System.out.println("Color of car " + abstractCar.getColor());
		System.out.println("Type of car " + abstractCar.getType());
		System.out.println("Name of car " + abstractCar.getName());
		System.out.println("Price of car " + abstractCar.getPrice() + "\n");
	}
}
