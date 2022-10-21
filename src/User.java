public class User {


    private String id;
    private String name;
    private String fechaNacimiento;

     public User User(String Id, String Name, String fecha){
         this.id = Id;
         this.name = Name;
         this.fechaNacimiento = fecha;
         return null;
     }

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
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
