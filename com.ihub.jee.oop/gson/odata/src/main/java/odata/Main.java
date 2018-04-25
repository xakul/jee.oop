/**
 * Java GSON Tutorial for ODATA Services and responses.
 * Release version 1.0 at 20.04.2018.
 * @author Mehmet Gurol || @github xmgurol
 */

package odata;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/** 
 * GSON library is needed.
 * GSON kütüphanesine ihtiyaç var. ððð
 */
import com.google.gson.Gson;

public class Main {
	
	public static void main (String[] args) throws IOException {
		/** 
		 * Invoke the connection function that receives the data.
		 * Yazilan baglanti fonksiyonu cagirilir, bir degiskene atanir.
		 */
		String JsonResponse = getProductsFromService();
		
		/** 
		 * Initialize Gson Object.
		 * Gson nesnesi yaratilir. 
		 */
		Gson gson = new Gson();
		
		/** 
		 * Using the GSON's "fromJson(JSON_AS_STRING, CLASS_TYPE)" we can obtain objects from the JSON file.
		 *
		 * GSON kutuphanesinin "fromJson(STRING_OLARAK_JSON, SINIF_TIPI)" metoduyla,
		 * JSON dosyasindaki veriler objelere atilir.
		 */
		ProductData productData = gson.fromJson(JsonResponse, ProductData.class);
		
		/**
		 * With this function, we can print the contents of the objects.
		 * Bu fonksiyonla, nesnelerimizin degerleri bastirilir.
		 */
		prettyPrint(productData);
	}
	
	/** 
	 * This function returns JSON Response (as a String) from the ODATA Service.
	 * Bu fonksiyon ODATA servisinden JSON geri bildirimini alip, String olarak doner.
	 */
	public static String getProductsFromService() throws IOException
	{
		/**
		 * Create an URL with needed parameters and queries.
		 * Gerekli veri turlerini ve sorgulari iceren bir URL yaratilir.
		 */
		String hostURL = "http://services.odata.org/";
		String serviceURL = "V2/OData/OData.svc/";
		String entitySet = "Products";
		String expandQuery = "?$expand=Category,Supplier";
		String fullURL = hostURL + serviceURL + entitySet + expandQuery;
		
		/**
		 * Set up a HttpURLConnection
		 * Bir HTTP baglantisi kurulur.
		 */
		URL url = new URL(fullURL);
	    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	    /**
	     * Set the HTTP Request properties.
	     * HTTP Cagrisinin ozelliklerini belirlenir.
	     */
	    
	    /**
	     * "GET", as a request method, corresponds to Read operation.
	     * "GET" kelimesi, cagri metodu olarak, ODATA'da okuma operasyonuna karsilik gelir.
	     */
	    connection.setRequestMethod("GET");
	    
	    /**
	     * "Accept" property defines the response format that will be received.
	     * "Accept" ozelligi, ne tur bir format kabul edilecegini belirler.
	     *
	     * For the service to work with JSON, we use "application/json" in our function.
	     * Servisimizin JSON ile calismasini belirtmek icin, fonksiyonumuzda "application/json"
	     * parametresini kullaniriz.
	     */
	    connection.setRequestProperty("Accept", "application/json");
	    
	    /**
	     * Initialize connection.
	     * Baglantiyi kur.
	     */
	    connection.connect();
	    
	    /**
	     * Create a Buffered Reader that collects the stream of data from the response.
	     * Bir "BufferedReader" kullanak, sorgudan geri bildirilen tum akan veri toplanilir.
	     */
	    BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));

	    /** 
	     * Using a StringBuilder, have the JSON response as a String in the end.
	     * "StringBuilder" kullanarak, JSON bildirimini String formatina cevrilir.
	     */
	    StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bf.readLine()) != null) {
            stringBuilder.append(line);
        }
	    
        /**
         * Return as a string.
         * String tipinde donulur.
         */
	    return stringBuilder.toString();
	}
	
	public static void prettyPrint(ProductData data)
	{
		/**
		 * Dataset that we obtained is assigned to an ArrayList.
		 * Elde ettigimiz nesneler, bir "ArrayList"e atandi.
		 */
		ArrayList<Product> productList = data.d;
		
		/**
		 * These objects' contents are printed.
		 * Nesnelerin degerleri ekrana bastirilir.
		 */
		for (Product product : productList)
		{
			/**
			 * In our service, Date fields can be null, we need to check them.
			 * If they are not null, we need to convert them to Java Date format.
			 *
			 * Servisimizde bulunan tarih(Date) degerleri bos(null) olabilir.
			 * Bu degerler bos degilse, gerekli Java Date donusumleri yapilir.
			 */
			if (product.ReleaseDate != null) {
				product.ReleaseDate = Serializer.dateSerializer((String) product.ReleaseDate);
			}
			
			if (product.DiscontinuedDate != null) {
				product.DiscontinuedDate = Serializer.dateSerializer((String) product.DiscontinuedDate);
			}
			
			/**
			 * We print the contents of the objects.
			 * Notice that GSON filled all the instances that exist in the classes.
			 * 
			 * Burada nesnelerimizin degerlerini bastiriyoruz.
			 * GSON, siniflandirmalarimizda bulunan tum yapilardaki degerleri doldurmaktadir.
			 */
			System.out.println("*");
			System.out.println("ID: " + product.ID);
			System.out.println("Description: " + product.Description);
			System.out.println("Release Date: " + product.ReleaseDate);
			System.out.println("Supplier Name: " + product.Supplier.Name);
			System.out.println("Category Name: " + product.Category.Name);
			System.out.println("Supplier Adress Street: " + product.Supplier.Address.Street);
		}
	}
	
}
