import java.util.Date;
import java.util.Scanner;

public class Main {


    public static int  menuPrincipal(){
        int selection;
        Scanner input = new Scanner(System.in);
        /***************************************************/
        System.out.println("Elija una de estas opciones");
        System.out.println("-------------------------\n");
        System.out.println("1 - Curso");
        System.out.println("2 - Carrera");
        System.out.println("3 - Profesor");
        System.out.println("4 - Estudiante");
        System.out.println("5 - Salir");

        selection = input.nextInt();
        return selection;
    }

    public static void subMenuFromClasses(Integer selection){
        Date date = new Date();
        Profesor profesor = new Profesor("PRFSR-0001", "Oscar Acuña", date,  "ID-00001");
        Carrera carrera = new Carrera("Programacion", profesor);
        Curso curso = new Curso("Intrduccion a la programacion", carrera, 1, profesor);
        Estudiante estudiante = new Estudiante("EST-001", "Joyner Vicktor", date, "CRNT-0000", carrera, curso);

        switch (selection) {
            case 1:
                Curso.subMenuModificacionesPorCategoria(Curso.menuCurso());
            case 2:
                Carrera.subMenuModificacionesPorCategoria(Carrera.menuCarrera());
            case 3:
                Profesor.subMenuModificacionesPorCategoria(Profesor.menuProfesor());
            case 4:
                Estudiante.subMenuModificacionesPorCategoria(Estudiante.menuEstudiante());
            case 5:
                System.out.println("Adios!");
            default:
                break;
        }
//        return null;
    }


    public static void main(String[] args) {
        subMenuFromClasses(menuPrincipal());
    }
}