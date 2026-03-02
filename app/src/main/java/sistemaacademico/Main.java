package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    static ArrayList<Nota> notas = new ArrayList<>();
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Sistema funcionando");
    }
    // CREATE - Registrar asignatura
public static void registrarAsignatura() {
    System.out.println("\n--- REGISTRAR ASIGNATURA ---");
    
    System.out.print("Código: ");
    String codigo = sc.nextLine();
    
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();
    
    System.out.print("Créditos: ");
    int creditos = sc.nextInt();
    sc.nextLine(); // limpiar buffer
    
    Asignatura a = new Asignatura(codigo, nombre, creditos);
    asignaturas.add(a);
    
    System.out.println("Asignatura registrada correctamente.");
}
// READ - Listar asignaturas
public static void listarAsignaturas() {
    System.out.println("\n--- LISTA DE ASIGNATURAS ---");
    
    if (asignaturas.isEmpty()) {
        System.out.println("No hay asignaturas registradas.");
        return;
    }
    
    for (Asignatura a : asignaturas) {
        System.out.println(a);
    }
}
// READ - Buscar asignatura por código
public static void buscarAsignatura() {
    System.out.println("\n--- BUSCAR ASIGNATURA ---");
    
    System.out.print("Código de la asignatura: ");
    String codigo = sc.nextLine();
    
    for (Asignatura a : asignaturas) {
        if (a.getCodigo().equals(codigo)) {
            System.out.println("Asignatura encontrada:");
            System.out.println(a);
            return;
        }
    }
    
    System.out.println("No se encontró asignatura con código: " + codigo);
}
// UPDATE - Actualizar asignatura
public static void actualizarAsignatura() {
    System.out.println("\n--- ACTUALIZAR ASIGNATURA ---");
    
    System.out.print("Código de la asignatura a actualizar: ");
    String codigo = sc.nextLine();
    
    for (Asignatura a : asignaturas) {
        if (a.getCodigo().equals(codigo)) {
            System.out.print("Nuevo nombre: ");
            a.setNombre(sc.nextLine());
            
            System.out.print("Nuevos créditos: ");
            a.setCreditos(sc.nextInt());
            sc.nextLine();
            
            System.out.println("Asignatura actualizada.");
            return;
        }
    }
    
    System.out.println("No se encontró asignatura con código: " + codigo);
}
// DELETE - Eliminar asignatura
public static void eliminarAsignatura() {
    System.out.println("\n--- ELIMINAR ASIGNATURA ---");
    
    System.out.print("Código de la asignatura a eliminar: ");
    String codigo = sc.nextLine();
    
    for (int i = 0; i < asignaturas.size(); i++) {
        if (asignaturas.get(i).getCodigo().equals(codigo)) {
            asignaturas.remove(i);
            System.out.println("Asignatura eliminada.");
            return;
        }
    }
    
    System.out.println("No se encontró asignatura con código: " + codigo);
}
}