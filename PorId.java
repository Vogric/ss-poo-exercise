package ss_exercise;

public class PorId extends CriterioDeBusqueda {
	
	private int id;
	
	public PorId(int id) {
		this.id = id;
	}

	public boolean cumple(Empleado empleado) {
		return empleado.getId() == this.id;
	}
}
