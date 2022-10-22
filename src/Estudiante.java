import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Estudiante extends Persona {

    private String carnet;
    private Carrera carreras;
    private Curso cursos;

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(Carrera carreras) {
        this.carreras = carreras;
    }

    public Curso getCursos() {
        return cursos;
    }

    public void setCursos(Curso cursos) {
        this.cursos = cursos;
    }

    public Estudiante(String identificacion, String nombre, Date fechaNacimiento, String carnet, Carrera carreras, Curso cursos) {
        super(identificacion, nombre, fechaNacimiento);
        this.carnet = carnet;
        this.carreras = carreras;
        this.cursos = cursos;
    }

    public  static int menuEstudiante(){
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Elija una de las siguientes opciones");
        System.out.println("-------------------------\n");
        System.out.println("1 - Crear Estudiante");
        System.out.println("2 - Modificar Estudiante");
        System.out.println("3 - Eliminar Estudiante");
        System.out.println("4 - Visualizar Estudiante");
        selection = input.nextInt();
        return selection;
    }

    public  static void subMenuModificacionesPorCategoria(Integer selection){
        switch (selection) {
            case 1:
                crearEstudiante();
                break;
            case 2:
                moldificarEstudiante();
                break;
            case 3:
                eliminarEstudiante();
                break;
            case 4:
                visualizarEstudiante();
                break;
            default:
                break;
        }
    }

    private static void crearEstudiante(){
        System.out.println("Usted ha elegido crear Estudiante");
    }
    private static void moldificarEstudiante(){
        System.out.println("Usted ha elegido modificar Estudiante");
    }
    private static void eliminarEstudiante(){
        System.out.println("Usted ha elegido eliminar Estudiante");
    }
    private static void visualizarEstudiante(){
        System.out.println("Usted ha elegido visualizar Estudiante");
    }
}
