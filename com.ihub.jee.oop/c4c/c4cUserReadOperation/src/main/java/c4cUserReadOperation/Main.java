/**
  * SAP Cloud Platform Cloud For Customer(C4C) Odata service connection with java
  * This code will be on reading data from C4C User entity
  * Release version 1.0 at 20.04.2018
  * @author Cem Dincay || @github xcdincay
*/

package c4cUserReadOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {

	public static void main(String[] args) throws IOException {
		/** 
		 * Create an URL with needed parameters and queries.
		 */
		/** 
		 * Gerekli veri turlerini ve sorgulari iceren bir URL yarat�l�r.
		 */
		String baseURL = "https://myXXXXXX.crm.ondemand.com";
		String pathURL = "/sap/c4c/odata/v1/c4codata/";
		String entityURL = "UserCollection";
		String serviceURL = baseURL + pathURL + entityURL;

		/** 
		 * C4C Username
		 */
		/** 
		 * C4C Kullanici Adi 
		 */
		String username = "*****";

		/** 
		 * C4C Password 
		 */
		/**
		 *  C4C Sifre
		 */
		String password = "***";

		/** 
		 * Convert Username and password to Basic Auth.
		 */
		/**
		 *  Kullanci adi sifreyi Basic Autha ceviriyoruz.
		 */
		String basicToken = basicAuthEncode(username, password);

		/**
		 * Creating Full Url. 
		 */
		/** 
		 * Full url yaratılıyor 
		 */
		String fullURL;

		/** 
		 * Created for the return of operation method. 
		 */
		/** 
		 * Kullanacağımız operasyon methodundan d�necek olan sonucu eşitlemek için
		 * yaratıyoruz. 
		 */
		String queryURL;
		URL url;

		/** 
		 * Created for the response of HTTPRequest. 
		 */
		/**
		 * HTTPRequestten dönecek olan cevabı bir değişkene eşitlemek için yaratıyoruz. 
		 */
		String response;

		/** 
		 * OData Expand query. 
		 */
		queryURL = getExpandEntityQuery("xxxxxx");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("EXPAND ENTITY QUERY : ", response);

		/** 
		 * OData Filter query with String value. 
		 */
		queryURL = getFilterQueryWithStringValue("xxxx", "'xxxxx'");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("String filter : ", response);

		/** 
		 * OData Filter query with int value. 
		 */
		queryURL = getFilterQueryWithIntValue("xxxx", 123);
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("String filter : ", response);

		/** 
		 * OData filter query with date. 
		 */
		queryURL = getFilterQueryWithDate("xxxxx", "datetimeoffset'2018-01-01T07:03:12.0000000Z'");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Date filter : ", response);

		/** 
		 * OData Count query.
		 */
		queryURL = getEntryCountQuery();
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Entity Count : ", response);

		/** 
		 * OData Top query. 
		 */
		queryURL = getTopQuery("5");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Top Query : ", response);

		/** 
		 * OData skip query. 
		 */
		queryURL = getSkipQuery("10");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Skip Query : ", response);
		
		/** 
		 * OData Select query. 
		 */
		queryURL = getSelectQuery("xx","xxxx");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Select Query : ", response);
	}

	/**
	 * Expand operation for the entity and we are giving the parameter for the which
	 * we want to expand entity.
	 */
	/**
	 * Expand Operasyonun yapıldığı method ve parametre olarak Expand etmek
	 * istediğimiz Entity'i veriyoruz.
	 */
	public static String getExpandEntityQuery(String entity) {

		String expandEntity = "?$expand=" + entity;
		return expandEntity;
	}

	/** 
	 * Filter operation with String value for the fields that type of EDM.String. 
	 */
	/** 
	 * Tipi EDM.String olan bir alana String değerle Filter operasyonu. 
	 */
	public static String getFilterQueryWithStringValue(String fieldName, String value) {

		String filterString = "?$filter=" + fieldName + "%20eq%20'" + value + "'";
		return filterString;
	}

	/** 
	 * Filter operation with Integer value for the fields that type of EDM.Int32.
	 */
	/** 
	 * Tipi EDM.Int32 olan bir alana Integer değerle Filter operasyonu.
	 */
	public static String getFilterQueryWithIntValue(String fieldName, Integer value) {

		String filterInt = "?$filter=" + fieldName + "%20eq%20" + value;
		return filterInt;
	}

	/**
	 * Filter operation with Date value for the fields that type of
	 * EDM.DateTimeOffset.
	 */
	/** 
	 * Tipi EDM.DateTimeOffset olan bir alana Date değerle Filter operasyonu. 
	 */
	public static String getFilterQueryWithDate(String fieldName, String date) {

		// datetime'2018-01-01T07:03:12.0000000Z'
		String filterDate = "?$filter=" + fieldName + "%20eq%20datetimeoffset'" + date + "'";
		return filterDate;
	}

	/** 
	 * Counting Operation to Entity.
	 */
	/** 
	 * Entity içindeki Entryleri Count eden operasyon .
	 */
	public static String getEntryCountQuery() {

		String countEntry = "/$count";
		return countEntry;
	}

	/** 
	 * Top Operation. 
	 */
	/** 
	 * Ilk kaç kayıt geleceğini belirleyen operasyon. 
	 */
	public static String getTopQuery(String value) {

		String topQuery = "?$top=" + value;
		return topQuery;
	}

	/** 
	 * Skip Operation 
	 */
	/** 
	 * Başlangıçtan itibaren kaç kayıt geçilceğini belirleyen operasyon.
	 */
	public static String getSkipQuery(String value) {

		String skipQuery = "?$skip=" + value;
		return skipQuery;
	}

	/** 
	 * Select Operation which you want to see the fields 
	 */
	/** 
	 * Istenilen alanları görmek için yapılan operasyon.
	 */
	public static String getSelectQuery(String... fieldName) {
		/** Because the selected fields can be more than one 
		 * the parameter given to method is in String Array type.
		 */
		/**
		 * Seçilen alanlar birden fazla olabileceği için methoda verilen parametre
		 * String Array tipindedir.
		 */
		String selectedField = "?$select=";
		/** 
		 * If we got 1 parameter than we will get first index. 
		 */
		/** 
		 * Eğer 1 adet parametre yollanıyorsa ilk index alınıyor. 
		 */
		if (fieldName.length == 1) {
			selectedField = selectedField + fieldName[0];
			/** If more than 1 parameter is being sent
			 *  a comma is inserted between each parameter.If it is last
			 *  index than we wont insert a comma.
			 */
			/**
			 * Eğer 1 den fazla parametre yollanıyorsa her parametrenin arasına virgül
			 * konuluyor.Son indexe gelindiğinde virgül konulmuyor.
			 */
		} else if (fieldName.length > 1) {
			selectedField = selectedField + fieldName[0] + ",";
			for (int i = 1; fieldName.length > i; i++) {
				String field = fieldName[i];
				if (i == fieldName.length - 1) {
					selectedField = selectedField + field;
				} else {
					selectedField = selectedField + field + ",";
				}
			}
		}
		return selectedField;
	}
	
	/** 
	 * Http connection opens with this method. 
	 */
	/** 
	 * Http bağlantısının açıldığı yer. 
	 */
	private static String getHTTPRequestResult(URL url, String basicToken) throws IOException {
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		StringBuffer response = new StringBuffer();
		
		/** 
		 * Header information entered.
		 */
		/** 
		 * Header bilgileri veriliyor.
		 */
		con.setRequestMethod("GET");
		con.setRequestProperty("accept", "application/json");
		con.setRequestProperty("Authorization", "Basic " + basicToken);
		
		/** 
		 * The response code will be equal to variable.
		 */
		/** 
		 * Request sonrası alınan cevap bir değişkene eşitleniyor.
		 */
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code : " + responseCode);
		
		/** 
		 * If the response code is 200 than we create a variable.
		 */
		/** 
		 * Eğer alınan cevap 200lü ise bir değişkene eşitleniyor.
		 */
		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
		} 
		
		/** 
		 * If it is not equal  application will be terminated.
		 */
		/** 
		 * Eğer değilse Requestimizin çalışmadığını ekrana basıyoruz ve program sonlanıyor.
		 */ 
		else 
		{
			return "GET request not worked";
		}
		return response.toString();
	}
	
	/** 
	 * This method converting the Username and password to Basic Auth. 
	 */
	/** Kullanıcı adı ve şifrenin Basic Auth a dönüştürüldüğü yer 
	 * Parametre olarak yukarıda yarattığımız username ve password ü veriyoruz. 
	 */
	private static String basicAuthEncode(String username, String password) {
		String SEPARATOR = ":";
		StringBuilder userPass = new StringBuilder();

		userPass.append(username);
		userPass.append(SEPARATOR);
		userPass.append(password);
		
		/** 
		 * This line converting username:password format to BasicAuth format.
		 */
		/** 
		 * username:password formatındaki string burada BasicAuth formatına dönüşüyor. 
		 */
		String encodedPassword = Base64.getEncoder()
				.encodeToString(userPass.toString().getBytes(StandardCharsets.UTF_8));

		return encodedPassword;
	}
	
	/** 
	 * Printing method.You will give Query Type and the response for this method.
	 */
	/** Konsola basma işlemi burada yapılıyor. 
	 * Parametre olarak konsola basılmasını istediğimiz Query tipini ve cevabı veriyoruz.
	 */
	private static void print(String queryType, String response) {
		System.out.println(queryType);
		System.out.println(response);
	}
}
