package action;

import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import bean.MedicamentoBean;
import dao.MedicamentoDao;

public class MedicamentoAction {
	private String resultado;
	private MedicamentoBean medicamento;
	private String busqueda;
	private ArrayList<MedicamentoBean> listaMedicamentos;

	public ArrayList<MedicamentoBean> getListaMedicamentos() {
		return listaMedicamentos;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public MedicamentoBean getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(MedicamentoBean medicamento) {
		this.medicamento = medicamento;
	}

	public String getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}

	@Action(value = "registrarMedicamento", results = { @Result(name = "ok", location = "/registrarMedicamento.jsp") })
	public String registrarMedicamento() {

		MedicamentoDao medicamentoDao = new MedicamentoDao();
		medicamentoDao.registrar(this.getMedicamento());

		resultado = "Registro guardado: nombre: " + medicamento.getNombre() + ", precio: " + medicamento.getPrecio()
				+ ", marca: " + medicamento.getMarca() + ", stock: " + medicamento.getStock() + ", proveedor: "
				+ medicamento.getProveedor();
		return "ok";
	}

	@Action(value = "modificarMedicamento", results = { @Result(name = "ok", location = "/modificarMedicamento.jsp") })
	public String modificarMedicamento() {

		MedicamentoDao medicamentoDao = new MedicamentoDao();
		medicamentoDao.modificar(this.getMedicamento());

		resultado = "Medicamento modificado: codigo: " + medicamento.getCodigo() + ", nombre: "
				+ medicamento.getNombre() + ", precio: " + medicamento.getPrecio() + ", marca: "
				+ medicamento.getMarca() + ", stock: " + medicamento.getStock() + ", proveedor: "
				+ medicamento.getProveedor();
		;
		return "ok";
	}

	@Action(value = "listarMedicamento", results = { @Result(name = "ok", location = "/listarMedicamento.jsp") })
	public String listarMedicamento() {
		MedicamentoDao medicamentoDao = new MedicamentoDao();
		this.listaMedicamentos = medicamentoDao.listar();
		return "ok";
	}

	@Action(value = "buscarMedicamento", results = { @Result(name = "ok", location = "/buscarMedicamento.jsp") })
	public String buscarMedicamento() {
		MedicamentoDao medicamentoDao = new MedicamentoDao();
		this.listaMedicamentos = medicamentoDao.buscar(Integer.parseInt(this.getBusqueda()));

		resultado = "Resultados de medicamentos del codigo " + this.getBusqueda() + " es : "
				+ this.listaMedicamentos.size() + " resultados";
		return "ok";
	}

	@Action(value = "eliminarMedicamento", results = { @Result(name = "ok", location = "/eliminarMedicamento.jsp") })
	public String eliminarMedicamento() {
		MedicamentoDao medicamentoDao = new MedicamentoDao();
		medicamentoDao.eliminar(medicamento.getCodigo());
		resultado = "Se elimino el medicamento del codigo: " + medicamento.getCodigo();
		return "ok";
	}
}
