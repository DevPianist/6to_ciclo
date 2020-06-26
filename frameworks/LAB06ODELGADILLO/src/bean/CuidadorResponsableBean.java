package bean;

public class CuidadorResponsableBean {
	public CuidadorResponsableBean() {
	}

	private int codigo;
	private String nombre;
	private String domicilio;
	private int telefono;
	private int celular;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}
}
