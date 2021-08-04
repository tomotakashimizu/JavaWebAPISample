package webapi.sample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {

	public static void main(String[] args) {
		String param = "us/newyork/newyork";
		String retJson = pn_c9759a75_herokuapp_com(param);
		p(retJson);
	}
	
	public static void p(String a){
        System.out.println(a);
    }
 
	public static String pn_c9759a75_herokuapp_com(String param) {
		String retJson = "empty";
		URL url;
		try {
			String url_s = "https://pn-c9759a75.herokuapp.com/" + param;
			url = new URL(url_s);
			URLConnection conn;
			conn = url.openConnection();
			InputStream in = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			if ((line = br.readLine()) != null) {
				retJson = line;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retJson;
	}
}
