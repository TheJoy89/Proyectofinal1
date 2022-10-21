import java.util.ArrayList;

public class Profesor extends Persona {


    private String employeeId;

private ArrayList<Carrera> carreras = new ArrayList<>();

    Profesor(String Id, String Name, String fecha, String employeeId) {

        super(Id, Name, fecha);
        this.employeeId = employeeId;
    }
}
