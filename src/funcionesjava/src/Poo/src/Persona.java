package Poo.src;
public class Persona {
    //VARIABLES DE INSTANCIA
    private String nombre;
    private  String apellidos;
    private String dni;
    private double peso;
    
    //GETTERS Y SETTERS
    public String getNombre(){
        return nombre;
    }   
    


    public void setNombre(String nombre){
        this.nombre = nombre;
    }



    public String getApellidos() {
        return apellidos;
    }



    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    public String getDni() {
        return dni;
    }



    public void setDni(String dni) {
        this.dni = dni;
    }



    public double getPeso() {
        return peso;
    }



    public void setPeso(double peso) {
        this.peso = peso;
    }

     public void correr(){
        System.out.println("La persona" + nombre + "está corriendo");
        if (peso<50){
            System.out.println("muy rapido");
        }else if (peso<70){
            System.out.println("rapido");
        }else if (peso<100){
            System.out.println("lento");
        }else{
            System.out.println("muy lento");

            
        }
        }
}
