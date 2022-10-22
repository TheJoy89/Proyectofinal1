import java.security.PublicKey;

public class Curso {

    private String nombre;
    private Carrera carrera;
    private int creditos;
    private Profesor profesor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Curso(String nombre, Carrera carrera, int creditos, Profesor profesor) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.creditos = creditos;
        this.profesor = profesor;
    }
}


