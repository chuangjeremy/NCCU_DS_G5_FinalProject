import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestProject
 */
@WebServlet("/TestProject")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
	
	if(request.getParameter("food")== null || request.getParameter("cook")== null ) {
			String requestUri = request.getRequestURI();
			request.setAttribute("requestUri", requestUri);
			request.getRequestDispatcher("Search.jsp").forward(request, response);
			return;
		}
		
//		String keyword = request.getParameter("keyword1") + request.getParameter("keyword2") + request.getParameter("cook") + request.getParameter("food");
			
//		if(request.getParameter("keyword1") == null) {
////			if(request.getParameter("keyword2") == null) {
////			keyword = request.getParameter("food")+ request.getParameter("cook")+request.getParameter("key");}
//		}
//			
		
//	try {
//		GoogleQuery hi = new GoogleQuery("pork");
//		double hello = hi.getLinkScore("http://www.recipe.com/");
//		System.out.print(hello);
//	}catch(Exception e) {
//		
//	}
	
	System.out.print("down");
	
	
		String keyword = request.getParameter("keyword1").replace(" ", "")  + request.getParameter("cook").replace(" ", "") + request.getParameter("keyword2").replace(" ", "")+ request.getParameter("food").replace(" ", "");
		GoogleQuery google = new GoogleQuery(keyword);
		HashMap<String, Web> query = google.query();
		
		
		
		KeywordHeap sort = new KeywordHeap();
		for(Web web : query.values()) {
			sort.add(web);
		}
		
//		HashMap<String,String> query_2=new HashMap<String,String>;
		
		
		
		String[][] s = sort.output();
		request.setAttribute("query", s);
//		int num = 0;
//		for(Entry<String, String> entry : query.entrySet()) {
//		    String key = entry.getKey();
//		    String value = entry.getValue();
//		    s[num][0] = key;
//		    s[num][1] = value;
//		    num++;
//		}
		request.getRequestDispatcher("googleitem.jsp")
		 .forward(request, response); 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
