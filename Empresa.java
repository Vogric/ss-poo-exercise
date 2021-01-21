package ss_exercise;

import java.util.ArrayList;

public class Empresa {
  
  private int id;
  private String nombre;
  private ArrayList<Empleado> empleados;
    
    
  public Empresa (int id, String nombre) {
    
    this.id = id;
    this.nombre = nombre;
    this.empleados = new ArrayList<Empleado>();
    
  }
  
  public int getId() {
    
		return this.id;
	}

	public String getNombre() {
      
		return this.nombre;
	}
  
  //Agregar empleados
  
  public void agregarEmpleado(Empleado e) {
	  
	  this.empleados.add(e);
  }
  
  //obtener un listado de todos los Empleados
  public ArrayList<Empleado> obtenerTodosLosEmpleados() {
    
    ArrayList<Empleado> Listado = new ArrayList<>();
    Listado.addAll(empleados);
    
    return Listado;
  }
  
  //buscar por Id y obtener un Empleado
  
  public Empleado buscarEmpleadoPorId(CriterioDeBusqueda porId) {
    
    Empleado e = null;
    
    for( int i = 0 ; i < empleados.size() ; i++ ) {
      
      if(porId.cumple(empleados.get(i))) {
        
        e = empleados.get(i);
        
      } 
      
    }
    
    return e;
    
  }
  
  //obtener el promedio de edad de los empleados
  
  public double promedioEdadEmpleados() {
    
    int suma = 0;
    
    for (Empleado e : this.empleados) {
      
      suma += e.getEdad();
      
    }
    
    return suma / empleados.size(); 
      
  }
  
}


