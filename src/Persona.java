public class Persona {

    private String id;
    private String name;
    private String fechaNacimiento;

<<<<<<< Updated upstream
=======
    public Persona(String id, String name, String fecha) {
    }

    public Persona User(String Id, String Name, String fecha){
         this.id = Id;
         this.name = Name;
         this.fechaNacimiento = fecha;
         return null;
     }

>>>>>>> Stashed changes
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String id, String name, String fechaNacimiento) {
        this.id = id;
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
    }
}
