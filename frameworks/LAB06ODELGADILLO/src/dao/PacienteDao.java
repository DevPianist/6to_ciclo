package dao;

import java.sql.*;
import java.util.ArrayList;

import bean.CuidadorResponsableBean;
import bean.PacienteBean;

public class PacienteDao {

	public PacienteDao() {
	}

	public boolean registrar(PacienteBean pacienteBean) {
		boolean result = false;
		try {
			CuidadorResponsableDao cuidadorDao = new CuidadorResponsableDao();
			if (cuidadorDao.registrar(pacienteBean.getCuidadorResponsableBean())) {
				String query = "INSERT INTO pacientes VALUES(null,?,?,?,?,?,?,?,(SELECT MAX(codigoCuidador) FROM cuidadores_responsables))";
				Connection cn = Util.getConnection();
				PreparedStatement ps = cn.prepareStatement(query);
				ps.setString(1, pacienteBean.getPaciente());
				ps.setString(2, pacienteBean.getEspecie());
				ps.setString(3, pacienteBean.getRaza());
				ps.setString(4, pacienteBean.getColor());
				ps.setString(5, pacienteBean.getSexo());
				ps.setInt(6, pacienteBean.getEdad());
				ps.setString(7, pacienteBean.getMotivoConsulta());
				result = (ps.executeUpdate() > 0) ? true : false;
			}
		} catch (Exception e) {
			System.out.print("ERROR: " + e.getMessage());
		}
		return result;
	}

	public ArrayList<PacienteBean> listar() {
		ArrayList<PacienteBean> lista = new ArrayList<PacienteBean>();
		try {
			String query = "SELECT p.codigoPaciente,p.paciente,p.especie,p.raza,p.color,p.sexo,p.edad,p.motivoConsulta,c.* "
					+ "FROM pacientes p INNER JOIN cuidadores_responsables c ON p.codigoCuidador = c.codigoCuidador";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				CuidadorResponsableBean cuidadorBean = new CuidadorResponsableBean();
				cuidadorBean.setCodigo(rs.getInt("codigoCuidador"));
				cuidadorBean.setNombre(rs.getString("nombre"));
				cuidadorBean.setDomicilio(rs.getString("domicilio"));
				cuidadorBean.setTelefono(rs.getInt("telefono"));
				cuidadorBean.setCelular(rs.getInt("celular"));

				PacienteBean pacienteBean = new PacienteBean();
				pacienteBean.setCodigo(rs.getInt("codigoPaciente"));
				pacienteBean.setPaciente(rs.getString("paciente"));
				pacienteBean.setEspecie(rs.getString("especie"));
				pacienteBean.setRaza(rs.getString("raza"));
				pacienteBean.setColor(rs.getString("color"));
				pacienteBean.setSexo(rs.getString("sexo"));
				pacienteBean.setEdad(rs.getInt("edad"));
				pacienteBean.setMotivoConsulta(rs.getString("motivoConsulta"));
				pacienteBean.setCuidadorResponsableBean(cuidadorBean);
				// obtener cuidador

				lista.add(pacienteBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public boolean modificar(PacienteBean pacienteBean) {
		boolean result = false;
		try {
			CuidadorResponsableDao cuidadorDao = new CuidadorResponsableDao();
			if (cuidadorDao.modificar(pacienteBean.getCuidadorResponsableBean(), pacienteBean.getCodigo())) {
				String query = "UPDATE pacientes SET paciente = ?, especie = ?,  raza = ?, color = ?, sexo = ?, edad = ?, motivoConsulta = ?"
						+ " WHERE codigoPaciente = ?";
				Connection cn = Util.getConnection();
				PreparedStatement ps = cn.prepareStatement(query);
				ps.setString(1, pacienteBean.getPaciente());
				ps.setString(2, pacienteBean.getEspecie());
				ps.setString(3, pacienteBean.getRaza());
				ps.setString(4, pacienteBean.getColor());
				ps.setString(5, pacienteBean.getSexo());
				ps.setInt(6, pacienteBean.getEdad());
				ps.setString(7, pacienteBean.getMotivoConsulta());
				ps.setInt(8, pacienteBean.getCodigo());
				result = (ps.executeUpdate() > 0) ? true : false;
			}

		} catch (Exception e) {
			System.out.print("ERROR: " + e.getMessage());
		}
		return result;
	}

	public boolean eliminar(int codigoPaciente) {
		boolean result = false;
		try {
			String query = "DELETE FROM pacientes WHERE codigoPaciente = ?";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setInt(1, codigoPaciente);
			result = (ps.executeUpdate() > 0) ? true : false;
		} catch (Exception e) {
			System.out.print("ERROR: " + e.getMessage());
		}

		return result;
	}

	public ArrayList<PacienteBean> buscar(int codigoPaciente) {
		ArrayList<PacienteBean> lista = new ArrayList<PacienteBean>();
		try {
			String query = "SELECT p.codigoPaciente,p.paciente,p.especie,p.raza,p.color,p.sexo,p.edad,p.motivoConsulta,c.* "
					+ "FROM pacientes p INNER JOIN cuidadores_responsables c ON p.codigoCuidador = c.codigoCuidador WHERE p.codigoPaciente =  ?";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setInt(1, codigoPaciente);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CuidadorResponsableBean cuidadorBean = new CuidadorResponsableBean();
				cuidadorBean.setCodigo(rs.getInt("codigoCuidador"));
				cuidadorBean.setNombre(rs.getString("nombre"));
				cuidadorBean.setDomicilio(rs.getString("domicilio"));
				cuidadorBean.setTelefono(rs.getInt("telefono"));
				cuidadorBean.setCelular(rs.getInt("celular"));

				PacienteBean pacienteBean = new PacienteBean();
				pacienteBean.setCodigo(rs.getInt("codigoPaciente"));
				pacienteBean.setPaciente(rs.getString("paciente"));
				pacienteBean.setEspecie(rs.getString("especie"));
				pacienteBean.setRaza(rs.getString("raza"));
				pacienteBean.setColor(rs.getString("color"));
				pacienteBean.setSexo(rs.getString("sexo"));
				pacienteBean.setEdad(rs.getInt("edad"));
				pacienteBean.setMotivoConsulta(rs.getString("motivoConsulta"));

				pacienteBean.setCuidadorResponsableBean(cuidadorBean);

				//

				lista.add(pacienteBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
