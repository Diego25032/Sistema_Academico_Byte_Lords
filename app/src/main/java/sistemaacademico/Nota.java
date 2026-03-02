package sistemaacademico;


public class Nota {
    private String codigoEstudiante;
    private String codigoAsignatura;
    private double valorNota;
    
    
    public Nota(String codigoEstudiante, String codigoAsignatura, double valorNota) {
        this.codigoEstudiante = codigoEstudiante;
        this.codigoAsignatura = codigoAsignatura;
        this.valorNota = valorNota;
    }
    
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }
    
    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }
    
    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }
    
    public double getValorNota() {
        return valorNota;
    }
    
    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }
}