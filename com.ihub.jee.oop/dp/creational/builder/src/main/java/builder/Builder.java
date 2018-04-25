package builder;

/**
 * The Car Builder class was created to create a vehicle according to the type
 * of car desired by the client. 
 * 
 * CarBuilder sınıfı client tarafından istenilen
 * arabanın türüne göre araç yaratmak için oluşturuldu.
 */
public class Builder {
	
	/**
	 * The createASeries() method is a CarAbstract type method and was written
	 * to create A series of cars. 
	 * 
	 * createASeries() metodu CarAbstract tipinde
	 * bir metot ve A serisine ait araba yaratmak için yazıldı.
	 */
	public CarAbstract createASeries() {

		/**
		 * Here a new Mercedes ASeries car was created from the CarAbstract
		 * class using polymorphism. 
		 * 
		 * Burada polymorphism kullanarak CarAbstract
		 * sınıfından yeni bir MercedesASeries araba yaratildi.
		 */
		CarAbstract abstractCar = new MercedesASeries();
		return abstractCar;
	}

	/**
	 * The createAMGSeries() method is a CarAbstract type method and was written
	 * to create AMG series of cars. 
	 * 
	 * createAMGSeries() metodu CarAbstract
	 * tipinde bir metot ve AMG serisine ait araba yaratmak icin yazıldı.
	 */
	public CarAbstract createAMGSeries() {

		/**
		 * Here a new MercedesAMGSeries car
		 * was created from the CarAbstract class using polymorphism.
		 * 
		 * Burada polymorphism kullanarak CarAbstract sınıfından yeni
		 * bir MercedesAMGSeries araba yaratıldı.
		 */
		CarAbstract abstractCar = new MercedesAMGSeries();
		return abstractCar;
	}

}
