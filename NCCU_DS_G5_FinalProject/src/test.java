import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/test")
/*public class test extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public test() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestUri = request.getRequestURI();
		request.setAttribute("requestUri", requestUri);
		request.getRequestDispatcher("test.jsp")
		.forward(request, response); 
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("test.jsp")
		 .forward(request, response);
	}
	
}*/


public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    		String user = req.getParameter("user"); // 取得請求參數
    		req.setAttribute("user", user);         // 設定請求屬性
    		req.getRequestDispatcher("test.jsp").forward(req, resp); // 轉發至 JSP
}

}

