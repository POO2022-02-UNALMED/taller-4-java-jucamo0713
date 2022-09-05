package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	private String nombre;
	
	private  Tipo(int codigo) {
		this.codigo = codigo;
		this.nombre = this.name();
	}
}
