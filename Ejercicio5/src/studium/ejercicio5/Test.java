package studium.ejercicio5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String parametro;
		int aciertos = 0;
		int fallos = 0;
		int ns = 0;
		String respuesta;
		try {
			Enumeration<String> en = request.getParameterNames();
			
			while(en.hasMoreElements()) {
				parametro = en.nextElement();
				respuesta = comprobarRespuesta(parametro,request);
				if(respuesta.equals("A")) {
					aciertos++;
				}else if(respuesta.equals("F")) {
					fallos++;
				}else if(respuesta.equals("D")){
					ns++;
				}else {
					System.err.println("No se ha devuelto ningun dato.");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		out.write("<h1>Datos de la encuesta</h1><br>");
		out.write("Nombre: "+nom+"<br>");
		out.write("Apellido 1: "+apel1+"<br>");
		out.write("Apellido 2: "+apel2+"<br>");
		out.write("Aciertos: "+aciertos+"<br>");
		out.write("Fallos: "+fallos+"<br>");
		out.write("NS/NC: "+ns+"<br>");
		
	}
	
	public String comprobarRespuesta(String parametro,HttpServletRequest r) {
		String dato = "";
		String co;
		switch(parametro) {
		case "nombre":
			nom = r.getParameter(parametro);
			break;
		case "apellido1":
			apel1 = r.getParameter(parametro);
			break;
		case "apellido2":
			apel2 = r.getParameter(parametro);
			break;
		case "P0":
			co = r.getParameter(parametro);
			if(co.equals("B")) {
				dato = "A";
			}else if(co.equals("D")) {
				dato = r.getParameter(parametro);
			}else {
				dato = "F";
			}
			break;
		case "P1":
			co = r.getParameter(parametro);
			if(co.equals("A")) {
				dato = "A";
			}else if(co.equals("D")) {
				dato = r.getParameter(parametro);
			}else {
				dato = "F";
			}
			break;
		case "P2":
			co = r.getParameter(parametro);
			if(co.equals("C")) {
				dato = "A";
			}else if(co.equals("D")) {
				dato = r.getParameter(parametro);
			}else {
				dato = "F";
			}
			break;
		case "P3":
			co = r.getParameter(parametro);
			if(co.equals("A")) {
				dato = "A";
			}else if(co.equals("D")) {
				dato = r.getParameter(parametro);
			}else {
				dato = "F";
			}
			break;
		case "P4":
			co = r.getParameter(parametro);
			if(co.equals("B")) {
				dato = "A";
			}else if(co.equals("D")) {
				dato = r.getParameter(parametro);
			}else {
				dato = "F";
			}
			break;
		case "P5":
			co = r.getParameter(parametro);
			if(co.equals("A")) {
				dato = "A";
			}else if(co.equals("D")) {
				dato = r.getParameter(parametro);
			}else {
				dato = "F";
			}
			break;
		case "P6":
			co = r.getParameter(parametro);
			if(co.equals("C")) {
				dato = "A";
			}else if(co.equals("D")) {
				dato = r.getParameter(parametro);
			}else {
				dato = "F";
			}
			break;
		case "P7":
			co = r.getParameter(parametro);
			if(co.equals("B")) {
				dato = "A";
			}else if(co.equals("D")) {
				dato = r.getParameter(parametro);
			}else {
				dato = "F";
			}
			break;
		case "P8":
			co = r.getParameter(parametro);
			if(co.equals("A")) {
				dato = "A";
			}else if(co.equals("D")) {
				dato = r.getParameter(parametro);
			}else {
				dato = "F";
			}
			break;
		case "P9":
			co = r.getParameter(parametro);
			if(co.equals("C")) {
				dato = "A";
			}else if(co.equals("D")) {
				dato = r.getParameter(parametro);
			}else {
				dato = "F";
			}
			break;
		default:
			dato = "Error";
		}
		
		return dato;
	}
	public String nom;
	public String apel1;
	public String apel2;
}
