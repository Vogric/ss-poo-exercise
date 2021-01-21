package ss_exercise;

public class Main {
	
	  public static void main(String[] args) {
	    
	   Empresa empresa1 = new Empresa( 1, "SS" );

	   Empleado empleado1 = new Programador( 1, "Braian", "Vogric", 25, "php");
	   Empleado empleado2 = new Diseniador( 2, "Leonel", "Torres", 35, "Web");
	   Empleado empleado3 = new Programador( 3, "Joaquin", "Perez", 55, "php");
	   	    
	   empresa1.agregarEmpleado(empleado1);
	   empresa1.agregarEmpleado(empleado2);
	   empresa1.agregarEmpleado(empleado3);
	    
	   System.out.println(empresa1.obtenerTodosLosEmpleados());
	   
	   System.out.println("\nPromedio edad empleados: "+ empresa1.promedioEdadEmpleados());
	   
	   CriterioDeBusqueda criterio = new PorId(1);
	   System.out.println("\nEmpleado segun id: "+ empresa1.buscarEmpleadoPorId(criterio));
	   
	  }
}


