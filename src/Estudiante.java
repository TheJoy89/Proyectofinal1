 class Estudiante extends Persona {

    private String studentId;
    private String carrera;
    private String curso;


     Estudiante(java.lang.String Id, java.lang.String Name, java.lang.String fecha) {
         super(Id, Name, fecha);
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


     public String getCurso() {
         return curso;
     }

     public void setCurso(String curso) {
        this.curso = curso;
    }


}
