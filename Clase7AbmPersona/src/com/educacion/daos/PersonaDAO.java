package com.educacion.daos;

import java.sql.*;
import javax.swing.JOptionPane;
import com.educacion.database.Conexion;
import com.educacion.modelos.PersonaVO;

//patroin DAO Data access object
public class PersonaDAO {

	// este metodo contiene el proceso encargado de realizar insert en la tabla de
	// personas
	public void registrarPersona(PersonaVO mipersona) {

		Conexion conex = new Conexion();
		Statement estatuto = null;
		try {
			// obtengo un statement contra la conexion para poder utilizar y realizar
			// consultas SQL
			estatuto = conex.getConnection().createStatement();

			String query = "INSERT INTO `persona`(`nombre`, `edad`, `profesion`, `telefono`) VALUES ('"
					+ mipersona.getNombrePersona() + "','" + mipersona.getEdadPersona() + "','"
					+ mipersona.getProfesionPersona() + "','" + mipersona.getTelefonoPersona() + "')";

			System.out.println("Se ejecuto la siguiente query >>>>> " + query);
			// ejecuto la query contra la base
			estatuto.executeUpdate(query);

			JOptionPane.showMessageDialog(null, "Se Ha Registrado Exitosamente", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "No Se Registron a la Persona en la DB");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// liberamos los recursos
			try {
				conex.desconectar();
				estatuto.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// este metodo buscara una persona en la base mediante su PK
	public PersonaVO buscarPersona(int codigo) {

		Conexion conex = new Conexion();
		PersonaVO persona = new PersonaVO();
		boolean existe = false;
		PreparedStatement consulta = null;
		try {

			// esta seria la consulta a ejecutar para traer los registros filtrados por su
			// id
			String query = "SELECT * FROM `persona` WHERE id = ?";

			// creamos un objeto PreparedStatement para poder ejecutar las consultas con los
			// signos de pregunta "?"
			consulta = conex.getConnection().prepareStatement(query);

			// reemplazamos el o los signos de preguntas por los valores que corresponda
			consulta.setInt(1, codigo);

			// como ya tenemos la consulta lista , la ejecutamos
			ResultSet res = consulta.executeQuery();

			// si existe un registro para recorrer lo recorro y extraigo sus datos
			if (res.next()) {
				existe = true;
				// recuperamos los datos de las columnas de la tabla persona
				persona.setIdPersona(res.getInt("id")); // recupero el valor entero de la columna id
				persona.setNombrePersona(res.getString("nombre"));// recupero el valor string de la columna nombre
				persona.setEdadPersona(res.getInt("edad"));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(res.getInt("telefono"));
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error no se logro buscar a la persona con id :" + codigo);
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		} finally {
			// liberamos los recursos
			try {
				conex.desconectar();
				consulta.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (existe) {
			return persona;
		} else {
			return null;
		}

	}

	public void modificarPersona(PersonaVO miPersonaVO) {
		Conexion conex = new Conexion();
		PreparedStatement estatuto = null;
		if (buscarPersona(miPersonaVO.getIdPersona()) != null) {
			try {
				String consulta = "UPDATE persona SET nombre = ? , edad = ? , profesion = ? , telefono = ?  WHERE id = ?";
				estatuto = conex.getConnection().prepareStatement(consulta);

				estatuto.setString(1, miPersonaVO.getNombrePersona());
				estatuto.setInt(2, miPersonaVO.getEdadPersona());
				estatuto.setString(3, miPersonaVO.getProfesionPersona());
				estatuto.setInt(4, miPersonaVO.getTelefonoPersona());
				estatuto.setInt(5, miPersonaVO.getIdPersona());

				estatuto.executeUpdate();
				JOptionPane.showMessageDialog(null,
						"La persona con id " + miPersonaVO.getIdPersona() + " se logro actualizar");

			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null,
						"La persona con id " + miPersonaVO.getIdPersona()
								+ "  no se logro actualizarla ,ERROR , Contactar Administrador",
						"Error", JOptionPane.ERROR_MESSAGE);
				System.out.println(e);
				e.printStackTrace();
			} finally {
				// liberamos los recursos
				try {
					conex.desconectar();
					estatuto.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} else {
			JOptionPane.showMessageDialog(null,
					"La persona con id " + miPersonaVO.getIdPersona() + " no existe por eso no se logro actualizarla",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void eliminarPersona(int codigo) {
		if (buscarPersona(codigo) != null) {

			Conexion conex = new Conexion();
			Statement estatuto = null;
			try {
				estatuto = conex.getConnection().createStatement();

				String consulta = "DELETE FROM persona WHERE id ='" + codigo + "'";

				estatuto.executeUpdate(consulta);

				JOptionPane.showMessageDialog(null, "Se ha Eliminado correctamente al registro con id " + codigo,
						"Info", JOptionPane.INFORMATION_MESSAGE);

				estatuto.close();
				conex.desconectar();

			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "No se ah Eliminado correctamente al registro con id " + codigo,
						"Error", JOptionPane.ERROR_MESSAGE);
			} finally {
				// liberamos los recursos
				try {
					conex.desconectar();
					estatuto.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} else {
			JOptionPane.showMessageDialog(null,
					"La persona con id " + codigo + " no existe por eso no se logro elilminarla", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

//	public static void main(String[] args) {
//		PersonaDAO pdao =  new PersonaDAO();
//		PersonaVO pvo = pdao.buscarPersona(3);
//		
//		if(pvo != null) {
//			System.out.println("la persona existe y es la siguiente");
//			System.out.println(pvo.toString());
//			
//		}else {
//			System.out.println("la persona NOOO existe");
//		}
//	}
}
