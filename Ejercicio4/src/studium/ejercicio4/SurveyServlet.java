package studium.ejercicio4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SurveyServlet
 */
@WebServlet("/SurveyServlet")
public class SurveyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SurveyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
*/
	
    
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		
		try {
			Enumeration<String> enun = request.getParameterNames();
			String pName = enun.nextElement();
			FileWriter wr = new FileWriter("C:\\Users\\pc\\eclipse-workspace\\Ejercicio4\\"+request.getParameter(pName)+".txt",true);
			PrintWriter pr = new PrintWriter(wr);
			
			
			pr.println("<INICIO>");
			
			while(enun.hasMoreElements()) {
				pName = enun.nextElement();
				pr.println(pName+":"+request.getParameter(pName));
			}
			
			pr.println("<FIN>");
			
			out.print("<h1>Encuesta Realizada con éxito.</h1>");
			
			out.close();
			pr.close();
			wr.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
