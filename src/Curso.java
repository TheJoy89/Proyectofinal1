import java.security.PublicKey;
import java.util.Scanner;

public class Curso {

    private String nombre;
    private Carrera carrera;
    private int creditos;
    private Profesor profesor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Curso(String nombre, Carrera carrera, int creditos, Profesor profesor) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    public  static int menuCurso(){
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Elija una de las siguientes opciones");
        System.out.println("-------------------------\n");
        System.out.println("1 - Crear Curso");
        System.out.println("2 - Modificar Curso");
        System.out.println("3 - Eliminar Curso");
        System.out.println("4 - Visualizar Curso");
        selection = input.nextInt();
        return selection;
    }

    public  static void subMenuModificacionesPorCategoria(Integer selection){
        switch (selection) {
            case 1:
                crearCurso();
                break;
            case 2:
                moldificarCurso();
                break;
            case 3:
                eliminarCurso();
                break;
            case 4:
                visualizarCurso();
                break;
            default:
                break;
            // The user input an unexpected choice.
        }
    }

    private static void crearCurso(){
        System.out.println("Usted ha elegido crear Curso");
    }
    private static void moldificarCurso(){
        System.out.println("Usted ha elegido modificar Curso");
    }
    private static void eliminarCurso(){
        System.out.println("Usted ha elegido eliminar Curso");
    }
    private static void visualizarCurso(){
        System.out.println("Usted ha elegido visualizar Curso");
    }
}


