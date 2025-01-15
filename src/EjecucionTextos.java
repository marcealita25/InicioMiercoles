import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class EjecucionTextos {

    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un texto numerico");
        String texto = teclado.nextLine();
        int suma = JuegosTexto.getSumaTexto(texto);

        System.out.println("La suma de " + texto + " es: " + suma);*/
        

        

        String isbn = "8441513929";

        int sumaisbn = 0;

        int cantNum = 11;

        for (int i =0; i < isbn.length();i++){

        char letra = isbn.charAt(i);
        String temporal = String.valueOf(letra);

        int numero = Integer.parseInt(temporal);
        int posicion = i + 1;
        

        int numMulti = numero * posicion;
        
        sumaisbn += numMulti;

    

        
        }
      
        System.out.println("Suma total "+sumaisbn);

        if((sumaisbn/cantNum)%2==0){
            System.out.println("Perfecto");

        }else{
            System.out.println("Incorrecto");
        }
    }   
}
