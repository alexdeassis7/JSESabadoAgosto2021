package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	// nombre de la base
	static String db = "alumnos";
	// credenciales de la base
	static String login = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db; // string de conexion

	Connection conn = null;

	public Conexion() {
		try {
			// obtenemos el driver de conexion
			Class.forName("com.mysql.jdbc.Driver");
			// obtengo un objeto connection mediante el administrador de conexiones
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Se logro conectar exitosamente a la base " + db);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public Connection getConnection() {
		return conn;
	}

	public void desconectar() {

		try {
			conn.close();
			conn = null;
			System.out.println("Se logro desconectar de la base de datos de " + db);
		} catch (SQLException e) {
			System.out.println("no se logro cerrar la conexion a la base ");
		}

	}

	public static void main(String[] args) {
		Conexion connMysql = new Conexion();
	}

}