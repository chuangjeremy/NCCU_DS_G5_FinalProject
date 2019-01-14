import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public HashMap<String,Integer> hashmap;
 public static void main(String[] args) throws IOException {
 new Main();
 }
 public Main() {
  hashmap=new HashMap<String,Integer>();
  List<Map.Entry<String, Integer>> listdata = new ArrayList<Map.Entry<String,Integer>>(hashmap.entrySet());
  Collections.sort(listdata,new Comparator <Map.Entry<String, Integer>>(){
	  public int comapre(Map.Entry<String, Integer>entry1,Map.Entry<String, Integer> entry2) {
		  return (entry2.getValue()-entry1.getValue());
	  }
  });
  for (Map.Entry<String, Integer>entry:listdata) {
	  print(entry.getKey());
  }
  
  
  
 }
 private void print(String name) {
	 System.out.println(name+"\t"+hashmap.get(name));
 }
 }