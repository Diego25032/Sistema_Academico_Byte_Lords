
package proyectja;

//atributos
public class Estudiante {
    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private int semestre;

    //Constructor
    public Estudiante(String codigo, String nombre, String apellido, int edad, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
    }

    //getter y setter
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    //toString
    @Override
    public String toString() {
        return "Estudiante {" +
                "\n  Código    : " + codigo +
                "\n  Nombre    : " + nombre +
                "\n  Apellido  : " + apellido +
                "\n  Edad      : " + edad +
                "\n  Semestre  : " + semestre +
                "\n}";
    }

}