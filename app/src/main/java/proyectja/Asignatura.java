package proyectja;
import java.util.ArrayList;

public class Asignatura {
    private String codigo;
    private String nombre;
    private int creditos;
    private String Docente;

    //Constructor
    public Asignatura(String codigo, String nombre, int creditos, String Docente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.Docente = Docente;
    }

    //getter y setter
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getDocente() {
        return Docente;
    }

    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setDocente(String docente) {
        this.Docente = docente;
    }

    //toString
    @Override
    public String toString() { 
        return "Asignatura {" +
                "\n  Código   : " + codigo +
                "\n  Nombre   : " + nombre +
                "\n  Créditos : " + creditos +
                "\n  Docente  : " + Docente +
                "\n}";
    }

    //RegistrarAsig
    class RegisAsig {

        private ArrayList<Asignatura> lista = new ArrayList<>();
        
        public void registrarAsignatura(Asignatura asignatura) {
            lista.add(asignatura);
            lista.add(new Asignatura(codigo, nombre, creditos, Docente));
            System.out.println("Asignatura registrada: " + asignatura.getNombre());
        }

        public void listarAsig() {
            if (lista.isEmpty()) {
                System.out.println("No se encuentran asignaturas registradas.");
                return;
            }
            System.out.println("Lista de asignaturas registradas:");
            for (Asignatura a : lista) {
                System.out.println(a);
            }
        }

        public Asignatura buscarAsignatura(String codigo) {
            for (Asignatura a : lista) {
                if (a.getCodigo().equals(codigo)) {
                    return a;
                }
            }
            System.out.println("No se encontro una asignatura con código: " + codigo);
            return null;
        }
    }

}