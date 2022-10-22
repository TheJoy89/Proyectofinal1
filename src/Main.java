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


    public  static String subMenuOpcionesEspecificas(Integer selection){
        switch (selection) {
            case 1:
                return "Curso";
            case 2:
                return "Carrera";
            case 3:
                return "Profesor";
            case 4:
                return "Estudiante";
            case 5:
                System.out.println("Adios!");
                break;
            default:
        }
        return null;
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

    public  static int subMenuModificacionesPorCategoria(Integer selection, String accion){
        switch (selection) {
            case 1:
                System.out.println("Usted ha elegido crear " + accion);
                break;
            case 2:
                System.out.println("Usted ha elegido modificar " + accion);
                break;
            case 3:
                System.out.println("Usted ha elegido eliminar " + accion);
                break;
            case 4:
                System.out.println("Usted ha elegido visualizar " + accion);
                break;
            case 5:
                System.out.println("Adios!");
                break;
            default:
                break;
            // The user input an unexpected choice.
        }
        return 0;
    }

//    public  static void MenuEspecificoDeAccionesSecundarias(Integer selection, String accion){
//        switch (selection) {
//            case 1:
//                System.out.println("Usted ha elegido crear " + accion);
//                break;
//            case 2:
//                System.out.println("Usted ha elegido modificar " + accion);
//                break;
//            case 3:
//                System.out.println("Usted ha elegido eliminar " + accion);
//                break;
//            case 4:
//                System.out.println("Usted ha elegido visualizar " + accion);
//                break;
//            case 5:
//                System.out.println("Adios!");
//                break;
//            default:
//                // The user input an unexpected choice.
//        }
//    }





    public static void main(String[] args) {

        Integer seleccionMenuPrincipal = menuPrincipal();
        String seleccionMenuEspecifico =  subMenuOpcionesEspecificas(seleccionMenuPrincipal);
        Integer seleccionDeSubMenuOpciones = subMenuOpciones(seleccionMenuEspecifico);

        subMenuModificacionesPorCategoria(seleccionDeSubMenuOpciones, seleccionMenuEspecifico);
    }
}