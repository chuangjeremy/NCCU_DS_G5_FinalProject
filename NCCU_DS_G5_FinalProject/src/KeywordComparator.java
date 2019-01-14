import java.util.Comparator;

public  class KeywordComparator implements Comparator<Web> {

	public int compare(Web o1, Web o2) {
		// TODO Auto-generated method stub
		if ( o1 ==null || o2 == null) {
			
			throw new NullPointerException();
		
		}
		
		
		if ( o1.getScore() < o2.getScore()) {
		
			return -1 ;
		
		} else if (o1.getScore() > o2.getScore()) {
		
			return 1;
		
		}	
		
			return 0;
		
	}

}
