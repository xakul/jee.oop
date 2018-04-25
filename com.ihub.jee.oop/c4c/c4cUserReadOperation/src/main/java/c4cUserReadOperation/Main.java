/**
  * SAP Cloud Platform Cloud For Customer(C4C) Odata service connection with java
    * This code will be on reading data from C4C User entity
  * Release version 1.0 at 20.04.2018
  * @author Cem Dincay || cemdincay@live.com
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
		// Create an URL with needed parameters and queries.
		// Gerekli veri turlerini ve sorgulari iceren bir URL yaratilir.
		String baseURL = "https://myXXXXXX.crm.ondemand.com";
		String pathURL = "/sap/c4c/odata/v1/c4codata/";
		String entityURL = "UserCollection";
		String serviceURL = baseURL + pathURL + entityURL;

		// C4C username
		// C4C Kullanici Adi
		String username = "*****";

		// C4C password
		// C4C Sifre
		String password = "***";

		// Convert Username and password to Basic Auth
		// Kullanci adi sifreyi Basic Autha ceviriyoruz
		String basicToken = basicAuthEncode(username, password);

		// Creating Full Url
		// Full url yaratýlýyor
		String fullURL;

		// Created for the return of operation method
		// Kullanacaðýmýz operasyon methodundan dönecek olan sonucu eþitlemek için
		// yaratýyoruz
		String queryURL;
		URL url;

		// Created for the response of HTTPRequest
		// HTTPRequestten dönecek olan cevabý bir deðiþkene eþitlemek için yaratýyoruz
		String response;

		// OData Expand operasyonu
		// OData Expand query
		queryURL = getExpandEntityQuery("xxxxxx");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("EXPAND ENTITY QUERY : ", response);

		// OData Filter query with String value
		// OData String Deðeri ile Filter operasyonu
		queryURL = getFilterQueryWithStringValue("xxxx", "'xxxxx'");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("String filter : ", response);

		// OData Filter query with int value
		// OData int Deðeri ile Filter operasyonu
		queryURL = getFilterQueryWithIntValue("xxxx", 123);
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("String filter : ", response);

		// OData filter query with date
		// OData Date Deðeri ile Filter operasyonu
		queryURL = getFilterQueryWithDate("xxxxx", "datetimeoffset'2018-01-01T07:03:12.0000000Z'");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Date filter : ", response);

		// OData Count query
		// OData Count Operasyonu
		queryURL = getEntryCountQuery();
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Entity Count : ", response);

		// OData Top query
		// OData Top Operasyonu
		queryURL = getTopQuery("5");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Top Query : ", response);

		// OData skip query
		// OData Skip Operasyonu
		queryURL = getSkipQuery("10");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Skip Query : ", response);
	}

	/**
	 * Expand operation for the entity and we are giving the parameter for the which
	 * we want to expand entity
	 */
	/**
	 * Expand Operasyonun yapýldýðý method ve parametre olarak Expand etmek
	 * istediðimiz Entity'i veriyoruz
	 */
	public static String getExpandEntityQuery(String entity) {

		String expandEntity = "?$expand=" + entity;
		return expandEntity;
	}

	/** Filter operation with String value for the fields that type of EDM.String */
	/** Tipi EDM.String olan bir alana String deðerle Filter operasyonu */
	public static String getFilterQueryWithStringValue(String fieldName, String value) {

		String filterString = "?$filter=" + fieldName + "%20eq%20'" + value + "'";
		return filterString;
	}

	/** Filter operation with Integer value for the fields that type of EDM.Int32 */
	/** Tipi EDM.Int32 olan bir alana Integer deðerle Filter operasyonu */
	public static String getFilterQueryWithIntValue(String fieldName, Integer value) {

		String filterInt = "?$filter=" + fieldName + "%20eq%20" + value;
		return filterInt;
	}

	/**
	 * Filter operation with Date value for the fields that type of
	 * EDM.DateTimeOffset
	 */
	/** Tipi EDM.DateTimeOffset olan bir alana Date deðerle Filter operasyonu */
	public static String getFilterQueryWithDate(String fieldName, String date) {

		// datetime'2018-01-01T07:03:12.0000000Z'
		String filterDate = "?$filter=" + fieldName + "%20eq%20datetimeoffset'" + date + "'";
		return filterDate;
	}

	/** Counting Operation to Entity */
	/** Entity içindeki Entryleri Count eden operasyon */
	public static String getEntryCountQuery() {

		String countEntry = "/$count";
		return countEntry;
	}

	/** Top Operation */
	/** Ilk kaç kayýt geleceðini belirleyen operasyon */
	public static String getTopQuery(String value) {

		String topQuery = "?$top=" + value;
		return topQuery;
	}

	/** Skip Operation */
	/** Baþlangýçtan itibaren kaç kayýt geçilceðini belirleyen operasyon */
	public static String getSkipQuery(String value) {

		String skipQuery = "?$skip=" + value;
		return skipQuery;
	}

	/** Select Operation which you want to see the fields */
	/** Istenilen alanlarý görmek için yapýlan operasyon */
	public static String getSelectQuery(String... fieldName) {
		/** Because the selected fields can be more than one 
		 * the parameter given to method is in String Array type.
		 */
		/**
		 * Seçilen alanlar birden fazla olabileceði için methoda verilen parametre
		 * String Array tipindedir.
		 */
		String selectedField = "?$select=";
		/** If we got 1 parameter than we will get first index. */
		/** Eðer 1 adet parametre yollanýyorsa ilk index alýnýyor. */
		if (fieldName.length == 1) {
			selectedField = selectedField + fieldName[0];
			/** If more than 1 parameter is being sent
			 *  a comma is inserted between each parameter.If it is last
			 *  index than we wont insert a comma.
			 */
			/**
			 * Eðer 1 den fazla parametre yollanýyorsa her parametrenin arasýna virgül
			 * konuluyor.Son indexe gelindiðinde virgül konulmuyor.
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
	/** Http connection opens with this method. */
	/** Http baðlantýsýnýn açýldýðý yer. */
	private static String getHTTPRequestResult(URL url, String basicToken) throws IOException {
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		StringBuffer response = new StringBuffer();
		
		/** Header information entered. */
		/** Header bilgileri veriliyor */
		con.setRequestMethod("GET");
		con.setRequestProperty("accept", "application/json");
		con.setRequestProperty("Authorization", "Basic " + basicToken);
		
		/** The response code will be equal to variable. */
		/** Request sonrasý alýnan cevap bir deðiþkene eþitleniyor */
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code : " + responseCode);
		
		/** IF the response code is 200 than we create a variable. */
		/** Eðer alýnan cevap 200lü ise bir deðiþkene eþitleniyor */
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

		} 
		/** If it is not equal  application will be terminated.*/
		/** Eðer deðilse Requestimizin çalýþmadýðýný ekrana basýyoruz ve program sonlanýyor. */ 
		else 
		{
			return "GET request not worked";
		}
		return response.toString();
	}
	
	/** This method converting the Username and password to Basic Auth. */
	/** Kullanýcý adý ve þifrenin Basic Auth a dönüþtürüldüðü yer 
	 * Parametre olarak yukarýda yarattýðýmýz username ve password ü veriyoruz. */
	private static String basicAuthEncode(String username, String password) {
		String SEPARATOR = ":";
		StringBuilder userPass = new StringBuilder();

		userPass.append(username);
		userPass.append(SEPARATOR);
		userPass.append(password);
		
		/** This line converting username:password format to BasicAuth format */
		/** username:password formatýndaki string burada BasicAuth formatýna dönüþüyor */
		String encodedPassword = Base64.getEncoder()
				.encodeToString(userPass.toString().getBytes(StandardCharsets.UTF_8));

		return encodedPassword;
	}
	
	/** Printing method.You will give Query Type and the response for this method. */
	/** Konsola basma iþlemi burada yapýlýyor. Parametre olarak 
	 * konsola basýlmasýný istediðimiz Query tipini ve cevabý veriyoruz. */
	private static void print(String queryType, String response) {
		System.out.println(queryType);
		System.out.println(response);
	}

}
