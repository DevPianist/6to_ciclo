package action;

import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;
import bean.PacienteBean;
import dao.PacienteDao;

@SuppressWarnings("serial")
public class PacienteAction extends ActionSupport {
	private String resultado;
	private PacienteBean paciente;
	private String busqueda;
	private ArrayList<PacienteBean> listaPacientes;

	public ArrayList<PacienteBean> getListaPacientes() {
		return listaPacientes;
	}

	public String getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public PacienteBean getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteBean paciente) {
		this.paciente = paciente;
	}

	@Action(value = "listar", results = { @Result(name = "ok", location = "/listar.jsp") })
	public String listar() {
		PacienteDao pacienteDao = new PacienteDao();
		this.listaPacientes = pacienteDao.listar();
		return "ok";
	}

	@Action(value = "registrarPaciente", results = { @Result(name = "ok", location = "/registrar.jsp") })
	public String registrarPaciente() {
		PacienteDao pacienteDao = new PacienteDao();
		pacienteDao.registrar(this.getPaciente());

		resultado = "Registro guardado: nombre: " + paciente.getCuidadorResponsableBean().getNombre() + ", celular: "
				+ paciente.getCuidadorResponsableBean().getCelular() + ", domicilio: "
				+ paciente.getCuidadorResponsableBean().getDomicilio() + ", telefono: "
				+ paciente.getCuidadorResponsableBean().getTelefono() + ", paciente: " + paciente.getPaciente()
				+ ", especie: " + paciente.getEspecie() + ", raza: " + paciente.getRaza() + ", color: "
				+ paciente.getColor() + ", sexo: " + paciente.getSexo() + ", edad: " + paciente.getEdad()
				+ ", motivo de consulta: " + paciente.getMotivoConsulta();
		return "ok";
	}

	@Action(value = "modificarPaciente", results = { @Result(name = "ok", location = "/modificar.jsp") })
	public String modificarPaciente() {
		PacienteDao pacienteDao = new PacienteDao();
		pacienteDao.modificar(this.getPaciente());
		resultado = "Paciente modificado: codigo paciente: " + paciente.getCodigo() + ", nombre: "
				+ paciente.getCuidadorResponsableBean().getNombre() + ", celular: "
				+ paciente.getCuidadorResponsableBean().getCelular() + ", domicilio: "
				+ paciente.getCuidadorResponsableBean().getDomicilio() + ", telefono: "
				+ paciente.getCuidadorResponsableBean().getTelefono() + ", paciente: " + paciente.getPaciente()
				+ ", especie: " + paciente.getEspecie() + ", raza: " + paciente.getRaza() + ", color: "
				+ paciente.getColor() + ", sexo: " + paciente.getSexo() + ", edad: " + paciente.getEdad()
				+ ", motivo de consulta: " + paciente.getMotivoConsulta();
		return "ok";
	}

	@Action(value = "buscarPaciente", results = { @Result(name = "ok", location = "/buscar.jsp") })
	public String buscarPaciente() {
		PacienteDao pacienteDao = new PacienteDao();
		this.listaPacientes = pacienteDao.buscar(Integer.parseInt(this.getBusqueda()));
		resultado = "Resultados de pacientes del codigo " + this.getBusqueda() + " es : " + this.listaPacientes.size()
				+ " resultados";
		return "ok";
	}

	@Action(value = "eliminarPaciente", results = { @Result(name = "ok", location = "/eliminar.jsp") })
	public String eliminarPaciente() {
		PacienteDao pacienteDao = new PacienteDao();
		pacienteDao.eliminar(paciente.getCodigo());
		resultado = "Se elimino el paciente del codigo: " + paciente.getCodigo();
		return "ok";
	}
}
