public class Estudiante extends User {

     private String studentId;
    private String carrera;
   private Boolean curso = true;


  public Estudiante new Carrera = (String StudenId, String carrera, boolean curso) {
      this.studentId = StudenId;
      this.curso = curso;
        this.carrera = carrera;

    }

    public java.lang.String getStudentId() {
        return studentId;
    }

    public void setStudentId(java.lang.String studentId) {
        this.studentId = studentId;
    }

    public java.lang.String getCarrera() {
        return carrera;
    }

    public void setCarrera(java.lang.String carrera) {
        this.carrera = carrera;
    }

    public Boolean getCurso() {
        if(this.curso == true){
            System.out.println(" Curso Virtual");
        } if ()
    }

    public void setCurso(Boolean curso) {
        this.curso = curso;
    }


}
