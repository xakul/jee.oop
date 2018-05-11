package builder.carBuilder;

public class Main {

	public static void main(String[] args) {
		/*
		 * An instance has been created to access the methods in the CarBuilder class. 
		 * 
		 * CarBuilder sinifindaki metotlara erismek icin instance olusturuldu.
		 */
		Builder carBuilder = new Builder();
		/*
		 * carAbstract instance was created. 
		 * 
		 * carAbstract instance olusturuldu.
		 */
		CarAbstract carAbstract = null;

		/*
		 * The AMG series created in CarBuilder also synchronized our car to the
		 * carAbstract instance.
		 * 
		 * carBuilder da olusturulan AMG serisi arabamizi
		 * carAbstract ornegine esitledik.
		 */
		carAbstract = carBuilder.createAMGSeries();
		/*
		 * We give the carAbstract instance as a parameter to write() method to
		 * print the feature of AMG Series car.
		 * 
		 *  write() metodumuza parametre
		 * olarak verdigimiz AMG serisi arabamizin ozelliklerini yazdirdik.
		 */
		write(carAbstract);

		/*
		 * The A series created in CarBuilder also synchronized our car to the carAbstract instance. 
		 * 
		 * carBuilder da olusturulan A serisi arabamizi carAbstract ornegine esitledik.
		 */
		carAbstract = carBuilder.createASeries();
		write(carAbstract);

	}

	/*
	 * The write () method, which holds a CarAbstract type parameter, was written. 
	 * 
	 * İcinde CarAbstract tipinde bir parametre tutan write() metodu yazildi.
	 */
	public static void write(CarAbstract abstractCar) {
		System.out.println("Model of car " + abstractCar.getModel());
		System.out.println("Color of car " + abstractCar.getColor());
		System.out.println("Type of car " + abstractCar.getType());
		System.out.println("Name of car " + abstractCar.getName());
		System.out.println("Price of car " + abstractCar.getPrice() + "\n");
	}
}
