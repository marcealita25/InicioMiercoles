package Poo.src;

public class ClaseInstituto {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("N1", "A1", 20, "eggdg@hgffgfh.es", 8.5);

        Alumno alumno2= new Alumno("N2","B2", null, 0, null, 0)
        String  [] asignaturasAlumno2 = {"Lengua", "Ingles", "Historia"};
    

       
       
        alumno2.setAsignaturas(asignaturasAlumno2);
        String []asignaturaAlumnos3 ={"Fisica", "Quimica", "Matematica"};
        Alumno alumno3 = Alumno("N1", "A2", 24,2.5, "eacdjf@gdghejk.es", asignaturaAlumnos3);

        Alumno alumno4 new alumno();
        alumno4.setnombre("N4");
        alumno4.setApellido("A4");
        alumno4.setEdad(20);
        alumno4.setEmail("hgdfgh@jhgfdhjgfg.es");
        alumno4.setNotaMedia(8,5);
        alumno4.setAsignaturas(new String []{"Fisica","Quimica"});
        Alumno [] alumno = {alumno1,alumno2,alumno3,alumno4};

        for (int i=0;i<alumnos.lenght; i++){
            Alumno alumno = alumno [i];
        
            System.out.println(alumno.getNombre());
            alumno.estudiar();

            String []asigns =alumno.getAsignaturas();
            for (String asignatura : asigns) {
                System.out.println("\t+asignatura");
            }
        }

        


        

        




    }
}