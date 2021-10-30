package com.educacionit.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.daos.AlumnoDAO;
import com.educacionit.models.AlumnoVO;

@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		pw.write("<h1>Gracias por enviarnos sus datos </h1>");
		pw.write("<h2>lo contactaremos a la brevedad!</h2>");

		// leemos los datos que nos vienen en el request ===>>>
		// http://localhost:8080/Clase10/FormController?name=alex&Apellido=&email=&phone=&message=&lista=PHP
		String name = request.getParameter("name");
		String apellido = request.getParameter("Apellido");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String message = request.getParameter("message");
		String[] lista = request.getParameterValues("lista");

		System.out.println("Cursos : ");
		for (String c : lista) {
			System.out.println(c);
		}
		System.out.println(name);
		System.out.println(apellido);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(message);

		// inserto los datos en la base
		String cursos = null;

		for (String c : lista) {
			cursos += c;
		}

		AlumnoVO a1 = new AlumnoVO(name, apellido, email, phone, message, cursos);
		AlumnoDAO miDao = new AlumnoDAO();
		try {
			miDao.inserta(a1);
			pw.write("<h3> usted se matriculo en los siguientes cursos : ");
			for (String c : lista) {
				pw.write(c + " ");
			}
			pw.write("</h3>");
		} catch (SQLException e) {
			pw.write("<h3>No se logro generar matricula para los  cursos  , favor reintentar ");
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
