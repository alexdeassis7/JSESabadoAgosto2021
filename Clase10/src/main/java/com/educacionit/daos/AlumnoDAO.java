package com.educacionit.daos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.educacionit.database.Conexion;
import com.educacionit.models.AlumnoVO;

public class AlumnoDAO {

	public void inserta(AlumnoVO alumno) throws SQLException{

		Conexion conn = new Conexion();

		PreparedStatement stm = conn.getConnection().prepareStatement("INSERT INTO ALUMNO (name,apellido,email,phone,message,lista) VALUES (?,?,?,?,?,?);");

		stm.setString(1, alumno.getName());
		stm.setString(2, alumno.getApellido());
		stm.setString(3, alumno.getEmail());
		stm.setString(4, alumno.getPhone());
		stm.setString(5, alumno.getMessage());
		stm.setString(6, alumno.getLista());
		
		stm.execute();
		stm.close();
		conn.desconectar();
	}
}
