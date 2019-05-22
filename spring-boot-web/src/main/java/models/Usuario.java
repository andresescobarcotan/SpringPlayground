package models;

public class Usuario {

	private String apellido;
	private String email;
	private String nombre;
	public Usuario() {
		
		// TODO Auto-generated constructor stub
	}
	public Usuario(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public String getApellido() {
		return apellido;
	}
	public String getEmail() {
		return email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
