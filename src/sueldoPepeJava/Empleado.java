package sueldoPepeJava;

public class Empleado {
	private Categoria categoria;
	
	public Empleado(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public int sueldo() {
		return categoria.sueldoNeto();
	}
}
