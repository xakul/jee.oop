package CustomerOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.net.ssl.HttpsURLConnection;

public class Read {

	public static void main(String[] args) throws IOException {

		String baseURL = "https://myXXXXXX.crm.ondemand.com";
		String pathURL = "/sap/c4c/odata/v1/c4codata/";
		String entityURL = "IndividualCustomerCollection";
		String serviceURL = baseURL + pathURL + entityURL;

		String username = "**";
		String password = "**";

		String basicToken = basicAuthEncode(username, password);

		String fullURL;

		String queryURL;
		URL url;

		String response;

		queryURL = getExpandEntityQuery("****");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestREsult(url, basicToken);
		print("EXPAND ENTITY QUERY : ", response);

		queryURL = getFilterQueryWithIntValue("xxxx", 123);
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestREsult(url, basicToken);
		print("String filter : ", response);

		queryURL = getFilterQueryWithDate("xxxxx", "datetimeoffset'2018-01-01T07:03:12.0000000Z'");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestREsult(url, basicToken);
		print("Date filter : ", response);

		queryURL = getEntryCountQuery();
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestREsult(url, basicToken);
		print("Entity Count : ", response);

		queryURL = getTopQuery("5");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestREsult(url, basicToken);
		print("Top Query : ", response);

		queryURL = getSkipQuery("10");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestREsult(url, basicToken);
		print("Skip Query : ", response);

		queryURL = getSelectQuery("xx", "xxxx");
		fullURL = serviceURL + queryURL;
		url = new URL(fullURL);
		response = getHTTPRequestREsult(url, basicToken);
		print("Select Query : ", response);

	}

	private static String getTopQuery(String value) {
		String topQuery = "?$top=" + value;
		return topQuery;
	}

	private static String getEntryCountQuery() {
		String countEntry = "/$count";
		return countEntry;
	}

	private static String getSkipQuery(String value) {

		String skipQuery = "?$skip=" + value;
		return skipQuery;
	}

	private static String getSelectQuery(String... fieldName) {

		String selectedField = "?$ select=";

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

	private static String getFilterQueryWithDate(String fieldName, String date) {
		// datetime'2018-01-01T07:03:12.0000000Z'
		String filterDate = "?$filter=" + fieldName + "%20eq%20datetimeoffset'" + date + "'";
		return filterDate;
	}
	

	private static String getFilterQueryWithIntValue(String fieldName, int value) {

		String filterInt = "?$filter=" + fieldName + "%20eq%20" + value;
		return filterInt;
	}
	private static void print(String queryType, String response) {
		System.out.println(queryType);
		System.out.println(response);

	}

	private static String getHTTPRequestREsult(URL url, String basicToken) throws IOException {
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		StringBuffer response = new StringBuffer();

		con.setRequestMethod("GET");
		con.setRequestProperty("accept", "application/json");
		con.setRequestProperty("Authorization", "Basic " + basicToken);

		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code : " + responseCode);

		if (responseCode == HttpsURLConnection.HTTP_OK) {
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

	private static String getExpandEntityQuery(String entity) {
		String expandEntity = "?$expand=" + entity;
		return expandEntity;
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
}