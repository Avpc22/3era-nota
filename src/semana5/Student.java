package semana5;

public class Student {
   
    public String nombre ;
    public int edad;
    public String curso ;



    public void RegistrarEstudiante(String nombre, int edad, String curso ){

        this.nombre= nombre ;
        this.edad= edad;
        this.curso=curso;
        
        System.out.println("nombre del estudiante "+nombre+"edad"+edad+"curso"+curso);

    }

    public void Entrainformacion(){
        System.out.println("nombre"+nombre);
        System.out.println("edad"+edad);
        System.out.println("curso"+curso);
    }

}

