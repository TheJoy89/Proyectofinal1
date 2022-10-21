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

    public  static int subMenuOpciones(String opcionPrincipalElegida){
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Elija una de las siguientes opciones");
        System.out.println("-------------------------\n");
        System.out.println("1 - Crear " + opcionPrincipalElegida);
        System.out.println("2 - Modificar " + opcionPrincipalElegida);
        System.out.println("3 - Eliminar " + opcionPrincipalElegida);
        System.out.println("4 - Visualizar "  + opcionPrincipalElegida);
        System.out.println("5 - Volver al menu principal");
        selection = input.nextInt();
        return selection;
    }

    public  static void subMenu(Integer selection){
        switch (selection) {
            case 1:
                subMenuOpciones("Curso");
                break;
            case 2:
                subMenuOpciones("Carrera");
                break;
            case 3:
                subMenuOpciones("Profesor");
                break;
            case 4:
                subMenuOpciones("Estudiante");
                break;
            case 5:
                System.out.println("Adios!");
                break;
            default:
                // The user input an unexpected choice.
        }
    }


        public static void main(String[] args) {
//        menuPrincipal();
        subMenu(menuPrincipal());
    }
}