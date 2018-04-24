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

import javax.xml.bind.DatatypeConverter;

public class Main {

	public static void main(String[] args) throws IOException {
		String baseURL = "https://myXXXXXX.crm.ondemand.com";
		String pathURL = "/sap/c4c/odata/v1/c4codata/";
		String entityURL = "UserCollection";
		String serviceURL = baseURL + pathURL + entityURL;

		// C4C username
		String username = "*****";
		// C4C password
		String password = "***";

		String basicToken = basicAuthEncode(username, password);

		String fullURL;
		String queryURL;
		URL url;
		
		String response;

		// OData expand query
		queryURL = getExpandEntityQuery("xxxxxx");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("EXPAND ENTITY QUERY : ",response);

		// OData filter query with string value
		queryURL = getFilterQueryWithStringValue("xxxx", "'xxxxx'");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("String filter : ",response);
		
		// OData filter query with date
		queryURL = getFilterQueryWithDate("xxxxx", "datetimeoffset'2018-01-01T07:03:12.0000000Z'");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Date filter : ",response);
		
		// OData count query
		queryURL = getEntryCountQuery();
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Entity Count : ",response);
		
		// Odata top query
		queryURL = getTopQuery("5");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Top Query : ",response);
		
		// Odata skip query
		queryURL = getSkipQuery("10");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestResult(url, basicToken);
		print("Skip Query : ",response);
	}

	public static String getExpandEntityQuery(String entity) {
		;
		String expandEntity = "?$expand=" + entity;
		return expandEntity;
	}

	public static String getFilterQueryWithStringValue(String fieldName, String value) {

		String filterString = "?$filter=" + fieldName + "%20eq%20'" + value + "'";
		return filterString;
	}

	public static String getFilterQueryWithIntValue(String fieldName, String value) {

		String filterInt = "?$filter=" + fieldName + "%20eq%20" + value;
		return filterInt;
	}

	public static String getFilterQueryWithDate(String fieldName, String date) {

		// datetime'2018-01-01T07:03:12.0000000Z'
		String filterDate = "?$filter=" + fieldName + "%20eq%20datetimeoffset'" + date + "'";
		return filterDate;
	}

	public static String getEntryCountQuery() {

		String countEntry = "/$count";
		return countEntry;
	}

	public static String getTopQuery(String value) {

		String topQuery = "?$top=" + value;
		return topQuery;
	}

	public static String getSkipQuery(String value) {

		String skipQuery = "?$skip=" + value;
		return skipQuery;
	}

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

	private static String getHTTPRequestResult(URL url, String basicToken) throws IOException {
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		StringBuffer response = new StringBuffer();
		con.setRequestMethod("GET");
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
		
		String encodedPassword = DatatypeConverter
				.printBase64Binary(userPass.toString().getBytes(StandardCharsets.UTF_8));
		
		return encodedPassword;
	}
	
	private static void print(String queryType , String response) {
		System.out.println(queryType);
		System.out.println(response);
	}

}
