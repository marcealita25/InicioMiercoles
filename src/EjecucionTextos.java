import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class EjecucionTextos {

    public static void main(String[] args) {
        
        String texto = "1234";
        int suma = 0;

        for (int i =0; i < texto.length();i++){

            char letra = texto.charAt(i);
            String temporal = String.valueOf(letra);

            int numero = Integer.parseInt(temporal);
            suma += numero;
            

            System.out.println("lA SUMA DE " + texto + "es" + suma);

        }
    }

}
