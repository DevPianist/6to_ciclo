package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.MedicamentoBean;

public class MedicamentoDao {
	public boolean registrar(MedicamentoBean medicamentoBean) {
		boolean result = false;
		try {
			String query = "INSERT INTO medicamentos VALUES(null,?,?,?,?,?)";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setString(1, medicamentoBean.getNombre());
			ps.setDouble(2, medicamentoBean.getPrecio());
			ps.setString(3, medicamentoBean.getMarca());
			ps.setInt(4, medicamentoBean.getStock());
			ps.setString(5, medicamentoBean.getProveedor());
			result = (ps.executeUpdate() > 0) ? true : false;
		} catch (Exception e) {
			System.out.print("ERROR: " + e.getMessage());
		}
		return result;
	}

	public ArrayList<MedicamentoBean> listar() {
		ArrayList<MedicamentoBean> lista = new ArrayList<MedicamentoBean>();
		try {
			String query = "SELECT * FROM medicamentos";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MedicamentoBean medicamentoBean = new MedicamentoBean();
				medicamentoBean.setCodigo(rs.getInt("codigoMedicamento"));
				medicamentoBean.setNombre(rs.getString("nombre"));
				medicamentoBean.setPrecio(rs.getDouble("precio"));
				medicamentoBean.setMarca(rs.getString("marca"));
				medicamentoBean.setStock(rs.getInt("stock"));
				medicamentoBean.setProveedor(rs.getString("proveedor"));
				lista.add(medicamentoBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public boolean modificar(MedicamentoBean medicamentoBean) {
		boolean result = false;
		try {
			String query = "UPDATE medicamentos SET nombre = ?, precio = ?, marca = ?, stock = ?, proveedor = ? WHERE codigoMedicamento = ? ";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setString(1, medicamentoBean.getNombre());
			ps.setDouble(2, medicamentoBean.getPrecio());
			ps.setString(3, medicamentoBean.getMarca());
			ps.setInt(4, medicamentoBean.getStock());
			ps.setString(5, medicamentoBean.getProveedor());
			ps.setInt(6, medicamentoBean.getCodigo());
			result = (ps.executeUpdate() > 0) ? true : false;
		} catch (Exception e) {
			System.out.print("ERROR: " + e.getMessage());
		}
		return result;
	}

	public boolean eliminar(int codigoMedicamento) {
		boolean result = false;
		try {
			String query = "DELETE FROM medicamentos WHERE codigoMedicamento = ?";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setInt(1, codigoMedicamento);
			result = (ps.executeUpdate() > 0) ? true : false;
		} catch (Exception e) {
			System.out.print("ERROR: " + e.getMessage());
		}

		return result;
	}

	public ArrayList<MedicamentoBean> buscar(int codigoMedicamento) {
		ArrayList<MedicamentoBean> lista = new ArrayList<MedicamentoBean>();
		try {
			String query = "SELECT * FROM medicamentos WHERE codigoMedicamento = ? ";
			Connection cn = Util.getConnection();
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setInt(1, codigoMedicamento);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MedicamentoBean medicamentoBean = new MedicamentoBean();
				medicamentoBean.setCodigo(rs.getInt("codigoMedicamento"));
				medicamentoBean.setNombre(rs.getString("nombre"));
				medicamentoBean.setPrecio(rs.getDouble("precio"));
				medicamentoBean.setMarca(rs.getString("marca"));
				medicamentoBean.setStock(rs.getInt("stock"));
				medicamentoBean.setProveedor(rs.getString("proveedor"));
				lista.add(medicamentoBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}
