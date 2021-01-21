package ss_exercise;

class Empleado {
	  
	  private int id;
	  private String nombre;
	  private String apellido;
	  private int edad;
	    
	    
	  public Empleado (int id, String nombre, String apellido, int edad) {
	    this.id = id;
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.edad = edad;
	    
	  }
	  
	  public int getId() {
			return this.id;
		}

		public String getNombre() {
			return this.nombre;
		}
	  
	  public String getApellido() {
			return this.apellido;
		}
	  
	  public int getEdad() {
			return this.edad;
		}
	  
}
