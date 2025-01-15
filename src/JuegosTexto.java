public class JuegosTexto {
    public static int getSumaTexto(String texto) {

        int suma = 0;

        for (int i =0; i < texto.length();i++){

            char letra = texto.charAt(i);
            String temporal = String.valueOf(letra);

            int numero = Integer.parseInt(temporal);
            suma += numero;

            
            

            

        }

        
        return suma;
        
        
    }

}
