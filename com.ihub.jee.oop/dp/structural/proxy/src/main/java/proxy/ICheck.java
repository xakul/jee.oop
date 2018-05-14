package proxy;

/**
 * 
 * In Proxy Pattern, This class is Subject Class, it must be interface 
 * in order to be implemented by Proxy & Real Subject Class because of 
 * check transactions like valid,calculated etc.
 * 
 * Proxy Pattern da Subject olarak adlandırılan classtır.Proxy & Real 
 * Subject Classlarına erişim bu class üzerinden olur.Çek işlemleri 
 * yapılır ( doğruluk , çek karşılığı hesaplama vb.)
 * 
 */
public interface  ICheck  {
	
	/**
	 * This method checks whether the check is valid.
	 * 
	 * Yazılan çekin valid olup olmadığı kontrol ediliyor.
	 * 
	 */
	public String isValidCheck(String username , String checkNumber);
	
	
}
