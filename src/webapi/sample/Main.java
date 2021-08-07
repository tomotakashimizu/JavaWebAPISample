package webapi.sample;

public class Main {

	public static void main(String[] args) {
		WebAPI webAPI = new WebAPI("https://pn-c9759a75.herokuapp.com/", "us/newyork/newyork");
		String jsonData = webAPI.createJsonData();
		System.out.println(jsonData);

		WebAPI shizuokaCityWebAPI = new WebAPI("https://openapi.city.shizuoka.jp/opendataapi/servicepoint/", "roadRegulation");
		jsonData = shizuokaCityWebAPI.createJsonData();
		System.out.println("______________静岡市の道路規制情報のWebAPI______________");
		System.out.println(jsonData);
	}
}
