package webapi.sample;

public class Main {

	public static void main(String[] args) {
		WebAPI webAPI = new WebAPI("https://pn-c9759a75.herokuapp.com/", "us/newyork/newyork");
		String jsonData = webAPI.createJsonData();
		System.out.println(jsonData);
	}
}
