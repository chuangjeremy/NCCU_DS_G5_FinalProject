import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class WordCounter {
 
 private String urlStr;
 private String content;
 
 public WordCounter(String urlStr) {
  
  this.urlStr = urlStr;
 }
 
 private String fetchContent()throws IOException{
  
  URL url = new URL(this.urlStr);
  URLConnection conn = url.openConnection();
  InputStream in = conn.getInputStream();
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  
  String retVal = "";
  String line = null;
  
  while((line = br.readLine()) != null) {
   
   retVal = retVal + line + "\n";
   
  }
  
  return retVal;
  
 }
 
  public int countKeyword(String keyword) throws IOException{
   
   if(content == null) {
    content = fetchContent();
   }
   
   content = content.toUpperCase();
   keyword = keyword.toUpperCase();
   
   // TO DO :indexOf()
   
   StringBuffer ct = new StringBuffer(content);
   
   int times = 0;
   
   while(ct.indexOf(keyword) != -1) {
    
    int n = ct.indexOf(keyword);
    ct.delete(0, n + keyword.length());
    
    times = times + 1 ;
    
   }

   
   return times ;
   

  
  }
  

}