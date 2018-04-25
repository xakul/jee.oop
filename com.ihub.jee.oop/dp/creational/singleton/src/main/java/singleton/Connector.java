package singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connector {
	
	/**
	 * when uniqueInstance variable is created null, 
	 * it will only fill getInstance().That's the singleton.
	 * 
	 * uniqueInstance de�i�keni null olarak ba�lat�l�yor, 
	 * sadece getInstance methodunda doluyor. Singletonun olay� bu.
	 */
	private static Connector uniqueInstance = null;
	
	private final String hostURL ;
	private final String pathURL ;
	private final String serviceURL;
		
	/*
	 * the constructor is  defined private because it must not called from outside.
	 * 
	 * Constructor bilerek private yap�yoruz d��ar�dan �a�r�lmamas� i�in.
	 */
	private Connector () {
		 hostURL = "http://services.odata.org";
		 pathURL = "/V2/Northwind/Northwind.svc/";
		 serviceURL = hostURL + pathURL;
	}

	/*
	 * Our method to call our class from the outside.
	 * Using synchronized keyword prevents from running the method at the same time 
	 * 
	 * D��ar�dan �a�r�ld���nda Class�n instance'i sadece burada al�n�r ve sadece 
	 * tek al�nmas� i�in synchronized keyword'� ayn� anda yarat�lmas�n� engelliyor.
	 */
	
	public synchronized static Connector getInstance () {
		if(uniqueInstance == null) {
			uniqueInstance = new Connector();
		}
		
		return uniqueInstance;		
	}
		
	public String getProducts() throws IOException {
		String productQuery = this.serviceURL + "Products" ;
		URL url = new URL(productQuery);
		String data = getData(url);
		
		return data;
	}
	
	public String getOrders() throws IOException {
		String orderQuery = this.serviceURL + "Orders" ;
		URL url = new URL(orderQuery);
		String data = getData(url);
		
		return data;
	}
	
	/*
	 * This method is not related to Singleton Pattern.
	 * We used this method in order to get data from odata.
	 * 
	 * Bu methodu singleton Pattern ile alakal� de�ildir.
	 * Odata dan datay� al�p string olarak d�nen bir method
	 * olarak bilmek yeterli.
	 */
	private String getData(URL url) throws IOException {
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("accept", "application/json");
		int responseCode = con.getResponseCode();
		String result;
		
		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			result = response.toString();
		} else {		
			result = "GET request is failed" ;
		}
		
		return result;
	}
}