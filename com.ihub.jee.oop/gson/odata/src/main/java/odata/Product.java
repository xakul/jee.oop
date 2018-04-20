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
	   X values are milliseconds, by using substring, we obtain the raw value
	   Then, we convert these milliseconds to exact date,
	   And reassign to the Object(Date) values. 
	   
	   Tarih serilestirme islemleri burada yapildi.
	   Tarih degerleri elimize "/Date(XXXXXXXXXXXX)/" olarak ulasti..
	   X ile belirtilen kisim milisaniyeler, substring kullanalak asil degeri elde edildi.
	   Sonra bu degeri asil tarihe cevirip, gerekli Object(Date) degerlerine atildi.
	*/
	public Long toMilliseconds(String input){
		return Long.parseLong(input.substring(6,input.length()-2));
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