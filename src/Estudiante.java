import java.util.ArrayList;
import java.util.Date;

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
}
