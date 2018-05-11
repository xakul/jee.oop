package odata;

import java.util.Date;

public class Serializer {

	/**
	 * Date format arrives as "/Date(XXXXXXXXXX)/"
	 * where X's are milliseconds. We use "substring" to eliminate
	 * values "/Date(" and ")/".
	 * 
	 * Tarih değeri elimize "/Date(XXXXXXXXXX)/" olarak ulaşıyor.
	 * X değerleri milisaniye değerleri olduğu için, "substring"
	 * fonksiyonuyla "/Date(" ve ")/" değerlerini siliyoruz.
	 */
	public static Long toMilliseconds(String input){
		String rawValue = input.substring(6,input.length()-2);
		Long milliseconds = Long.parseLong(rawValue);
		return milliseconds;
	}
	
	/**
	 * This function converts millisecond values into a
	 * Date format.
	 * 
	 * Bu fonksiyon, milisaniye değerini Tarih(Date) nesnesine
	 * çeviriyor.
	 */
	public static Date dateSerializer(String toBeSerialized) {
		Long milliseconds = toMilliseconds(toBeSerialized);
		Date result = new Date(milliseconds);
		return result;
	}
	
}