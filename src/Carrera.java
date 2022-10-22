import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.IntFunction;

public class Carrera extends ArrayList<Carrera> {

    String nombre;
    Profesor director;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getDirector() {
        return director;
    }

    public void setDirector(Profesor director) {
        this.director = director;
    }

    public Carrera(String nombre, Profesor director) {
        this.nombre = nombre;
        this.director = director;
    }

    public  static int menuCarrera(){
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Elija una de las siguientes opciones");
        System.out.println("-------------------------\n");
        System.out.println("1 - Crear Carrera");
        System.out.println("2 - Modificar Carrera");
        System.out.println("3 - Eliminar Carrera");
        System.out.println("4 - Visualizar Carrera");
        selection = input.nextInt();
        return selection;
    }

    public  static void subMenuModificacionesPorCategoria(Integer selection){
        switch (selection) {
            case 1:
                crearCarrera();
                break;
            case 2:
                moldificarCarrera();
                break;
            case 3:
                eliminarCarrera();
                break;
            case 4:
                visualizarCarrera();
                break;
            default:
                break;
            // The user input an unexpected choice.
        }
    }

    private static void crearCarrera(){
        System.out.println("Usted ha elegido crear Carrera");
    }
    private static void moldificarCarrera(){
        System.out.println("Usted ha elegido modificar Carrera");
    }
    private static void eliminarCarrera(){
        System.out.println("Usted ha elegido eliminar Carrera");
    }
    private static void visualizarCarrera(){
        System.out.println("Usted ha elegido visualizar Carrera");
    }
}
