package singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connector {
	// it is created null when first class is called.
	private static Connector uniqueInstance = null;
	
	private final String hostURL ;
	private final String pathURL ;
	private final String serviceURL;
		
	//the constructor is  defined private because it must not called from outside.
	private Connector () {
		 hostURL = "http://services.odata.org";
		 pathURL = "/V2/Northwind/Northwind.svc/";
		 serviceURL = hostURL + pathURL;
	}

	// Our method to call our class from the outside.
	// Thanks to synchronized keyword is prevented from runnig the method at the same time 
	public synchronized static Connector getInstance () {
		if(uniqueInstance == null) {
			uniqueInstance = new Connector();
		}
		
		return uniqueInstance;		
	}
		
	public String getProducts() throws IOException {
		String productQuery = this.serviceURL + "Products" ;
		URL url = new URL(productQuery);
		
		return getData(url);
	}
	
	public String getOrders() throws IOException {
		String orderQuery = this.serviceURL + "Orders" ;
		URL url = new URL(orderQuery);
		
		return getData(url);
	}
	
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