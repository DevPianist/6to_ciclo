package dao;

import bean.CuidadorResponsableBean;
import java.sql.*;
import java.util.ArrayList;

public class CuidadorResponsableDao {

	public CuidadorResponsableDao() {
	}

	public boolean registrar(CuidadorResponsableBean cuidadorBean) {
		boolean result = false;
		try {
			String query = "INSERT INTO cuidadores_responsables VALUES(null,?,?,?,?)";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setString(1, cuidadorBean.getNombre());
			ps.setString(2, cuidadorBean.getDomicilio());
			ps.setInt(3, cuidadorBean.getTelefono());
			ps.setInt(4, cuidadorBean.getCelular());
			result = (ps.executeUpdate() > 0) ? true : false;
		} catch (Exception e) {
			System.out.print("ERROR: " + e.getMessage());
		}
		return result;
	}

	public ArrayList<CuidadorResponsableBean> listar() {
		ArrayList<CuidadorResponsableBean> lista = new ArrayList<CuidadorResponsableBean>();
		try {
			String query = "SELECT * FROM cuidadores_responsables";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CuidadorResponsableBean cuidadorBean = new CuidadorResponsableBean();
				cuidadorBean.setCodigo(rs.getInt("codigoCuidador"));
				cuidadorBean.setDomicilio(rs.getString("domicilio"));
				cuidadorBean.setTelefono(rs.getInt("telefono"));
				cuidadorBean.setCelular(rs.getInt("celular"));
				lista.add(cuidadorBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public boolean modificar(CuidadorResponsableBean cuidadorBean, int codigoPaciente) {
		boolean result = false;
		try {
			String query = "UPDATE cuidadores_responsables SET nombre = ?, domicilio = ?, telefono = ?, celular = ? WHERE codigoCuidador = (SELECT MAX(codigoCuidador) FROM pacientes WHERE codigoPaciente = ?) ";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setString(1, cuidadorBean.getNombre());
			ps.setString(2, cuidadorBean.getDomicilio());
			ps.setInt(3, cuidadorBean.getTelefono());
			ps.setInt(4, cuidadorBean.getCelular());

			ps.setInt(5, codigoPaciente);
			result = (ps.executeUpdate() > 0) ? true : false;
		} catch (Exception e) {
			System.out.print("ERROR: " + e.getMessage());
		}
		return result;
	}

	public boolean eliminar(int codigoCuidador) {
		boolean result = false;
		try {
			String query = "DELETE FROM cuidadores_responsables WHERE codigoCuidador = ?";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setInt(1, codigoCuidador);
			result = (ps.executeUpdate() > 0) ? true : false;
		} catch (Exception e) {
			System.out.print("ERROR: " + e.getMessage());
		}

		return result;
	}

	public ArrayList<CuidadorResponsableBean> buscar(int codigoCuidador) {
		ArrayList<CuidadorResponsableBean> lista = new ArrayList<CuidadorResponsableBean>();
		try {
			String query = "SELECT * FROM cuidadores_responsables WHERE codigoCuidador = ? ";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setInt(1, codigoCuidador);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CuidadorResponsableBean cuidadorBean = new CuidadorResponsableBean();
				cuidadorBean.setCodigo(rs.getInt("codigoCuidador"));
				cuidadorBean.setDomicilio(rs.getString("domicilio"));
				cuidadorBean.setTelefono(rs.getInt("telefono"));
				cuidadorBean.setCelular(rs.getInt("celular"));
				lista.add(cuidadorBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}
