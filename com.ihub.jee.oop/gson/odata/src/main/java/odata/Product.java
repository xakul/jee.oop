package odata;

import java.util.Date;

public class Product {
	
	public String ID;
	public String Name;
	public String Description;
	public Object ReleaseDate;
	public Object DiscontinuedDate;
	public String Rating;
	public String Price;
	public Category Category;
	public Supplier Supplier;
	
	/* Date Serialization operations are done here.
	   Date attributes arrive as "/Date(XXXXXXXXXXXX)/"
	   X values are milliseconds. We need them as raw value.
	   To remove "/Date(" and "(/" parts of the String,
	   substring(6,LENGTH-2) is used.
	   Then this value is parsed to Long format.
	   These milliseconds are converted to exact date,
	   And reassigned to the Object(Date) values.
	   
	   Tarih serilestirme islemleri burada yapildi.
	   Tarih degerleri elimize "/Date(XXXXXXXXXXXX)/" olarak ulasti.
	   X ile belirtilen kisim milisaniye değeri. Sadece bu kısma ulaşmak için,
	   substring(6,UZUNLUK-2) fonksiyonunu kullandık. Bu değeri Long formatına çevirdik.
	   Long degeri asil tarihe cevirip, gerekli Object(Date) degerlerine atildi.
	*/
	public Long toMilliseconds(String input){
		String rawValue = input.substring(6,input.length()-2);
		Long milliseconds = Long.parseLong(rawValue);
		return milliseconds;
	}
	
	public void ReleaseDateSerializer(String toBeSerialized) {
		Long milliseconds = toMilliseconds(toBeSerialized);
		this.ReleaseDate = new Date(milliseconds);
	}
	
	public void DiscontinuedDateSerializer(String toBeSerialized) {
		Long milliseconds = toMilliseconds(toBeSerialized);
		this.DiscontinuedDate = new Date(milliseconds);
	}
	
}