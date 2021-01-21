package ss_exercise;

class Programador extends Empleado{
	 
  	private String lenguajeEnElQuePrograma;
  	
  	public Programador(int id,String nombre,String apellido,int edad, String lenguajeEnElQuePrograma) {
      
		super(id, nombre, apellido, edad);
     	this.lenguajeEnElQuePrograma = lenguajeEnElQuePrograma;
	}

	public String getLenguajeEnElQuePrograma() {
		return this.lenguajeEnElQuePrograma;
	}
 }
