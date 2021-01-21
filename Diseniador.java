package ss_exercise;

class Diseniador extends Empleado{
	  
 	private String tipoDeDiseniador;
  	
  	public Diseniador(int id,String nombre,String apellido,int edad, String tipoDeDiseniador) {
		
      	super(id, nombre, apellido, edad);
		this.tipoDeDiseniador = tipoDeDiseniador;
  
	}

	public String getTipoDeDiseniador() {
		return this.tipoDeDiseniador;
	}
 }
