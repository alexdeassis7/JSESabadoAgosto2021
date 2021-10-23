package com.educacionit.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.educacionit.database.Conexion;
import com.educacionit.models.PersonaVO;

public class PersonaDAO {

	public boolean validarUsuario(PersonaVO persona) {
		Conexion conex = new Conexion();
		try {
			// preparamosla consultar que vamos a ejecutar
			PreparedStatement consulta = conex.getConnection()
					.prepareStatement("SELECT * FROM user where usuario=? AND clave=?");

			// reemplazo los signos de pregunta
			consulta.setString(1, persona.getIdname());
			consulta.setInt(2, persona.getPassword());

			// ejecutamos al query
			ResultSet res = consulta.executeQuery();

			if (res.next()) {
				res.close();
				return true;
			} else {
				res.close();
				return false;
			}
		} catch (SQLException e) {
			System.out.println("ERROR: en la validacion de usuario , no se logro Hacer la validacion!");
			e.printStackTrace();
			return false;

		} finally {
			conex.desconectar();
		}
	}

//	public static void main(String[] args) {
//		PersonaDAO pd = new PersonaDAO();
//		System.out.println(pd.validarUsuario(new PersonaVO("alasdex", 1234)));
//	}

}
