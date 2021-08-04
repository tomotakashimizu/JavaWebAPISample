package webapi.sample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {

	public static void main(String[] args) {
		String param = "us/newyork/newyork";
		String jsonData = getJsonData(param);
		System.out.println(jsonData);
	}
 
	public static String getJsonData(String param) {
		String jsonData = "empty";
		URL url;
		try {
			String stringUrl = "https://pn-c9759a75.herokuapp.com/" + param;
			url = new URL(stringUrl);
			URLConnection urlConnection;
			urlConnection = url.openConnection();
			InputStream inputStream = urlConnection.getInputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String line = bufferedReader.readLine();
			if (line != null) {
				jsonData = line;
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonData;
	}
}
