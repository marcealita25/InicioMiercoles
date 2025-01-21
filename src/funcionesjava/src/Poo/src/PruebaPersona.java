package Poo.src;
public class PruebaPersona {    
public static void main(String[] args) {
    
    
    Persona persona0  = new Persona();//LAMADA AL CONSTRUCTOR POR DEFECTO

    
    
    System.out.println(persona0.getPeso());
    System.out.println(persona0.getNombre());
    persona0.correr();
    persona0.setNombre("Nombre1");
    persona0.setPeso(70.5);
    System.out.println(persona0.getPeso());
    System.out.println(persona0.getNombre());

    Persona persona1 = new Persona();
    persona1.setNombre("Nombre2");
    persona1 = persona0;
    persona1.correr();
    persona0.setNombre ("Nombre3");
    System.out.println(persona1.getNombre());
    System.out.println(persona0.getNombre());

    Persona persona2 = new Persona();
    persona2.setNombre("Nombre4");
    persona2 = persona0;
    persona2.correr();
    persona0.setNombre("Nombre5");
    System.out.println(persona2.getNombre());
    System.out.println(persona0.getNombre());
            

}
}
