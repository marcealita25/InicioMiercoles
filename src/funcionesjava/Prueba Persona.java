package es. cursojava.poo;

import java.util.Scanner;

public class PruebaPersona {

   // VARIABLES DE INSTANCIA  
    public static void main(String[] args) {
        Persona persona0 = new Persona(); //LLAMADA AL CONSTRUCTOR POR DEFECTO

        System.out.println(persona0.peso);

        System.out.println(persona0.nombre);

      persona0.nombre = "Nombre1";

        persona0.peso = 70.5;  
        
        System.out.println(persona0.peso);

        System.out.println(persona0.nombre);

        Persona persona1 = new Persona("Nombre2", 80.5); 





    }
    
}
