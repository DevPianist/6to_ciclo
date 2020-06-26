package bean;

public class PacienteBean {

	public PacienteBean() {

	}

	private int codigo;
	private String paciente;
	private String especie;
	private String raza;
	private String color;
	private String sexo;
	private int edad;
	private String motivoConsulta;
	private CuidadorResponsableBean cuidadorResponsableBean;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}

	public CuidadorResponsableBean getCuidadorResponsableBean() {
		return cuidadorResponsableBean;
	}

	public void setCuidadorResponsableBean(CuidadorResponsableBean cuidadorResponsableBean) {
		this.cuidadorResponsableBean = cuidadorResponsableBean;
	}

}
