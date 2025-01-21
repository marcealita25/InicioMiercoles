

public class Ejercicio8Funciones {

	public static void main(String[] args) {

	int opcion=0;

	
		
		
		String [][] alumnos = new String [2][2];
		
		
		 String [] opciones = {"1. Pedir datos", "2. Mostrar alumnos", "3. Buscar alumnos", "4. Borrar alumnos", "5. Salir"};
		
		
			
			do {	
			    Utilidadesjava.pintaMenu(opciones);

			    opcion = Utilidadesjava.pideDatoNumerico("");
			
			
			switch (opcion) {
				case 1: pedirDatosAlumnos(alumnos); break;

				case 2: mostrarAlumnos (String [][] alumnos);break;
					
				case 3: buscarAlumno(String [][] alumnos);break;
					
					
				case 4: eliminarAlumno(String [][] alumnos);break;
					
				
				
				case 5: System.out.println("Adios!!") ;break;
				default: System.out.println("Opción incorrecta");	
				
			}
			
		}while(opcion!=5);
		
		

	}



	private  static void  pedirDatosAlumnos(String [][] alumnos){

		for (int i = 0; i<alumnos.length; i++) {
			System.out.println("Para el aula " + (i+1));
			for (int j = 0; j<alumnos[i].length; j++) {
				if (alumnos[i][j]==null) {
					
					alumnos[i][j] =Utilidadesjava.pideDatoCadena("Introduce nombre del alumno "+ (j+1));
				}
			}
		}
	}

	private static void mostrarAlumnos(String [][] alumnos){

		for (int i = 0; i<alumnos.length; i++) {
			System.out.println("Para el aula " + (i+1));
			for (int j = 0; j<alumnos[i].length; j++) {
				String nombre = alumnos[i][j];
				System.out.println(nombre==null?"No hay alumno":nombre);
			}
		}
		


	}
	
	private static  void buscarAlumno(String [][] alumnos) {
		System.out.println("Introduce nombre del alumno a buscar");
		
		for (int i = 0; i<alumnos.length; i++) {
			for (int j = 0; j<alumnos[i].length; j++) {
				String nombre = alumnos[i][j];
				if (nombre!=null && nombre.equals(nombreBusqueda)) {
					System.out.println("El alumno "+ nombreBusqueda + 
							" está en el aula "+(i+1));
				}
			}
		}
	}
    
	private static void eliminarAlumno(String [][] alumnos) {
		System.out.println("Introduce nombre del alumno a borrar");
		
		
		boolean existeAlumno = false;
		for (int i = 0; i<alumnos.length; i++) {
			for (int j = 0; j<alumnos[i].length; j++) {
				String nombre = alumnos[i][j];
				if (nombre!=null && nombre.equals(nombreEliminar)) {
					alumnos[i][j]=null;
					existeAlumno = true;
				}
			}
		}
		
		if (!existeAlumno) {
			System.out.println("Alumno no encontrado");
		}
	}

	private  static void Salir(){
		System.out.println("Adios!!") ;
	}

   contador()

	//VAR ARGS
	private static void contador(int ... numeros){
		int suma = 0;
		for (int numero : numeros){
			suma+=numero;
		}
		System.out.println(suma);
}