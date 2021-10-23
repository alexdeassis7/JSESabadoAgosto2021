package com.educacionit.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//anotacion que indica cual sera la url de nuestro servlet 
@WebServlet("/init.do")
public class ProcesoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProcesoLogin() {       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.getWriter().append("gracias por invocar al servlet te esta antendiendo: ").append(request.getContextPath());
		System.out.println("llego la peticion al back end!");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//rediccionamos al user 
		
		response.sendRedirect("vistas/index.html");
	}

}
