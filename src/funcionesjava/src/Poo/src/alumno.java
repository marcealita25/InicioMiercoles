package Poo.src;

public class Alumno {
    private String nombre;
    private  String apellidos;
    private  int edad;
    private String email;
    private String []asignaturas ;
    private double notamedia;

    public Alumno(String nombre, String apellidos, int edad, String email, double notamedia){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
         this.notamedia = notamedia;
    }

      
    public  Alumno(String nombre, String apellidos, int edad, String email, String [] asignaturas, double notamedia){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.asignaturas = asignaturas;
        this.notamedia = notamedia;
    }

    


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


    public int getEdad() {
        return edad;
    }
    
    public  void setEdad(int edad){
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAsignaturas(String[] asignaturas) {      
        this.asignaturas = asignaturas; 
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public double getNotamedia() {
        return notamedia;
    }


    public void notamedia(double notamedia) {
        this.notamedia = notamedia;
        System.out.println("La nota media es :  " + notamedia);

        if (notamedia==0){
            System.out.println("No estudia nada");
        }else if (notamedia<5){
            System.out.println("Estudia muy poco");
        }else if (notamedia<7){
            System.out.println("Buen estudiante");
        }else if (notamedia==10){
            System.out.println("Es bueno"); 
        }else{
            System.out.println("Es un genio");
        }
        

        }
    

}



}
