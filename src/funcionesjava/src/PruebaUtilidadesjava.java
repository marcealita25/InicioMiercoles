

import org.omg.Messaging.SyncScopeHelper;

public class PruebaUtilidadesjava {
	
	public static void main(String[] args) {
		
		int edad = Utilidadesjava.pideDatoNumerico("Introduce tu edad");
		
		int opcion= Utilidadesjava.pideDatoNumerico("Introduce una opcion");
		
		int anio = Utilidadesjava.pideDatoNumerico("Introduce tu año de nacimiento");
        
        String nombre = Utilidadesjava.pideDatoCadena("Introduce tu nombre");
        
        System.out.println(nombre.toUpperCase());


        String [] opcionesMenu = {"1.- opcion 1", "2. opcion 2"};
        Utilidadesjava.pintaMenu(opcionesMenu);

	       
    }

}
