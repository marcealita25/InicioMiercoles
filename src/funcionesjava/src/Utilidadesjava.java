

import java.util.Scanner;

public class Utilidadesjava {

    public static int pideDatoNumerico(String texto) {
	 
	System.out.println(texto);
	 
	 Scanner scan = new Scanner(System.in);
	 
	 int numero = scan.nextInt();
	 
	 return numero;
	 
	 }
	public static String pideDatoCadena(String texto) {
		
		System.out.println(texto);
		
		Scanner scan = new Scanner(System.in);
		
		
		
		String cadena = scan.nextLine();
		
		return cadena;
	}
	 
     public static void pintaMenu(String[] menuArray) {

        for (String opcion : menuArray){

            System.out.println(opcion);
        }
        System.out.println("Introduce una opcion");
        
     }
     

     public static void pintaMenu(String[] menuArray, String texto) {

        for (String opcion : menuArray){

            System.out.println(opcion);
        }
        System.out.println("texto");



    }



}






