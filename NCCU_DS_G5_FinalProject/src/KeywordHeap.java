import java.util.PriorityQueue;

public class KeywordHeap {
	
	private PriorityQueue<Web> heap;
		
	public KeywordHeap() {
		this.heap = new PriorityQueue<Web>(10, new KeywordComparator());
	}
	
	
	
	
	public void add(Web k) {
		heap.offer(k);

	}
	
	public void peek() {
		if (heap.peek() == null) {
			System.out.println("InvalidOperation");
			return;
		}
		
		Web k = heap.peek();
		System.out.println(k.toString());
	}

	public void removeMin() {
		Web k = heap.poll();
		System.out.println(k.toString());
	}




	public String[][] output() {
		String[][] result = new String[10][2];
		Web k;
		int i = 0;
		
		while( (k = heap.poll()) != null ) {
			result[i][0] = k.getTitle();
			result[i][1] = k.getUrl();
			i++;
		}
		
		return result;
		
	}




	
	
}
