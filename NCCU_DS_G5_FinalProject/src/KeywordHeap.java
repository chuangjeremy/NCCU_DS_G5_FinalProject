import java.util.PriorityQueue;

public class KeywordHeap {
	
	private PriorityQueue<Web> heap;
		
	public KeywordHeap() {
		this.heap = new PriorityQueue<Web>(10, new KeywordComparator());
	}
	
	
	
	
	public void add(Web k) {
		heap.offer(k);
		System.out.println("Done");
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




	public void output() {
		StringBuilder sb = new StringBuilder();
		Web k;
		
		while( (k = heap.poll()) != null ) {
			sb.append(k.toString());
			if( heap.peek() != null) sb.append(" ");
		}
		
		System.out.println(sb.toString());
		
	}




	
	
}
