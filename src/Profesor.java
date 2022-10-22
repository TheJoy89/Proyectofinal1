import java.util.ArrayList;
import java.util.Date;

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
}
