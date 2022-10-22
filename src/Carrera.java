public class Carrera {

    String nombre;
    Profesor director;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getDirector() {
        return director;
    }

    public void setDirector(Profesor director) {
        this.director = director;
    }

    public Carrera(String nombre, Profesor director) {
        this.nombre = nombre;
        this.director = director;
    }
}
