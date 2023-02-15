package ProgramaGestionMatriculas;

import java.util.Date;

public class Matricula {
	
	private int codigo;
	private Date fechaMatriculacion;
	private int importe;
	private Date añoCurso;
	
	public Matricula (int co, Date f, int i, Date a) {
		codigo=co;
		fechaMatriculacion=f;
		importe=i;
		añoCurso=a;
	}
}
