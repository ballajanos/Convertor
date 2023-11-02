package convertor;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {

	protected void doGet(HttpServletRequestWrapper req, HttpServletResponse res) throws ServletException, IOException{
		
		int lei=Integer.parseInt(req.getParameter("lei"));
		
		int euro=lei/5;
		
		req.setAttribute("convert", euro);
		req.getRequestDispatcher("convertor.jsp").forward(req, res);;
	}
}
