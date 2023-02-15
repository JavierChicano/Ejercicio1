package ProgramaGestionMatriculas;

public class Persona {

	private String DNI;
	private String nombre;
	private String direccion;
	private String estadoCivil;
	
	public Persona (String d, String n, String di, String e) {
		DNI=d;
		nombre=n;
		direccion=di;
		estadoCivil=e;
	}
	public String getNombre() {
		return nombre;
	}
}
