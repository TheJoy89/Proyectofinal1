import java.util.ArrayList;

public class Profesor extends Persona {


    private String idEmpleado;
    private ArrayList<Carrera> carreras = new ArrayList<>();

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public Profesor(String identificacion, String nombre, String fechaNacimiento, String idEmpleado, ArrayList<Carrera> carreras) {
        super(identificacion, nombre, fechaNacimiento);
        this.idEmpleado = idEmpleado;
        this.carreras = carreras;
    }
}
