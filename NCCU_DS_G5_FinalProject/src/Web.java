
public class Web {
	private int key;
	private String url;
	private String title;
	private int score;
	
	public Web(int key,String url, String title, int score) {
		this.key = key;
		this.url = url;
		this.title = title;
		this.score = score;
	
	}
	public String getUrl() {
		return url;			
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		return "Web [url= " + url + ", title = " + title + ", score = " + score + " ]";
	
	}
}
