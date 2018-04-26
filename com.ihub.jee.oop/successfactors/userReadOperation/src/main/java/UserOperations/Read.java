/**
  * SAP Cloud Platform Successfactors Odata service connection with java
  * This code will be on reading data from Successfactors User entity
  * Release version 1.0 at 20.04.2018
  * @author Gurkan Akpinar || @github xgakpinar 
  */

package UserOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Read {

	public static void main(String[] args) throws IOException {
		/**
		 * Connection variables.
		 * 
		 * Successfactors servisi için bağlantı parametreleri.
		 */
		String hostURL = "https://api012.successfactors.eu";
		String pathURL = "/odata/v2/";
		String entityURL = "User";
		String serviceURL = hostURL + pathURL + entityURL;

		/**
		 * Successfactors username@companyid.
		 * 
		 * Successfactors kullanici@sirketkodu.
		 */
		String username = "***@***";

		/**
		 * Successfactors password.
		 * 
		 * Successfactors sifre.
		 */
		String password = "***";

		/**
		 * Convert username and password to Basic Auth.
		 * 
		 * Kullanıcı adı ve şifre Basic Autha çeviriliyor.
		 */
		String basicToken = basicAuthEncode(username, password);

		String fullURL;
		String queryURL;
		URL url;

		/**
		 * Created for the response of HTTPRequest
		 * 
		 * HTTPRequestten dönecek olan cevabı bir degişkene eşitlemek icin yaratıyoruz
		 */
		String response;

		/**
		 * OData Expand operasyonu 
		 * 
		 * OData Expand query
		 */
		queryURL = getExpandEntityQuery("***");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Expand entity query : ", response);

		/**
		 * OData Filter query with String value 
		 * 
		 * OData String Değeri ile Filter operasyonu
		 */
		queryURL = getFilterQueryWithStringValue("***", "'***'");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("String filter : ", response);

		/**
		 * OData Filter query with date 
		 * 
		 * OData Date Değeri ile Filter operasyonu
		 */
		queryURL = getFilterQueryWithDate("formLastModifiedDate", "datetime'2017-05-19T23:59:59'");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Date filter : ", response);

		/**
		 * OData Count query
		 * 
		 * OData Count operasyonu
		 */
		queryURL = getEntryCountQuery();
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Entity Count : ", response);

		/**
		 * OData Top query 
		 * 
		 * OData Top Operasyonu
		 */
		queryURL = getTopQuery("5");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Top Query : ", response);

		/**
		 * OData Skip query
		 * 
		 * OData Skip operasyonu
		 */
		queryURL = getSkipQuery("10");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Skip Query : ", response);

		/**
		 * OData Select query 
		 * 
		 * OData Select operasyonu
		 */
		queryURL = getSelectQuery("***");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Select Query : ", response);
	}

	/**
	 * Expand operation for the entity and we are giving the parameter for the which
	 * we want to expand entity
	 *
	 * Expand Operasyonun yapıldığı method ve parametre olarak Expand etmek
	 * istediğimiz Entity'i veriyoruz
	 */
	public static String getExpandEntityQuery(String entity) {
		;
		String expandEntity = "?$expand=" + entity;
		return expandEntity;
	}

	/** 
	 * Filter operation with String value for the fields that type of EDM.String
	 * 
	 * Tipi EDM.String olan bir alana String değerle Filter operasyonu 
	 */
	public static String getFilterQueryWithStringValue(String fieldName, String value) {

		String filterString = "?$filter=" + fieldName + "%20eq%20'" + value + "'";
		return filterString;
	}

	/** 
	 * Filter operation with Integer value for the fields that type of EDM.Int32
	 * 
	 * Tipi EDM.Int32 olan bir alana Integer değerle Filter operasyonu 
	 */
	public static String getFilterQueryWithIntValue(String fieldName, String value) {

		String filterInt = "?$filter=" + fieldName + "%20eq%20" + value;
		return filterInt;
	}

	/**
	 * Filter operation with Date value for the fields that type of EDM.DateTimeOffset
	 * 
	 * Tipi EDM.DateTimeOffset olan bir alana Date değerle Filter operasyonu 
	 */
	public static String getFilterQueryWithDate(String fieldName, String date) {

		// datetime'2017-05-19T23:59:59'
		String filterDate = "?$filter=" + fieldName + "%20eq%20datetime'" + date + "'";
		return filterDate;
	}

	/** 
	 * Count Operation to Entity
	 * 
	 * Entity içindeki Entryleri Count eden operasyon 
	 */
	public static String getEntryCountQuery() {

		String countEntry = "/$count";
		return countEntry;
	}

	/** 
	 * Top Operation 
	 * 
	 * İlk kaç kayıt geleceğini belirleyen operasyon 
	 */
	public static String getTopQuery(String value) {

		String topQuery = "?$top=" + value;
		return topQuery;
	}

	/**
	 * Skip Operation 
	 * 
	 * Başlangıçtan itibaren kaç kayıt geçilceğini belirleyen operasyon 
	 */
	public static String getSkipQuery(String value) {

		String skipQuery = "?$skip=" + value;
		return skipQuery;
	}

	/** 
	 * Select Operation which you want to see the fields
	 * 
	 * Istenilen alanları görmek için yapılan operasyon 
	 */
	public static String getSelectQuery(String... fieldName) {

		String selectedField = "?$select=";
		if (fieldName.length == 1) {
			selectedField = selectedField + fieldName[0];
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
	 * 
	 * Http bağlantısının açıldığı yer. 
	 */
	private static String getHTTPRequestResult(URL url, String basicToken) throws IOException {
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		StringBuffer response = new StringBuffer();

		/**
		 * Set the HTTP Request properties.
		 * "GET", as a request method, corresponds to Read operation. 
		 * 
		 * HTTP Cagrisinin ozelliklerini belirlenir.
		 * "GET" kelimesi,cagri metodu olarak, ODATA'da okuma operasyonuna karsilik gelir.
		 */
		con.setRequestMethod("GET");

		/**
		 * "Accept" property defines the response format that will be received. 
		 * For the service to work with JSON, we use "application/json" in our function.
		 * 
		 * "Accept" ozelligi, ne tur bir format kabul edilecegini belirler.
		 * Servisimizin JSON ile calismasini belirtmek icin, fonksiyonumuzda "application/json" parametresini kullaniriz.
		 */
		con.setRequestProperty("accept", "application/json");

		con.setRequestProperty("Authorization", "Basic " + basicToken);
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code : " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

		} else {
			return "GET request not worked";
		}
		return response.toString();
	}

	private static String basicAuthEncode(String username, String password) {
		String SEPARATOR = ":";
		StringBuilder userPass = new StringBuilder();

		userPass.append(username);
		userPass.append(SEPARATOR);
		userPass.append(password);

		String encodedPassword = Base64.getEncoder()
				.encodeToString(userPass.toString().getBytes(StandardCharsets.UTF_8));

		return encodedPassword;
	}

	private static void print(String queryType, String response) {
		System.out.println(queryType);
		System.out.println(response);
	}
}
