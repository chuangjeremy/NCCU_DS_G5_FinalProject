
public class Web {
	
	private String url;
	private String title;
	private int score;
	
	public Web(String url, String title, int score) {
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

	@Override
	public String toString() {
		return "Web [url= " + url + ", title = " + title + ", score = " + score + " ]";
	
	}
}
