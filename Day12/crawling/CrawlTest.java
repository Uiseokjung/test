

/*import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

public class CrawlTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Crawling Test");
		
		// naver
		String URL = "https://www.naver.com";
		Document doc = Jsoup.connect(URL).get();
		//System.out.println(doc);
		Elements elem = doc.select("div");
		//System.out.println(elem);
		
		// wikipedia
		String URL2 = "https://en.wikipedia.org/wiki/Main_Page";
		Document doc2 = Jsoup.connect(URL2).get();
		Elements elem2 = doc2.select("div.wikipedia-languages-count");
		System.out.println(elem2);
		for(Element content : elem2) {
			System.out.println(content.text());
		}
	}
}*/
