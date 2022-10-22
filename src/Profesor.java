import java.util.Date;
import java.util.Scanner;

public class Profesor extends Persona {


    private String idEmpleado;

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Profesor(String identificacion, String nombre, Date fechaNacimiento, String idEmpleado) {
        super(identificacion, nombre, fechaNacimiento);
        this.idEmpleado = idEmpleado;
    }

    public  static int menuProfesor(){
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Elija una de las siguientes opciones");
        System.out.println("-------------------------\n");
        System.out.println("1 - Crear Profesor");
        System.out.println("2 - Modificar Profesor");
        System.out.println("3 - Eliminar Profesor");
        System.out.println("4 - Visualizar Profesor");
        selection = input.nextInt();
        return selection;
    }

    public  static void subMenuModificacionesPorCategoria(Integer selection){
        switch (selection) {
            case 1:
                crearProfesor();
                break;
            case 2:
                moldificarProfesor();
                break;
            case 3:
                eliminarProfesor();
                break;
            case 4:
                visualizarProfesor();
                break;
            default:
                break;
            // The user input an unexpected choice.
        }
    }

    private static void crearProfesor(){
        System.out.println("Usted ha elegido crear Profesor");
    }
    private static void moldificarProfesor(){
        System.out.println("Usted ha elegido modificar Profesor");
    }
    private static void eliminarProfesor(){
        System.out.println("Usted ha elegido eliminar Profesor");
    }
    private static void visualizarProfesor(){
        System.out.println("Usted ha elegido visualizar Profesor");
    }

}
