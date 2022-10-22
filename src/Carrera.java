import java.util.ArrayList;
import java.util.function.IntFunction;

public class Carrera extends ArrayList<Carrera> {

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

    public void crearCarrera(){
        System.out.println("Usted ha elegido crear carrera");
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return super.toArray(generator);
    }
}
