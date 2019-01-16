import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GoogleQuery 
{
	public String searchKeyword;
	public String url;
	public String content;
	public KeywordList keywordlist;
	public ArrayList<Keyword> keywords = new ArrayList<Keyword>();
	
	
	public GoogleQuery(String searchKeyword)
	{
		
		this.searchKeyword = searchKeyword;
		this.url = "http://www.google.com/search?q="+searchKeyword + "+recipe" +"&oe=utf8&num=10";
		this.keywordlist = new KeywordList(searchKeyword);
		this.keywords = keywordlist.keywords;
	}
	
	private String fetchContent() throws IOException
	{
		String retVal = "";
		URL u = new URL(url);
		URLConnection conn = u.openConnection();
		conn.setRequestProperty("User-agent", "Chrome/71.0.3578.98");
		InputStream in = conn.getInputStream();
		InputStreamReader inReader = new InputStreamReader(in,"utf-8");
		BufferedReader bufReader = new BufferedReader(inReader);
		
		String line = null;
		while((line=bufReader.readLine())!=null)
		{
			retVal += line;
		}
		
		return retVal;
	}
	
	public HashMap<String, Web> query() throws IOException
	{
		if(content==null)
		{
			content= fetchContent();
		}
		HashMap<String, Web> retVal = new HashMap<String, Web>();
		
		Document doc = Jsoup.parse(content);
		
		Elements lis = doc.select("div.g");
		
		for(Element li : lis)
		{
			try 
			{
				Element h3 = li.select("h3.r").get(0);
				String title = h3.text();
				
				Element cite = li.select("cite").get(0);
				String citeUrl = cite.text(); 
//				System.out.println(title+" "+citeUrl);
				
				int score = getsublinkScore(citeUrl);
				Web data = new Web(citeUrl, title, score);
				retVal.put(title, data);
				
			} catch (IndexOutOfBoundsException e) {
				
			}
			
		}
		
		return retVal;
		
	}
	
	private int getsublinkScore(String citeUrl) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getLinkScore(String url) throws IOException{
		
		 
		  WebPage home = new WebPage(url);
		  home.setScore(this.keywords);
		
		
		  ArrayList<String> subLinkArray= new ArrayList<String>() ;
		  WordCounter temp_1 = new WordCounter(url);
		  String sublinkContent_1;
		  sublinkContent_1 = temp_1.fetchContent();
		  
		  int indexOfOpen = 0;
		  while((indexOfOpen=sublinkContent_1.indexOf("a href=\"",indexOfOpen))!=-1) {
			  indexOfOpen = indexOfOpen + 8;
			  int indexOfClose=sublinkContent_1.indexOf("\"", indexOfOpen);
			  String subLink=sublinkContent_1.substring(indexOfOpen, indexOfClose);
			  subLinkArray.add(subLink);
			  indexOfOpen=indexOfClose;
		  }
		  
		  int firstSize = subLinkArray.size();
		  
		  for(int i=0;i<firstSize;i++) {
			  
			  ArrayList<String> subLinkArray_2= new ArrayList<String>() ;
			  WordCounter temp_2 = new WordCounter(subLinkArray.get(i));
			  String sublinkContent_2;
			  sublinkContent_2 = temp_2.fetchContent();
			  int indexOfOpen_2=0;
			  while((indexOfOpen_2=sublinkContent_2.indexOf("a href=\"",indexOfOpen_2))!=-1) {
				  
				  indexOfOpen_2=indexOfOpen_2+8;
				  int indexOfClose=sublinkContent_2.indexOf("\"", indexOfOpen_2);
				  String subLink=sublinkContent_2.substring(indexOfOpen_2, indexOfClose);
				  subLinkArray.add(subLink);
				  indexOfOpen=indexOfClose;
			  }
		  }
		  
		  int lastSize = subLinkArray.size();
		  double sublinkScore = 0;
		  for(int i=0;i<lastSize;i++) {
			 WebPage link = new WebPage(subLinkArray.get(i));
			 link.setScore(this.keywords);
			 sublinkScore += link.score;
		  }
		  
		  sublinkScore += home.score;
		  
		  return sublinkScore;
	  }
	
	
}
