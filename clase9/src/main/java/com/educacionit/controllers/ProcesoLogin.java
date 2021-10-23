package com.educacionit.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.daos.PersonaDAO;
import com.educacionit.models.PersonaVO;

//anotacion que indica cual sera la url de nuestro servlet 
@WebServlet("/init.do")
public class ProcesoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProcesoLogin() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("gracias por invocar al servlet te esta antendiendo: ")
				.append(request.getContextPath());
		System.out.println("llego la peticion al back end!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("llego la peticion al metodo doPost del servlet ");

		String nombreUsuario = null;
		Integer passwordUsuario = null;

		// leo los parametros recibido en el request (los valores de las entradas del
		// fomulario )
		System.out.println("Recibimos estos datos del login.html");
		System.out.println(request.getParameter("pass"));
		System.out.println(request.getParameter("uname"));

		// rediccionamos al user
		if (request.getParameter("pass") != "" && request.getParameter("uname") != "") {
			passwordUsuario = Integer.parseInt(request.getParameter("pass"));
			nombreUsuario = request.getParameter("uname");
		}
		
		if(nombreUsuario != null & passwordUsuario != null) {
			PersonaDAO dao = new PersonaDAO();
			
			boolean validacion = dao.validarUsuario(new PersonaVO(nombreUsuario,passwordUsuario));
			
			if (validacion == true) {
				//usuario OK , redirecciono al index.html
				
				response.sendRedirect("vistas/index.html");
				
			}else {
				//usuario  Invalido  , redirecciono al error.html 
				response.sendRedirect("vistas/error.html");
			}
			
			
		}


	}

}
