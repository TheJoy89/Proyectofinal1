import java.util.ArrayList;

class Estudiante extends Persona {

    private String carnet;
    private ArrayList<Carrera> carreras = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public Estudiante(String identificacion, String nombre, String fechaNacimiento, String carnet, ArrayList<Carrera> carreras, ArrayList<Curso> cursos) {
        super(identificacion, nombre, fechaNacimiento);
        this.carnet = carnet;
        this.carreras = carreras;
        this.cursos = cursos;
    }
}
